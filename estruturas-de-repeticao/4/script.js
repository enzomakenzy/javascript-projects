listaDePalavras = []

function exibir() {
    palavra = document.getElementById("palavra").value;
    
    if (palavra != "done") {
        listaDePalavras.push(palavra);
        document.getElementById("palavra").value = "";
        document.getElementById("palavra").focus();
        console.log(listaDePalavras);
    } else {
        document.getElementById("result").textContent = `O total de palavras digitadas foram ${listaDePalavras.length} e as palavras foram: ${listaDePalavras}`;

        listaDePalavras = [];
    }
}