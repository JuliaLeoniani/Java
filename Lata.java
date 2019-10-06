 package atividades;
import javax.swing.*;
public class Lata {
    public static void main(String[] args) {
        try{
        double pi=3.14159, raio=0, altura=0, res=0;
        String aux1="null";
        aux1=JOptionPane.showInputDialog("Digite o valor do raio ");
        raio=Double.parseDouble(aux1);
        aux1=JOptionPane.showInputDialog("Digite a altura: ");
        altura= Double.parseDouble(aux1);
        res = pi * raio*raio *altura;
        JOptionPane.showMessageDialog(null, "O volume da lata de óleo é: " + res);
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Digite apenas números");
        } 
    }
    
}
