package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class Cidades {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Cpf é obrigatório")
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
