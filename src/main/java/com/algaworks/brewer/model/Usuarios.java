package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class Usuarios {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Cpf é obrigatório")
    private String senha;
    @Size(min = 1, max = 10, message = "Descrição tem que ter entre 1 e 10")
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
