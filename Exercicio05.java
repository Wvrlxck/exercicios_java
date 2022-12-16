/*Leia do usuário um número natural, calcule e exiba o seu fatorial conforme mostrado no
exemplo abaixo:*/
package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int x, res;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número natural: ");
        x = sc.nextInt();
        res = x;
        while (x > 1){
            res = res *(x-1); 
            x--;
        }
        System.out.println("O fatorial seu é:" + res);
    }
    
}
