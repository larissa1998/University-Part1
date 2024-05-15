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
public class Memoria {

    Integer tam = 1024;
    Map<Integer, Integer> celula;

    public Memoria() {
        celula = new HashMap();
        for (int x = 0; x < tam; x++) {
            celula.put(x, null);
        }
    }

    public void escrita(int y, int dados) {
        celula.replace(y, dados);
    }

    public Integer leitura(int y) { 
        return (celula.get(y));
    }

}
