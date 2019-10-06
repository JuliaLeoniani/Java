package atividades;

import javax.swing.*;

public class Salario {

    public static void main(String[] args) {
        try {
            double salario = 0, porcentagem = 0, aumento = 0;
            String aux1 = "null";

            aux1 = JOptionPane.showInputDialog(null, "Digite seu salário: ");

            salario = Double.parseDouble(aux1);

            aux1 = JOptionPane.showInputDialog(null, "Insira seu percentual de aumento: ");

            porcentagem = Double.parseDouble(aux1);

            porcentagem = porcentagem / 100;

            aumento = salario * porcentagem;

            salario = salario + aumento;

            JOptionPane.showMessageDialog(null, "Seu aumento é de: " + aumento + "\nE Seu novo salário é de: " + salario);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira apenas números!");
        }

    }
}
