/*Exiba a sequência de Fibonacci definida pelo usuário;*/
package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
 
    public static void main(String[] args) {
        int a, b, x, qtd;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro elemento: ");
        a = sc.nextInt();
        System.out.println("Entre com o segundo elemento: ");
        b = sc.nextInt();
        System.out.println("Entre com a quantidade de elementos que deseja exibir: ");
        qtd = sc.nextInt();
        
        System.out.println("O resultado da sua sequencia de Fibonacci é:");
        System.out.print(a+", "+b+", ");
        
        while(qtd > 0){
           x = a + b;
           b = a;
           a = x;
           System.out.print(a+", ");
           qtd--;
        }
    }
    
}
