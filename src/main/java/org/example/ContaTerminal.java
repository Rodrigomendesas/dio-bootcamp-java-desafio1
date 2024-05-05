package org.example;

public class ContaTerminal {
    private String agencia;

    private String numero;
    private String nomeCliente;
    private double saldo;
    public ContaTerminal(){}

    public ContaTerminal(String agencia, String numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo de R$" + saldo +
                " já está disponível para saque. ";
    }
}
