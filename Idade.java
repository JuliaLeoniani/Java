package atividades;

import javax.swing.*;

public class Idade {

    public static void main(String[] args) {
        try {
            String aux1;
            int idade, m18 = 0;
            for (int i = 0; i < 20; i++) {
                aux1 = JOptionPane.showInputDialog(null, "Digite sua idade:");
                idade = Integer.parseInt(aux1);
                if (idade > 18) {
                    m18 = m18 + 1;
                }
            }
            JOptionPane.showMessageDialog(null, "O número de pessoas maiores de idade é: " + m18);
        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }
    }

}
