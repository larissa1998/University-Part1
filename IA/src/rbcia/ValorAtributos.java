/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcia;

/**
 *
 * @author laris
 */
public class ValorAtributos {
     String atributo;
     String valor;
     double simLocal;
    
    public ValorAtributos(String atributo, String valor) {
        this.atributo = atributo;
        this.valor = valor;
    }
  
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        String r = "Atributo: "+atributo+" \n Valor: "+valor;
        return r;
    }

    public double getsimLocal() {
        return simLocal;
    }

    public void setsimLocal(double simLocal) {
        this.simLocal = simLocal;
    }
}
