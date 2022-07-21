package Encapsulations.Program;

import Encapsulations.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Digite o número da sua conta: ");
        int numberAccount = sc.nextInt(); //Variável temporaria para receber o num da conta
        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine(); //Variável temporaria para receber o nome do titular
        System.out.print("Você deseja realizar um deposito inicial (y/n)? ");
        char responde = sc.next().charAt(0); //Variável temporaria para receber a opção do usuário

        if (responde == 'y') {
            System.out.print("Digite o valor do deposito inicial: ");
            double saldo = sc.nextDouble();
            account = new Account(numberAccount, titular, saldo);
        } else {
            account = new Account(numberAccount, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Digite o valor para deposito: ");
        double valorDoDeposito = sc.nextDouble(); //// Variável temporaria para receber o valor do Deposito
        account.deposit(valorDoDeposito);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(account);


        System.out.println();
        System.out.println("Digite o valor para saque: ");
        double valorDoSaque = sc.nextDouble(); //// Variável temporaria para receber o valor do Deposito
        account.saque(valorDoSaque);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(account);

        sc.close();
    }
}
