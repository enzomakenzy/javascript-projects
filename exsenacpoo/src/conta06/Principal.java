package conta06;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Enzo", 111, 500, true);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Layza'", 222, 10, true);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("Joao", 333, 15, false);
        
        contaCorrente.deposit(250);
        contaCorrente.information();

        contaPoupanca.sake(10);
        contaPoupanca.getOwner();
        contaPoupanca.getBalance();

        contaPoupanca2.sake(10);
        contaPoupanca2.information();
    }
}
