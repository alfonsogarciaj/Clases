let searchInput = $("#search-input").keypress(function (e) {
  if (e.key === "Enter") {
    getCity();
  }
});
let searchBtn = $("#search-btn").click(function (e) {
  getCity();
});

function getCity() {
  apiCall("", "", searchInput.val());
  searchInput.val("");
}

let mapPos = { width: $("#map").width(), height: $("#map").height() };

//Event listener for the click action on the map
$("#map").on("click", (e) => {
  let offset = $("#map").offset();

  mapPos = {
    left: e.pageX - offset.left,
    top: e.pageY - offset.top,
    width: $("#map").width(),
    height: $("#map").height(),
  };

  let clickedCartesian = canvasToCartesian(mapPos);
  apiCall(clickedCartesian.x, clickedCartesian.y, "");
});

/* 
I want to be able to click on the map and retrieve the coordinates of the place clicked.
The issue here is that the coordinates stored on mapPos are for a Canvas system and needs to be converted to Cartesian.
The function below will handle the conversion from canvas (x,y) to cartesian with the 0,0 value in the center.
*/
function canvasToCartesian(mapPos) {
  // cartesianXMax and YMax will define max values for the coordinates.
  const cartesianXMax = 180;
  const cartesianYMax = 90;

  const xCartesian =
    Math.trunc(((mapPos.left / mapPos.width) * 2 - 1) * cartesianXMax * 100) /
    100;
  const yCartesian =
    Math.trunc(
      ((1 - mapPos.top / mapPos.height) * (2 * cartesianYMax) - cartesianYMax) *
        100
    ) / 100;

  return { x: xCartesian, y: yCartesian };
}

//This function will convert a cartesian position to canvas (to be able to position elemnts over the map)
function cartesianToCanvas(cartesianPos) {
  // cartesianXMax and YMax will define max values for the coordinates.
  const cartesianXMax = 180;
  const cartesianYMax = 90;

  const mapX = ((cartesianPos.x / cartesianXMax + 1) / 2) * mapPos.width;
  const mapY =
    (1 - (cartesianPos.y + cartesianYMax) / (2 * cartesianYMax)) *
    mapPos.height;

  return { left: mapX, top: mapY };
}

let data = "";

//Function to call the api, it will allow to be called using longitude and latitude (clicking on the map) aswell as the city name (using the input)
async function apiCall(lon, lat, city) {
  if (city != "") {
    city = `q=${city}`;
  } else {
    lat = `lat=${lat}&`;
    lon = `lon=${lon}`;
  }

  const response = await fetch(
    `https://api.openweathermap.org/data/2.5/forecast?${city}${lat}${lon}&units=metric&appid=3a4de2322437ff13a3b1bafd88b9ee6d&lang=es`
  );
  data = await response.json();
  console.log(data);
  paintData(data);
}

//This function will handle painting the data retrieved from the API on the html

function paintData(data) {
  $("#city-header").html(
    `<i class="fa-solid fa-location-dot"></i> <b>${data.city.name}</b>, ${data.city.country}`
  );
  let cartesianPos = { x: data.city.coord.lon, y: data.city.coord.lat };
  let canvasPos = cartesianToCanvas(cartesianPos);
  $("#location-dot")
    .html(
      '<svg xmlns="http://www.w3.org/2000/svg" height="100%" fill="#EC6E4C" viewBox="0 0 384 512"><path d="M215.7 499.2C267 435 384 279.4 384 192C384 86 298 0 192 0S0 86 0 192c0 87.4 117 243 168.3 307.2c12.3 15.3 35.1 15.3 47.4 0zM192 128a64 64 0 1 1 0 128 64 64 0 1 1 0-128z"/></svg>'
    )
    .css("left", canvasPos.left)
    .css("top", canvasPos.top);

  const weekdays = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  ];

  let prevDay = weekdays[new Date(data.list[0].dt * 1000).getDay()];

  //This chunk of code will empty forecast-container and then create the first card for the selected city
  $("#forecast-container").html("").append(`
    <div id="day-today">
          <div class="today-header">
            <span class="text-medium">${
              weekdays[new Date(data.list[0].dt * 1000).getDay()]
            }</span>
            <span class="text-medium">${new Date(
              new Date().getTime() + data.city.timezone * 1000
            ).getHours()}:${new Date(
    new Date().getTime() + data.city.timezone * 1000
  ).getMinutes()}</span>
          </div>
          <div>
            <div class="data-container">
              <span class="text-big">${Math.floor(
                data.list[0].main.temp
              )}ºC</span>
              <span>Feels like: ${Math.floor(
                data.list[0].main.feels_like
              )}ºC</span>
              <span><i class="fa-solid fa-wind"></i> ${
                data.list[0].wind.speed
              }km/h <i class="fa-solid fa-arrow-up" style="transform: rotate(${
    data.list[0].wind.deg
  }deg);"></i></span>
              <span><i class="fa-solid fa-arrows-down-to-line"></i> ${
                data.list[0].main.pressure
              }hPa</span>
              <span><i class="fa-solid fa-droplet"></i> ${
                data.list[0].main.humidity
              }%</span>
            </div>
            <div class="data-container">
              <img src="https://openweathermap.org/img/wn/${
                data.list[0].weather[0].icon
              }@2x.png" alt="" />
              <span id="today-sunrise"><i class="fa-solid fa-sun"></i> ${new Date(
                (data.city.sunrise + data.city.timezone - 3600) * 1000
              ).getHours()}:${new Date(
    (data.city.sunrise + data.city.timezone - 3600) * 1000
  ).getMinutes()}</span>
              <span id="today-sunset"><i class="fa-solid fa-moon"></i> ${new Date(
                (data.city.sunset + data.city.timezone - 3600) * 1000
              ).getHours()}:${new Date(
    (data.city.sunset + data.city.timezone - 3600) * 1000
  ).getMinutes()}</span>
            </div>
          </div>
        </div>`);

  //this function will go through data.list to fill the rain prediction card for the current day.
  $("article").html("");
  data.list.forEach((element) => {
    let day = weekdays[new Date(element.dt * 1000).getDay()];
    if (day == prevDay) {
      console.log(element.pop);
      $("article").append(`
            <div class="rain-bar-container">
              <div class="rain-bar" style="height: ${
                100 * element.pop
              }%;"></div>
             <span>${new Date(element.dt * 1000).getHours()}:00</span>
            </div>
      `);
      $("#rain-graph > div > div")
        .css("width", `${$("#rain-card").width() - 50}px`)
        .css("height", "1px");
    }
  });

  //this function will go through data.list items and create a new card on the html if the day of the week is different from the previous created
  data.list.forEach((element) => {
    let day = weekdays[new Date(element.dt * 1000).getDay()];
    if (day != prevDay) {
      $("#forecast-container").append(`
            <div class="forecast-days">
              <span>${day}</span>
              <img src="https://openweathermap.org/img/wn/${
                element.weather[0].icon
              }@2x.png" alt="">
              <span>${Math.floor(element.main.temp)}ºC</span>
            </div>
            `);
      prevDay = day;
    }
  });
}

apiCall("", "", "london");
