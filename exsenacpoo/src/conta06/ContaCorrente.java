package conta06;

public class ContaCorrente extends Conta {

    public ContaCorrente(String owner, int numberAccount, double balance, boolean status) {
        super(owner, numberAccount, balance, status);
    }

    @Override
    public void sake(double balance) {
        if (this.status) {
            if ((this.balance) >= balance) {
                this.balance -= balance;
                System.out.println(String.format("Saque realizado com sucesso! Saldo atual: %.2f", this.balance));
            } else {
                System.out.println(String.format("""
                Saldo insuficiente para ser realizado o saque.
                Saldo atual: %.2f
                Valor do saque: %.2f
                    """, this.balance, balance));
            } 
        } else {
            System.out.println("Não é possível sacar com a conta fechada.");
        }
    }  

}
