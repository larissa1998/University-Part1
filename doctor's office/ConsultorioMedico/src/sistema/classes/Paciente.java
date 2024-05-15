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
public class Paciente {

    protected String nome;
    protected double cpf;
    protected double rg;
    protected String cidade;
    protected String uf;
    protected String endereco;
    protected String bairro;
    protected int cep;
    protected double telefone;
    protected String email;
    protected String observacoes;
    
    public Paciente (){
        nome = "";
        cpf = 0;
        rg = 0;
        cidade = "";
        uf = "";
        endereco = "";
        bairro = "";
        cep = 0;
        telefone = 0;
        email = "";
        observacoes = "";
    }

    //----------------------------(SETS)----------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //----------------------------(GETS)----------------------------
    public String getNome() {
        return this.nome;
    }

    public double getCpf(double cpf) {
        return this.cpf;
    }

    public double getRg(double rg) {
        return this.rg;
    }

    public String getCidade(String cidade) {
        return this.cidade;
    }

    public String getUf(String uf) {
        return this.uf;
    }

    public String getEndereco(String endereco) {
        return this.endereco;
    }

    public String getBairro(String bairro) {
        return this.bairro;
    }

    public int getCep(int cep) {
        return this.cep;
    }

    public double getTelefone(double telefone) {
        return this.telefone;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public String getObservacoes(String observacoes) {
        return this.observacoes;
    }

}
