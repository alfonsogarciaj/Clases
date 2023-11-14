document.addEventListener('DOMContentLoaded', function () {
    const consultaButton = document.getElementById('consulta');
    const selectUsers = document.getElementById('select-users');
    const userDetails = document.getElementById('user-details');
    const userData = document.getElementById('user-data');
  
    consultaButton.addEventListener('click', function () {
      if (selectUsers.value === '') {
        fetch('https://jsonplaceholder.typicode.com/users')
          .then((response) => response.json())
          .then((data) => {
            selectUsers.innerHTML = '<option value="">Selecciona un usuario</option>';
            data.forEach((user) => {
              const option = document.createElement('option');
              option.value = user.id;
              option.textContent = user.name;
              selectUsers.appendChild(option);
            });
          })
          .catch((error) => {
            console.error('Error al cargar la lista de usuarios: ', error);
          });
      } else {
        const selectedUserId = selectUsers.value;
        if (selectedUserId) {
          fetch(`https://jsonplaceholder.typicode.com/users/${selectedUserId}`)
            .then((response) => response.json())
            .then((user) => {
              userDetails.style.display = 'block';
              userData.innerHTML = `
                <tr>
                  <td>${user.id}</td>
                  <td>${user.name}</td>
                  <td>${user.username}</td>
                  <td>${user.email}</td>
                </tr>
              `;
            })
            .catch((error) => {
              console.error('Error al cargar los datos del usuario: ', error);
            });
        }
      }
    });
  });
  