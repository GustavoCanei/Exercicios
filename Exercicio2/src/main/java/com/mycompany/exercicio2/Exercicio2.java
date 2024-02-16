package com.mycompany.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Biblioteca biblioteca  = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Consultar Livro");
            System.out.println("3. Remover Livro");
            System.out.println("4. Ordenar Biblioteca por Ano de Publicação");
            System.out.println("5. Exibir Biblioteca");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    biblioteca.adicionarLivro();
                    break;
                case 2:
                    System.out.println("Digite o título do livro: ");
                    String tituloConsulta = scanner.nextLine();
                    biblioteca.consultarLivro(tituloConsulta);
                    break;
                case 3:
                    System.out.println("Digite o título do livro a ser removido: ");
                    String tituloRemocao = scanner.nextLine();
                    biblioteca.removerLivro(tituloRemocao);
                    break;
                case 4:
                    biblioteca.ordenarPorAnoPublicacao();
                    System.out.println("Biblioteca ordenada por ano de publicação!");
                    break;
                case 5:
                    biblioteca.exibirBiblioteca();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while (opcao != 6);
    }
}

