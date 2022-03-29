/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author IFAM
 */
@Entity
public class Vacinado {
    @Id
    private String cpf;
    
    private String cns;
    private String nome;
    private LocalDate dtNascimento;
    private boolean comorbidade;
    private int qtdDoses;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public boolean isComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(boolean comorbidade) {
        this.comorbidade = comorbidade;
    }

    public int getQtdDoses() {
        return qtdDoses;
    }

    public void setQtdDoses(int qtdDoses) {
        this.qtdDoses = qtdDoses;
    }

    public Vacinado(String cpf, String cns, String nome, LocalDate dtNascimento, boolean comorbidade, int qtdDoses) {
        this.cpf = cpf;
        this.cns = cns;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.comorbidade = comorbidade;
        this.qtdDoses = qtdDoses;
    }

    public Vacinado() {
    }
    
    
}
