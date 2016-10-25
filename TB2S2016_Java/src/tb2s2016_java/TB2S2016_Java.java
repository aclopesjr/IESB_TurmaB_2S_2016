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
public class TB2S2016_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Conta conta = new Conta("1234-0",
//                "0001-0", "FULANO DE TAL");
        //Conta conta = new Conta();
        //Conta conta = new Conta("0123-x", "01234567-8");
//        Conta conta = new Conta("0123-x",
//                "01234567-8", "Fulano de TAl");
        Conta conta = new Conta("0123-x",
                "01234567-8", "Fulano de TAl", 250.0);
        conta.setNome("Fulano de Tal");
        conta.setSaldo(100.0);
        
        Conta conta2 = new Conta("1234-0",
                "0001-0", "Ciclano de Tal");
        conta2.setSaldo(100.0);
        
        
        conta.deposita(100.50);
        //boolean sacou01 = conta.saca(200);
        //boolean sacou02 = conta.saca(50.5);
        
        System.out.println(
                String.format("%s tem o saldo igual a %f",
                conta.getNome(), conta.getSaldo()));
        
        
        
        System.out.println(
                String.format("%s tem o saldo igual a %f",
                conta2.getNome(), conta2.getSaldo()));
        
        conta.transferePara(conta2,50);    
        
        System.out.println(
                String.format("%s tem o saldo igual a %f",
                conta.getNome(), conta.getSaldo()));
        
        System.out.println(
                String.format("%s tem o saldo igual a %f",
                conta2.getNome(), conta2.getSaldo()));
    }
    
}
