package exercicio01;

import javax.swing.JOptionPane;

/*Calcula o custo final de um produto que é composto de 3 matérias primas. Inicialmente são
lidos os valores dos três materiais. A fórmula é: Custo = M01 + 3 * M02 + 2 * M03, onde M0x é
uma matéria prima. Imprimir o valor do custo final;*/
public class Exercicio01 {


    public static void main(String[] args) {
        double m01, m02, m03, result;
        m01 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da materia prima 01: "));
        m02 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da materia prima 02: "));
        m03 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da materia prima 03: "));
        
        result = (m01 + 3) * (m02 + 2) * m03;
        JOptionPane.showInputDialog("O valor do custo final é: "+ result);
    }
    
}
