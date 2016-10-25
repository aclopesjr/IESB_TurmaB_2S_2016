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
public class Diretor extends Gerente {

    public Diretor(String cpf, String nome) {
        super(cpf, nome);
    }
    
    public Diretor(String cpf, String nome,
            int nroSubordinados) {
        super(cpf, nome, nroSubordinados);
    }
}
