/*Leia do usuário dois números naturais maiores que zero, calcule e exiba o MMC deles;*/
package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
         
        int a, b, n1, n2, resto;
        do{
        a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número natural: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo número natural: "));
        }while(a<1 || b<1);
        n1 = a;
        n2 = b;
                
      while (b != 0) {
         resto = a % b;
         a = b;
         b = resto;
      }

      JOptionPane.showInputDialog("O MMC de "+n1+" e "+n2+" é: " + n1 * n2 / a); 
    
    }
}
