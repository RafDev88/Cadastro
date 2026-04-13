package com.cadastro.cadastro_spring.Missoes;

import com.cadastro.cadastro_spring.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    //OneToMany pode ter varias missoes;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> nijas;



}
