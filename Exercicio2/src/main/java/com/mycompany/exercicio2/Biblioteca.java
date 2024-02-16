package com.mycompany.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> biblioteca;

    public Biblioteca() {
        this.biblioteca = new ArrayList<>();
    }
    public void adicionarLivro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano de publicação do livro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o gênero do livro: ");
        String genero = scanner.nextLine();
        
        Livro livro = new Livro(titulo, autor, ano, genero);
        biblioteca.add(livro);
    }
    
    public void consultarLivro(String titulo) {
        boolean encontrado = false;
        for(Livro livro : biblioteca) {
            if(livro.titulo.equals(titulo)){
                System.out.println("Detalhes do livro: ");
                System.out.println(livro);
                encontrado = true ;
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("Livro não encontrado na biblioteca!");
        }
    }
    
    public void removerLivro(String titulo) {
        boolean removido = biblioteca.removeIf(livro -> livro.titulo.equals(titulo));
        if(removido){
            System.out.println("Livro removido com sucesso!");
        }else{
            System.out.println("Livro não encontrado na biblioteca!");
        }
    }
    
    public void ordenarPorAnoPublicacao(){
        Collections.sort(biblioteca, Comparator.comparingInt(livro -> livro.anoPublicacao));
    }
    
    public void exibirBiblioteca(){
        if(biblioteca.isEmpty()){
            System.out.println("A biblioteca está vazia!");
        }else {
            System.out.println("Lista de livros na biblioteca:");
            for(Livro livro : biblioteca){
                System.out.println(livro);
            }
        }
    }
}
