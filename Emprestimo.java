
package atividades;

import javax.swing.*;

public class Emprestimo {
    public static void main(String[] args) {
        try{
        double salario = 0, emprestimo = 0, porcentagem= 0;
        String aux1 = "null";
        
        aux1 = JOptionPane.showInputDialog(null, "Insira o seu salário bruto: ");
        salario= Double.parseDouble(aux1);
        
        aux1 = JOptionPane.showInputDialog(null, "Insira o valor do empréstimo: ");
        emprestimo = Double.parseDouble(aux1);
        
        porcentagem = salario * 30/100 ;
        
        if (emprestimo > porcentagem){
            JOptionPane.showMessageDialog(null, "O seu empréstimo não pode ser realizado: Valor muito alto!");
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
        }
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }
        
        
    }
       
    
}
