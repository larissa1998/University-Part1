/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcia;

import java.util.ArrayList;

/**
 *
 * @author laris
 */
public class Base {
      
    public static int id = 0;
    ArrayList<ValorAtributos> ValorAtributos;
    int idP;
    double simGlobal;
   
   public Base(){
       ValorAtributos = new ArrayList<>();
       idP=id;
       id++;
   }
    public ArrayList<ValorAtributos> getValorAtributos() {
        return ValorAtributos;
    }
    public void setValorAtributos(ArrayList<ValorAtributos> baseData) {
        this.ValorAtributos = baseData;
    }
   
   @Override
    public String toString(){
      //  return "Caso: "+idP+"  \n SG: "+simGlobal;
      return "-----------------------";
    }
    
    public int getId() {
        return idP;
    }
    public void setId(int idP) {
        this.idP = idP;
    }

    public double getsimGlobal() {
        return simGlobal;
    }

    public void setsimGlobal(double simGlobal) {
        this.simGlobal = simGlobal;
    }
   
}
