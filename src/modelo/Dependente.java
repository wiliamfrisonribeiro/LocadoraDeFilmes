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
public class Dependente extends Pessoa implements Imfo {
       protected Cliente cliente;

    public Dependente(String nome, Date data_nascimento, int CPF, String endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
       @Override
   public String getInfo(){
        DecimalFormat df = new DecimalFormat("0.#");
        String aux = "Dependente Cadastrado(a):";
        if(nome != null)
            aux += "\nNome dependente: "+nome;
        if(data_nascimento != null)
            aux += "\nNome cliente : "+cliente.nome;
        if(data_nascimento != null)
            aux += "\nData de Nascimento: "+formatoData.format(data_nascimento);
        if(CPF != 0)   
            aux += "\nCPF: "+CPF;
        if(endereco != null)
            aux += "\nEndereço: "+endereco;
        return aux;
   }
   @Override
    public String toString(){
        return nome;
    }
}
