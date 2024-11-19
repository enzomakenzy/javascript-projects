function analisarTempo() {
    var dinheiroDaphne = Number.parseFloat(document.getElementById("daphneMoney").value);
    var dinheiroCleo = Number.parseFloat(document.getElementById("cleoMoney").value);

    dinheiroDaphne = dinheiroDaphne + (100 * 10);
    dinheiroCleo = dinheiroCleo + (dinheiroCleo * 0.05);

    meses = 1
    anos = 0

    while (dinheiroDaphne > dinheiroCleo) {
        dinheiroDaphne = dinheiroDaphne + (100 * 10);
        dinheiroCleo = dinheiroCleo + (dinheiroCleo * 0.05);

        meses += 1;

        if (meses % 12 == 0) {
            anos += 1;
        }
    }

    meses = meses % 12

    document.getElementById("result").textContent = `O tempo que iria durar para o juros de Cleo superar o de Daphne é de ${anos} anos e ${meses} meses`
}

analisarTempo();