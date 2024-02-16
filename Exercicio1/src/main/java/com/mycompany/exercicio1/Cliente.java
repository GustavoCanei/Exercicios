package com.mycompany.exercicio1;

public class Cliente {
    private static int ultimoId = 0;
    private int id;
    private String nome;
    
    public Cliente(int id, String nome){
        this.id = ++ultimoId;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
