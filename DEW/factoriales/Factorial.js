function Calcularfactorial(n){
    if(n === 0){
        return 1;
    }else{
        return n * Calcularfactorial(n-1);
    }
}

function rellenar(){
    let valor = document.getElementById("valor").value;
    const resultado = Calcularfactorial(parseInt(valor));
    console.log('Factorial de ' + valor + 'es' + resultado);
    document.getElementById('resultado').innerText = 'El factorial de ' + valor + 'es' + resultado;

}