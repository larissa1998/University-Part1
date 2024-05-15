/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * Larissa Fogaça Mendes       nº120147
 * Pedro Maschio Portes        nº120137
 * Thalita Martins Yamatsuka   nº120126
 * 
 */

public class Ula {

    public Integer ADD(Registrador reg1, Registrador reg2) {
        return reg1.dado() + reg2.dado();
    }

    public Integer SUB(Registrador reg1, Registrador reg2) {
        return reg1.dado() - reg2.dado();
    }

    public Integer MULT(Registrador reg1, Registrador reg2) {
        return reg1.dado() * reg2.dado();
    }

    public Integer DIV(Registrador reg1, Registrador reg2) {
        return reg1.dado() / reg2.dado();
    }
}
