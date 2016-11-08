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
public class Funcionario extends Pessoa
    implements Autenticavel {
    
    private String senhaInterna;

    public String getSenhaInterna() {
        return senhaInterna;
    }

    public void setSenhaInterna(String senhaInterna) {
        this.senhaInterna = senhaInterna;
    }
            
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setNome(String nome,
            String sobreNome) {
        this.nome = nome + " " + sobreNome;
    }
            
    public double getBonificacao() {
        return this.salario * 1.2;
    }
    
    public Funcionario(String cpf,
            String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public boolean autentica(String senha) {
        return this.getSenhaInterna().equals(senha);
    }
}
