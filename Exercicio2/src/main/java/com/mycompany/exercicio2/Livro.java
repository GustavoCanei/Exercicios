package com.mycompany.exercicio2;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String genero;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }
    
    public String toString() {
        return "Livro {" +
                "titulo = '" +titulo+ '\''+
                ", autor = '" +autor+ '\''+
                ", Pulicacao = " +anoPublicacao+
                ", genero = '" +genero+ '\'' +
                '}';
    }
}
