package conta06;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String owner, int numberAccount, double balance, boolean status) {
        super(owner, numberAccount, balance, status);
    }

    @Override
    public void sake(double balance) {
        if (this.status) {
            if ((this.balance - 2) >= balance) {
                this.balance -= balance;
                this.balance -= 2;
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

    @Override
    public void perfomance() {
        if (this.status) {
            this.balance *= 100.95;
            System.out.println(String.format("Rendimento aplicado! Saldo atual: %f", this.balance)); 
        } else {
            System.out.println("Não é possível render com uma conta fechada.");
        }
    }  

}
