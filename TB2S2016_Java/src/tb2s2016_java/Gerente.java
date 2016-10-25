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
public class Gerente extends Funcionario {
    private int nroSubordinados;
   
    public int getNroSubordinados() {
        return nroSubordinados;
    }

    public void setNroSubordinados(int nroSubordinados) {
        this.nroSubordinados = nroSubordinados;
    }
    
    public Gerente(String cpf, String nome) {
        super(cpf, nome);
    }
    
    public Gerente(String cpf, String nome,
            int nroSubordinados) {
        this(cpf, nome);
        this.setNroSubordinados(nroSubordinados);
    }
}
