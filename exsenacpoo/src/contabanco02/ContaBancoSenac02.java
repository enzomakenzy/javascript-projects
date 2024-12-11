package contabanco02;

import java.util.Arrays;

public class ContaBancoSenac02 {
    public String titular;
    public double saldo;
    
    public ContaBancoSenac02(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void information() {
        System.out.println(String.format("Titular: %s", this.titular));
        System.out.println(String.format("Saldo: %f", this.saldo));
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldoDepositar) {
        this.saldo += saldoDepositar;
        System.out.println(String.format("Saldo depositado com sucesso! Saldo atual: %f", this.saldo));
    }
    
    public void sacar(double saldoSacar) {
        if (saldoSacar <= this.saldo) {
            this.saldo -= saldoSacar;
            System.out.println(String.format("Saque realizado com sucesso! Saldo atual: %f", this.saldo));
        } else {
            System.out.println("O saque a ser realizado é maior que o saldo atual.");
        }
    }
}

