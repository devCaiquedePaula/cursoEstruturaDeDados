package org.example.Trilha2_AnaliseDeAlgoritmosEBigO.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private Integer id;
    private String nome;
    private Double preco;

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}