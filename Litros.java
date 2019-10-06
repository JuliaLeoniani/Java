package atividades;

import javax.swing.JOptionPane;

public class Litros {

    public static void main(String[] args) {
        try {
            double distancia = 0, tempo = 0, velocidade = 0, litrosusados = 0;
            String aux1 = "null";
            aux1 = JOptionPane.showInputDialog(null, "Digite a distancia em km:");
            distancia = Double.parseDouble(aux1);
            aux1 = JOptionPane.showInputDialog(null, "Digite o tempo de viagem em horas");
            tempo = Double.parseDouble(aux1);
            aux1 = JOptionPane.showInputDialog(null, "Digite a velocidade em km");
            velocidade = Double.parseDouble(aux1);
            distancia = tempo * velocidade;
            litrosusados = distancia / 12;
            JOptionPane.showMessageDialog(null, "A quantidade de litros usodos e de: " + litrosusados);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas números");
        }
    }
}
