/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcia;

import java.util.HashMap;

/**
 *
 * @author laris
 */
public class Atributos {
        String atributo;
     HashMap<String, String> valor;
    
    public Atributos(String atributo) {
        this.atributo = atributo;
        valor = new HashMap<>();
    }
    //________________________________________________
    
    public String getAtributo() {
        return atributo;
    }
    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
    public void addValor(String valor, String nome){ 
        this.valor.put(valor, nome);
       
    }
    public HashMap<String, String> getValor() {
        return valor;
    }
    public void setValor(HashMap<String, String> valor) {
        this.valor = valor;
    }
}
