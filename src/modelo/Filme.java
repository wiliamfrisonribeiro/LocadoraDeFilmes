/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pc
 */
public class Filme implements Imfo {
    protected String nome;  // PRIVATE SOMENTE A CLASSE TEM ACESSO
    protected char status;      
    protected String categoria;

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String getInfo() {
          String aux = "Filme cadastrado:\n";
        if(nome != null)
            aux += "Nome: "+nome;
        if(status != 0)   
        {
            if((status == 'D') || (status == 'd'))
            aux += "\nStatus: "+status+" - Disponível";
            else if((status == 'I') || (status == 'i'))
            aux += "\nStatus: "+status+" - Indisponível";
        }
        if(categoria != null)
            aux += "\nCategoria: "+categoria;
        return aux;
    }
     @Override
    public String toString(){
        return nome;
    }
    }

