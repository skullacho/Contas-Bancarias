package model;

import enums.TipoConta;
import enums.Banco;

// CLASSE ABSTRATA
public abstract class Conta {

    private String titular;
    private String numero;
    private double saldo;

    // ENUMS
    private TipoConta tipoConta;
    private Banco banco;

    public Conta(String titular, String numero, double saldo,
                 TipoConta tipoConta, Banco banco) {

        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.banco = banco;
    }

    // MÉTODO ABSTRATO
    public abstract void render();

    // MÉTODO CONCRETO
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    // MÉTODO CONCRETO
    public void exibirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Tipo: " + tipoConta);
        System.out.println("Banco: " + banco.getNomeExibicao());
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}