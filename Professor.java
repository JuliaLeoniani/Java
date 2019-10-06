package atividades;

import javax.swing.*;

public class Professor {

    public static void main(String[] args) {
        try {
            double salario, desconto, liquido, aliquota, dias, horas;
            String a = "null";

            a = JOptionPane.showInputDialog(null, "Insira sua carga hora-aula diaria: ");
            horas = Double.parseDouble(a);
            
            a = JOptionPane.showInputDialog(null, "Insira quantos dias você trabalha por mês: ");
            dias = Double.parseDouble(a);
            
            a = JOptionPane.showInputDialog(null, "Insira seu salario por aula: ");
            salario = Double.parseDouble(a);
            
            salario= salario*horas;
            salario= salario*dias;


            if (salario < 465) {
                JOptionPane.showMessageDialog(null, "Desculpe!\nSeu salário deve ser"
                        + " maior que R$464,00.");
                System.exit(0);
            }

            if (salario <= 965.67) {
                aliquota = 8 / 100;

            }

            if ((salario > 965.67) && (salario < 1609.46)) {
                aliquota = 9 / 100;
            }

            if ((salario > 1609.45) && (salario <= 3218.90)) {
                aliquota = 11 / 100;
            }

            if (salario > 3218.90) {
                desconto = 354.07;
                liquido = salario - desconto;
                JOptionPane.showMessageDialog(null, "Seu salário é: R$" + salario
                        + "\nSeu desconto será de: R$" + desconto + "\nSeu salário líquido é de: " + liquido);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira apenas numeros");
        }

    }
}
