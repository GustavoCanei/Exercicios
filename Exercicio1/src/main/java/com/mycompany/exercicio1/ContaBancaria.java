package com.mycompany.exercicio1;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    
    public ContaBancaria(int numeroConta, double saldo, Cliente cliente){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
