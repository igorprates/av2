/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.igor.programacao.aula10;

/**
 *
 * @author aluno
 */
public class Arrays {

    int[] vetorDeInteiros = new int[10];

    public boolean insereDadosNoVetor(int posicao, int valor) {
        if (posicao < vetorDeInteiros.length) {
            vetorDeInteiros[posicao] = valor;
            return true;
        } else {
            return false;
        }
    }

    public int soma() {
        int soma = 0;

        for (int i = 0; i < vetorDeInteiros.length; i++) {
            soma = soma + vetorDeInteiros[i];
        }

        return soma;
    }
}
