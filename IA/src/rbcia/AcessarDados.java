/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author laris
 */
public class AcessarDados {
      Gerenciar_dados BaseInteira;
     ArrayList<String> atributo_nome;
     int x;
     
    public AcessarDados() {
        BaseInteira = new Gerenciar_dados();
        atributo_nome = new ArrayList<>();
        x=0;
    }

    public void setBase(String path) {
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            String atb[] = linha.split(";");
            while (linha != null) {
                Base b = new Base();
                String aux[];
                linha = lerArq.readLine();
                if (linha == null) {
                    break;
                }
                aux = linha.split(";");
                for (int i = 0; i < aux.length; i++) {
                    b.getValorAtributos().add(new ValorAtributos(atb[i], aux[i]));
                }
                getBaseInteira().getBase().add(b);
            }
           
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }

    public void setPesos(String path) {
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                String aux[];
                linha = lerArq.readLine();
                if (linha == null) {
                    break;
                }
                aux = linha.split(";");
                getBaseInteira().getPesos().put(aux[0], Integer.parseInt(aux[1]));
               
            }
            for (int i = 0; i < getBaseInteira().getPesos().size(); i++) {

            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }

    public void setAtributos(String path) {
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                String aux[];
                Atributos at=null;
                linha = lerArq.readLine();
                if (linha == null) {
                    break;
                }
                aux = linha.split(";");
                if("-".equals(aux[0])){ 
                    int n = getBaseInteira().getAtributos().size();
                    getBaseInteira().getAtributos().get(n-1).addValor(aux[1],aux[2]);
                    getAtributo_nome().add(aux[1]);
                }else{      
                    
                    at = new Atributos(aux[0]);
                    getBaseInteira().getAtributos().add(at);int n = getBaseInteira().getAtributos().size();
                    getBaseInteira().getAtributos().get(n-1).addValor(aux[1],aux[2]);           
                    getAtributo_nome().add(aux[1]);
                }   
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }
    
    public Gerenciar_dados getBaseInteira() {
        return BaseInteira;
    }

    public ArrayList<String> getAtributo_nome() {
        return atributo_nome;
    }

    public void setAtributo_nome(ArrayList<String> atributo_nome) {
        this.atributo_nome = atributo_nome;
    }
}
