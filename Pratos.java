package atividades;

import javax.swing.*;

public class Pratos {

    public static void main(String[] args) {
        try {
            int escolha, nutricao = 0;
            String aux1, resp;
            aux1 = JOptionPane.showInputDialog(null, "Escolha um prato:\n 1 - vegetariano \n 2 – Peixe\n 3-Frango\n 4 –Carne");
            escolha = Integer.parseInt(aux1);
            switch (escolha) {
                case 1:
                    nutricao = nutricao + 180;
                    break;
                case 2:
                    nutricao = nutricao + 230;
                    break;
                case 3:
                    nutricao = nutricao + 250;
                    break;
                case 4:
                    nutricao = nutricao + 350;
                    break;
            }
            aux1 = JOptionPane.showInputDialog(null, "Escolha uma sobremesa:\n 1 – Abacaxi\n 2 – Sorvete diet\n 3 – Mouse diet\n 4 – Mouse chocolate\n ");
            escolha = Integer.parseInt(aux1);
            switch (escolha) {
                case 1:
                    nutricao = nutricao + 75;
                    break;
                case 2:
                    nutricao = nutricao + 110;
                    break;
                case 3:
                    nutricao = nutricao + 170;
                    break;
                case 4:
                    nutricao = nutricao + 200;
                    break;
            }
            aux1 = JOptionPane.showInputDialog(null, "Escolha Bebida\n 1 - Chá\n 2 - Suco de laranja\n 3 – Suco de melão\n 4 – Refrigerante diet.\n ");
            escolha = Integer.parseInt(aux1);
            switch (escolha) {
                case 1:
                    nutricao = nutricao + 20;
                    break;
                case 2:
                    nutricao = nutricao + 70;
                    break;
                case 3:
                    nutricao = nutricao + 100;
                    break;
                case 4:
                    nutricao = nutricao + 65;
                    break;
            }
            JOptionPane.showMessageDialog(null, "A sua refeição teum um total de calorias de: " + nutricao);
        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }
    }
}
