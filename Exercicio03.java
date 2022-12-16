/*Exiba a PA definida pelo usuário*/
package exercicio03;

import java.util.Scanner;

public class Exercicio03 {


    public static void main(String[] args) {
        int a, b, qtd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro elemento da PA: ");
        a = sc.nextInt();
        System.out.println("Entre com a razão da PA: ");
        b = sc.nextInt();
        System.out.println("Entre com a quantidade de elementos que deseja exibir: ");
        qtd = sc.nextInt();
        
        
        
        
        System.out.println("O resultado da PA é");
        while(qtd > 0){
           
           System.out.print(a+", ");
           a = a + b;
           qtd--;
        }

    }
    
}
