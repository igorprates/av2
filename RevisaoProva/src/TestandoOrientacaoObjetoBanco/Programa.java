/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestandoOrientacaoObjetoBanco;

/**
 *
 * @author Michelly Ponce
 */
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.dono = "Igor";
        minhaConta.saldo = 2000.0;
        
        minhaConta.saca(200);
        
        minhaConta.deposita(500);
        System.out.println("Saldo da minha conta e: " + minhaConta.saldo);
        
    }
}

