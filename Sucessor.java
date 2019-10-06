package atividades;

import javax.swing.*;

public class Sucessor {

    public static void main(String[] args) {
        try {
            int num, suce, ante;
            String aux1;
            aux1 = JOptionPane.showInputDialog(null, "Digite um número: ");
            num = Integer.parseInt(aux1);
            suce = num + 1;
            ante = num - 1;
            JOptionPane.showMessageDialog(null, "O sucessor do número digitado é " + suce + " e o antecessor é " + ante);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }

    }

}
