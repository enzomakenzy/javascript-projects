package conta06;

public abstract class Conta {
    protected String owner; 
    protected int numberAccount;
    protected double balance;
    protected boolean status;

    public Conta(String owner, int numberAccount, double balance, boolean status) {
        this.owner = owner;
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.status = status;
    }

    public void information() {
        System.out.println(String.format("""
            Titular: %s
            Número da conta: %d    
            Saldo: %.2f,
            Status: %b
            """, this.owner, this.numberAccount, this.balance, this.status));
    }

    public void deposit(double balance) {
        if (this.status) {
            this.balance += balance;
            System.out.println(String.format("Deposito realizado com sucesso! Saldo: %f", this.balance));
        } else {
            System.out.println("Nao é depositar com a conta fechada.");
        }
    }
    
    public abstract void sake(double balance);
        
    public void perfomance() {}
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public int getNumberAccount() {
        return numberAccount;
    }
    
    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
}
    