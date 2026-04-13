package com.cadastro.cadastro_spring.Ninja;


import com.cadastro.cadastro_spring.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Enttity tranfirma uma classe em uma entidade do BD
//GenerationValeu usado para nossa estrategia de como gerar o Id.
@Entity
@Table(name="bd_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id")//chave estrangeria
    private MissoesModel missoes;

   
}
