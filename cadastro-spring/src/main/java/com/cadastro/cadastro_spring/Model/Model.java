package com.cadastro.cadastro_spring.Model;


import jakarta.persistence.*;

//Enttity tranfirma uma classe em uma entidade do BD
//GenerationValeu usado para nossa estrategia de como gerar o Id.
@Entity
@Table(name="bd_cadastro")

public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public Model() {
    }

    public Model(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
