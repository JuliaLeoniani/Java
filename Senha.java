package atividades;

import javax.swing.*;

public class Senha {

    public static void main(String[] args) {
        try {
            double num1, num2, total;
            String senha1, senha2, aux1 = "null";

            senha1 = JOptionPane.showInputDialog(null, "Digite uma senha: ");
            aux1 = JOptionPane.showInputDialog(null, "Digite um valor para a divisão: ");
            num1 = Double.parseDouble(aux1);
            aux1 = JOptionPane.showInputDialog(null, "Digite outro valor para a divisão: ");
            num2 = Double.parseDouble(aux1);
            senha2 = JOptionPane.showInputDialog(null, "Digite novamente a senha: ");
            if (senha1.equals(senha2)) {
                total = num1 / num2;
                JOptionPane.showMessageDialog(null, "O resultado da conta é: " + total);

            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }

        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }

    }
}
