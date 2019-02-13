package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Clientes {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Cpf é obrigatório")
    private String cpf;
    @Size(min = 1, max = 10, message = "Descrição tem que ter entre 1 e 10")
    private String tipoPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
    
}
