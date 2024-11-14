let soma = 0

function somar() {
    let number = document.getElementById("number");
    let valor = parseFloat(number.value);

    if (valor == 0) {
        document.getElementById("sumOfNumbers").textContent = 0;
    } else {
        soma += valor;
        document.getElementById("sumOfNumbers").textContent = soma;
        number.value = "";
        number.focus();
    }
}