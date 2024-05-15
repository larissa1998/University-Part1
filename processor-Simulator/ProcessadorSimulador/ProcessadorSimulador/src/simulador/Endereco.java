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

public class Endereco {

    private String dados;

    public Endereco() {
        dados = "";
    }

    public Endereco(String dados) {
        this.dados = dados;
    }

    public String getDado() {
        return dados;
    }

    public void setDado(String dados) {
        this.dados = dados;
    }
}
