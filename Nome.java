package atividades;

import javax.swing.*;

public class Nome {

    public static void main(String[] args) {
        try {
            String aux1, nome = null, auxnome;
            int idade = 0, menor = 500;

            for (int i = 1; i < 11; i++) {
                auxnome = JOptionPane.showInputDialog(null, "Digite o " + i + "* nome: ");
                aux1 = JOptionPane.showInputDialog(null, "Digite a idade " + i + "* idade: ");
                idade = Integer.parseInt(aux1);

                if (idade < menor) {
                    menor = idade;
                    nome = auxnome;
                }

            }
            JOptionPane.showMessageDialog(null, "O nome da pessoa mais jovem é " + nome + " e sua idade é " + menor);

        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números ! ");
        }

    }

}
