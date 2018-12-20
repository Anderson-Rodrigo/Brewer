package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class Estilo {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @Size(min = 1, max = 10, message = "Descrição tem que ter entre 1 e 10")
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
