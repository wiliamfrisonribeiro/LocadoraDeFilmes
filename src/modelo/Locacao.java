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
public class Locacao implements Imfo {
    protected Pessoa pessoa;  // PRIVATE SOMENTE A CLASSE TEM ACESSO
    protected Filme filme;
    protected Date data_locacao;
    protected Date data_devolucao;
    protected double valor;      // JÁ PROTECTED A CLASSE E SEUS FILHOS
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    public Locacao(Pessoa pessoa, Filme filme, Date data_locacao, Date data_devolucao, double valor) {
        this.pessoa = pessoa;
        this.filme = filme;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.valor = valor;
    }

   

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Date getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public SimpleDateFormat getFormatoData() {
        return formatoData;
    }

    public void setFormatoData(SimpleDateFormat formatoData) {
        this.formatoData = formatoData;
    }

    @Override
    public String getInfo() {
         DecimalFormat df = new DecimalFormat("0.#");
        double numero_locacao = Math.floor(Math.random() * 10 + 1);
        String aux = "\nLocação "+numero_locacao;
        if(pessoa != null)
            aux += "\nPessoa: "+pessoa;
        if( filme!= null)
            aux += "\nJogo: "+filme;
        if(data_locacao != null)
            aux += "\nData de Locação: "+formatoData.format(data_locacao);
        if(data_devolucao != null)
            aux += "\nData de Devolução: "+formatoData.format(data_devolucao);
        if(valor != 0)   
            aux += "\nValor: "+valor;

        return aux;
    }
    @Override
    public String toString(){
        return pessoa.nome;
    }
    
}
