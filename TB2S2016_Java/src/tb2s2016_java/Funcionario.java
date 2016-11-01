/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb2s2016_java;

/**
 *
 * @author antonio.lopes
 */
public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome, String sobreNome) {
        this.nome = nome + " " + sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacao() {
        return this.salario * 1.2;
    }
    
    public Funcionario(String cpf, String nome) {
        this.setCpf(cpf);
        this.setNome(nome);
    }
}
