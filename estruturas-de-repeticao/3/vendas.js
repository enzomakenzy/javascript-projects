var meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"];

var livrosVendidosMeses = [];
var i = 0

function somar() {
    
    var quantidadeLivroMes = Number.parseInt(document.getElementById("livrosQuantidade").value) || 0;
    
    livrosVendidosMeses[i] = quantidadeLivroMes;
    
    document.getElementById("livrosQuantidade").value = "";
    
    if (i === 11) {
        const total = livrosVendidosMeses.reduce((acumulador, valorAtual) => {
            return acumulador + valorAtual;
        }, 0);
        
        document.getElementById("result").textContent = `O total de livros vendidos ao decorrer de um ano foi de ${total}`;
        
        livrosVendidosMeses = [];
        i = 0;
    } else {
        i++;
    }
    
    document.getElementById("mes").textContent = meses[i];
    
    document.getElementById("livrosQuantidade").focus();
}