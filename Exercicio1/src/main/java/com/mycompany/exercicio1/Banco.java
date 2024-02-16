package com.mycompany.exercicio1;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<ContaBancaria> contas;

    public Banco() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
    }

    public void cadastrarCliente(String nome) {
        int id = clientes.size() + 1; // Gera um ID incremental simples :)
        Cliente cliente = new Cliente(id, nome);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void criarConta(int numeroConta, double saldo, String nomeCliente) {
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getNome().equals(nomeCliente)) {
                cliente = c;
                break;
            }
        }
        if (cliente != null) {
            ContaBancaria conta = new ContaBancaria(numeroConta, saldo, cliente);
            contas.add(conta);
            System.out.println("Conta cadastrada com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public void mostrarContas() {
        if (contas.isEmpty()) {
            System.out.println("Não há nenhuma conta cadastrada!");
        } else {
            System.out.println("Contas cadastradas:");
            for (ContaBancaria conta : contas) {
                System.out.println("Conta - " + conta.getNumeroConta()
                        + " - Saldo - " + conta.getSaldo()
                        + " - Cliente - " + conta.getCliente().getId());
            }
        }
    }
}
