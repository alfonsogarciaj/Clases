function pasarNumeros(){
    let valor1 = document.getElementById("valor1").value;
    let valor2 = document.getElementById("valor2").value;
    const resultadosParrafo = document.getElementById("resultados");

    const resultadoSumaCifras = sumaCifras(parseInt(valor1), parseInt(valor2));

    resultadosParrafo.textContent = "Resultado es: " + resultadoSumaCifras.join(", ");
}

function sumaValor2(valor2) {
    let suma = 0;
    while (valor2 > 0) {
        suma += valor2 % 10;
        valor2 = Math.floor(valor2 / 10);
    }
    return suma;
}

function sumaCifras(valor1, valor2) { 
    const resultados = [];
    for (let i = 1; i <= valor1; i++) {
        let numero = i;
        if (sumaValor2(numero) === valor2) { 
            resultados.push(numero);
        }
    }
    return resultados;
}
