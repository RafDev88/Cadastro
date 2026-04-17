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
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name="img_url")
    private String imgUrl;

    @Column(name="idade")
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")//chave estrangeria
    private MissoesModel missoes;


}
