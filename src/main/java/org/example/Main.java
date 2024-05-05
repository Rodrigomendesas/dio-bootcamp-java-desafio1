package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência: ");
        var agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        var conta = scanner.next();
        System.out.println("Por favor, digite seu nome: ");
        var nome = scanner.next();
        var saldo = 3.14;
        ContaTerminal contaTerminal = new ContaTerminal(agencia, conta, nome, saldo);
        System.out.println(contaTerminal);


    }
}