/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Larissa Fogaça Mendes       nº120147
 * Pedro Maschio Portes        nº120137
 * Thalita Martins Yamatsuka   nº120126
 * 
 */

public class Registrador {

    Map<Integer, Integer> celula; 

    Memoria memoria;
    private String nome;

    public Registrador(String nome, Memoria memoria) {
        celula = new HashMap();
        celula.put(0, null);
        this.nome = nome;
        this.memoria = memoria;

    }

    public void load(int endereco) {
        if (memoria.leitura(endereco) != null) {
            celula.replace(0, memoria.leitura(endereco));
        } else {
            celula.replace(0, endereco);
        }
    }

    public void load1(int valor) {
        celula.replace(0, valor);
    }

    public Integer dado() {
        return (celula.get(0));
    }

}
