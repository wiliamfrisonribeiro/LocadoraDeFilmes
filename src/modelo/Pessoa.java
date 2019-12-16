/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Pessoa implements Imfo {
    protected  String nome;  // PRIVATE SOMENTE A CLASSE TEM ACESSO
    protected Date data_nascimento;
    protected int CPF;      // JÁ PROTECTED A CLASSE E SEUS FILHOS
    protected String endereco;
   

    
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa(String nome, Date data_nascimento, int CPF, String endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
       
    }
    
    //getter e setter    
    public String getNome(){
        return nome;
    } 
     public String setNome(){
        return nome;
    }    
    
    public Date getData_nascimento(){
        return data_nascimento;
    }    
    public void setData_nascimento(Date dn){
       data_nascimento = dn;
    }
    public int getCPF(){
        return CPF;
    }    
    public void setCPF(int cpf){
        CPF = cpf;
    }
    public String getEndereco(){
        return endereco;
    }    
    public void setEndereco(String e){
        endereco = e;
    }

    @Override
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("0.#");
        String aux = "Pessoa Cadastrada:";
   
        if(this.getNome()!= null)
            aux += "\nNome: "+this.setNome();
        if(this.getData_nascimento() != null)
            aux += "\nData de Nascimento: "+formatoData.format(data_nascimento);
        if(this.getCPF()!= 0)   
            aux += "\nCPF: "+ CPF;
        if(this.getEndereco() != null)
            aux += "\nEndereço: "+this.getEndereco();
        return aux;
    }
    @Override
    public String toString(){
        return nome;
    }

    
    
    

}
