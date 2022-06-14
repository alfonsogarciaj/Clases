const DOM={
    inputnum: document.getElementById("inputnumtabla"),
    btncalcular: document.getElementById("btncalcular"),
    tablaresultado: document.getElementById("tablaresultado"),
    spannumresultado: document.getElementById("spannumresultado")

}


//en el html que llame a esta función se debe pasar como 
//parámetro el evento. Esto es, usar la instrucción: nombrefuncion(event)
//ejemplo: <input type="text" onkeyup="launchenterkey(event)" />
function launchenterkey(evt){

    
    const tecla = evt.key;
    if( tecla == "Enter")
        calcular();

}

/*

DOM.inputnum.addEventListener(
    "keyup", 
    (event)=>{
        const tecla = event.key;
       
        if (tecla == "Enter") {
            // se impide que se desencadene lo que pudiera tener activado por defecto
            event.preventDefault();
            // se desencadena el evento onclick
            DOM.btncalcular.onclick();
        }
    }

);
*/


function calcular(){

    let tablanumero = DOM.inputnum.value;
    DOM.tablaresultado.innerHTML = "";
    DOM.tablaresultado.style.visibility = "visible";
    let elcaption = document.createElement("caption");
    elcaption.innerHTML= "Tabla del: ";
    let elspan = document.createElement("span");
    elspan.id = "spannumresultado";
    elspan.innerHTML = tablanumero;

    elcaption.appendChild(elspan);

    DOM.tablaresultado.appendChild(elcaption);
    for (let i = 1; i < 11; i++) {
       
        let textoTd1 = i + " * " + tablanumero;  
        let textoTd2 = i*tablanumero;

        eltr = document.createElement("tr");
        eltd1 = document.createElement("td");
        eltd1.innerHTML = textoTd1;
        eltr.appendChild(eltd1);

        eltd2 = document.createElement("td");
        eltd2.innerHTML = textoTd2;
        eltr.appendChild(eltd2);  
        
        DOM.tablaresultado.appendChild(eltr);
        
    }
}