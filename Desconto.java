package atividades;

import javax.swing.*;

public class Desconto {

    public static void main(String[] args) {
        try{
        double produto = 0, res = 0, desconto = 0.91;
        String aux1 = "null";
        aux1 = JOptionPane.showInputDialog("Digite o valor do produto: ");
        produto = Double.parseDouble(aux1);
        res = produto * desconto;
        JOptionPane.showMessageDialog(null, "O produto com desconto custa: " + res );

    }catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Digite apenas números");
    }
    }
}
