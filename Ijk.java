package atividades;

import javax.swing.*;

public class Ijk {

    public static void main(String[] args) {
        try {
            int i = 5, j, k;
            j = --i;
            k = i++;
            i += 10;
            JOptionPane.showMessageDialog(null, "O valor de I é: " + i + "\nO valor de J é: " + j + "\nO Valor de K é: " + k);
        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }
    }

}
