function tabla(){
    let buscarTabla = document.querySelector("table");
    if(buscarTabla){
        buscarTabla.remove();
    }
    var body = document.getElementsByTagName("body")[0];
    var tabla = document.createElement("table");
    var tblBody = document.createElement("tbody");
    var i, j;
    let fila = document.getElementById("fila").value;
    let columna = document.getElementById("columna").value;
    let resultado = fila * columna;
    const resultadoFinal = document.getElementById("resultado");
    for (i = 1; i <= fila; i++) {
        var hilera = document.createElement("tr");
        for (j = 1; j <= columna; j++) {
            var celda = document.createElement("td");
            var texto = document.createTextNode("Fila: " + i + ", Columna: " + j);
            celda.appendChild(texto);
            hilera.appendChild(celda);
            resultado --;
        }
        tblBody.appendChild(hilera);
    }
    tabla.appendChild(tblBody);
    body.appendChild(tabla);

    return resultado;    
}