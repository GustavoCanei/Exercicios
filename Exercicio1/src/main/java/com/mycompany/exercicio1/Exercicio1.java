package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNome = new Scanner(System.in); // Gambiarra
        Banco banco = new Banco();
        
        int opcao;
        do {            
            System.out.println("\nOpções:");
            System.out.println("1 - Cadastrar cliente e conta");
            System.out.println("2 - Mostrar as contas");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scannerNome.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();
                    System.out.print("Digite o saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    banco.cadastrarCliente(nome);
                    banco.criarConta(numeroConta, saldo, nome);
                    break;
                case 2:
                    banco.mostrarContas();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
