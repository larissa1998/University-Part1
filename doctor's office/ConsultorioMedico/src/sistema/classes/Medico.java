/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.classes;

/**
 *
 * @author Larissa Fogaça Mendes
 */
public abstract class Medico {

    protected int crm;
    protected String nome; 
    protected double telefone;
    protected String email;

    public Medico (){
        crm = 0;
        nome = "";
        telefone = 0;
        email = "";
    }
    //---------------------(SETS)------------------------      

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCrm(int crm){
        this.crm = crm;
    }
//---------------------(GETS)------------------------   
    public String getNome() {
        return this.nome;
    }

    public double getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }
    public int getCrm(){
        return this.crm;
    }
    
    public void operar(){
        System.out.println("Operado com sucesso");
    }

}
