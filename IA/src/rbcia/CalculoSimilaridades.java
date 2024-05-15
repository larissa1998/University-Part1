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
public class CalculoSimilaridades {
    public static double similaridadeLocal(int CasoP, int CasoB, int max) {
        if (CasoP == -1 || CasoB == -1) {
            return 0.0;
        }
        int mod = CasoP - CasoB;
        double d = Math.abs((double) mod);
        double valor = 1.0 - d / max;
        return valor;
    }

    public static boolean similaridadeGlobal(Gerenciar_dados dados) {

        for (int i = 0; i < dados.getBase().size(); i++) {
            int pesos = 0;
            double valor = 0;
            for (int j = 2; j < dados.getBase().get(i).getValorAtributos().size(); j++) {
                ValorAtributos atb = dados.getBase().get(i).getValorAtributos().get(j);
                int peso = dados.getPesos().get(atb.getAtributo());
                pesos += peso;
                valor += (atb.getsimLocal()* peso);
            }
            
            
            double sig = valor/pesos;
            System.out.println("Similaridade Global Caso: '"+(i+1)+"' => "+sig);
            dados.getBase().get(i).setsimGlobal(sig);
        }

        return true;
    }
}
