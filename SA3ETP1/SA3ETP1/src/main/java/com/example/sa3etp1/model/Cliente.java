package com.example.sa3etp1.model;
import org.springframework.boot.autoconfigure.domain.Entity;
import javax.persistence.Entity;
import javax.persistence.Matricula;

@Entity
public class Cliente {

    @Matricula
    private Integer matricula;

    private String nome;

    private String modalidade;

    private String endereco;

    public String getmodalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getendereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}