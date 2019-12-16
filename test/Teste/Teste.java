/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import modelo.Cliente;
import modelo.Dependente;
import modelo.Pessoa;
import modelo.Filme;
import modelo.Locacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Teste {
     public static void main(String[] args) throws ParseException{
         
         SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
         Filme f1 = new Filme();
         f1.setNome("Olhos Famintos 3");
        f1.setStatus('D');
        f1.setCategoria("Terror");
        JOptionPane.showMessageDialog(null, f1.getInfo());
     }
}
