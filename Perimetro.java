
package atividades;
import javax.swing.*;

public class Perimetro {
    public static void main(String[] args) {
        try{
        double pi= 3.14, perimetro=0, raio=0;
       String aux1= "null";
       
       aux1 =JOptionPane.showInputDialog(null,"Insira o raio do circulo: ");
       raio =Double.parseDouble(aux1);
  
       
       perimetro= 2* pi* raio;
       JOptionPane.showMessageDialog(null, "O valor do perimetro é de: " + perimetro);
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Insira apenas números");
        }
    }
    
}
