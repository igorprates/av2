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
public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
    
    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    }




