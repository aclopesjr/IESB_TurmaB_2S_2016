/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb2s2016_java;

import java.util.Date;

/**
 *
 * @author antonio.lopes
 */
public class Conta {
 
    private String agencia;
    private String numero;
    private String nome;
    private Date dataAbertura;
    private double saldo;
    private double limite;
    
    public String getAgencia() {
        return this.agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }   

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
        
    Conta() {
        this.setLimite(100.0);
    }
    
    public Conta(String agencia, String numero) {
        this();
        this.setAgencia(agencia);
        this.numero = numero;
    }
    
    public Conta(String agencia, String numero, String nome) {
        this(agencia, numero);
        this.setNome(nome);
    }
    
    public Conta(String agencia, String numero,
            String nome, double limite) {
        this(agencia, numero, nome);
        this.setLimite(limite);
    }
    
    boolean deposita(double valor) {
        if (valor <= 0.0)
            return false;
        
        this.saldo += valor;
        return true;
    }
    
    boolean saca(double valor)
    {
        if (this.saldo < valor)
            return false;
        
        this.saldo -= valor;
        return true;
    }
    
    boolean transferePara(Conta contadestino, double valor)
    {
        if (!saca(valor))
            return false;
        
        return contadestino.deposita(valor);
    }

}
