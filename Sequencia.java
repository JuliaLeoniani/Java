package atividades;

import javax.swing.*;

public class Sequencia {

    public static void main(String[] args) {
        double numero1 = 0, numero2 = 0, res = 0;
        String aux1 = "null";

        aux1 = JOptionPane.showInputDialog(null, "Digite um número ");
        numero1 = Double.parseDouble(aux1);

        while (numero1 >= 1) {
            res = res + numero1;
           
            aux1 = JOptionPane.showInputDialog(null, "Digite outro número ou digite 0 para encerrar o programa: ");
            numero1 = Double.parseDouble(aux1);
        } if (numero1 == 0){
            JOptionPane.showMessageDialog(null, "Programa Encerrado! \nSeu Resultado foi: "+ res);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Digite apenas números positivos!");
        }

    }

}
