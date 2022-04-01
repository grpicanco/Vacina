/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author IFAM
 */
@Entity
@Table(name="Vacinado")
public class Vacinado implements Serializable {
    @Id
    @Column(name="tx_cpf", length=11, nullable= false)
    private String cpf;
    
    @Column(name="tx_cns", length=15, nullable= false)
    private String cns;
    
    @Column(name="tx_nome", length=160, nullable= false)
    private String nome;
    
    @Column(name="dt_nascimento", length=160, nullable= false)
    private LocalDate nascimento;
    
    @Column(name="cs_comorbidade", length=1, nullable= false)
    private boolean comorbidade;
    
    @Column(name="nb_doses", nullable= false)
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
        return nascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.nascimento = dtNascimento;
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

    public Vacinado(String cpf, String cns, String nome, LocalDate nascimento, boolean comorbidade, int qtdDoses) {
        this.cpf = cpf;
        this.cns = cns;
        this.nome = nome;
        this.nascimento = nascimento;
        this.comorbidade = comorbidade;
        this.qtdDoses = qtdDoses;
    }

    public Vacinado() {
    }
    
    
}
