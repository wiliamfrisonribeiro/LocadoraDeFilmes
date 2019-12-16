/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Cliente extends Pessoa implements Imfo {
 private Dependente dependente;
    private String email;
    private int codigoCliente;

    //construtor
    public Cliente(Dependente dependente, String email, int codigoCliente, String nome, Date data_nascimento, int CPF, String endereco) {
        super(nome, data_nascimento, CPF, endereco);
        this.dependente = dependente;
        this.email = email;
        this.codigoCliente = codigoCliente;
    }
    
    
  
    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
   
 
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("0.#");
        String aux = "Cliente Cadastrado(a):";
        if(this.getNome() != null)
            aux += "\nNome cliente: "+this.setNome();
        if(this.getNome() != null)
            aux += "\nNome dependente: "+dependente.nome;        
        if(this.getNome() != null)
            aux += "\nData de Nascimento: "+formatoData.format(data_nascimento);
        if(this.getCPF() != 0)   
            aux += "\nCPF: "+CPF;
    
        if(this.getEndereco() != null)
            aux += "\nEndereço: "+endereco;
        if(this.getEmail() != null)
            aux += "\nemail: "+email;
        return aux;

    }
     @Override
    public String toString(){
        return nome;
    
    
}
}
