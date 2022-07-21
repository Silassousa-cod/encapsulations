package Encapsulations.entities;

public class Account {

    private int numberAccount;
    private String titular;
    private double saldo;

    //Construtor é responsável por criar o objeto


    public Account(int numberAccount, String titular, double saldo) {
        this.numberAccount = numberAccount;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Account(int numberAccount, String titular) {
        this.numberAccount = numberAccount;
        this.titular = titular;
    }

    public int getNumberAccount() {
        return numberAccount;
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

    public void deposit(double quantidade) {
        saldo += quantidade;
    }

    public void saque(double quantidade) {
        saldo -= quantidade + 5.0;
    }

    public String toString(){
        return "Account "
                + numberAccount
                + ", Holder: "
                + titular
                + ", saldo: "
                + String.format("%.2f", saldo);
    }
}
