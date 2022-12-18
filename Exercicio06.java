/*Leia duas strings e gera uma terceira string que é a intercalação da 1a com a 2a string lida*/
package atividade.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int a,b,tamanho,x=0;
        String texto1, texto2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a primeira string: ");
        texto1 = input.nextLine();
        System.out.println("Entre com a segunda string: ");
        texto2 = input.nextLine();
        
        a = texto1.length();
        b = texto2.length();
        tamanho = (a+b)+1;
        char texto3[] = new char[tamanho];
        
        if(a> b){
            int j =0;
            for(int i = 0; i < texto2.length(); i++){
                texto1.getChars(i, i+1, texto3, j);
                j++;
                
                texto2.getChars(i, i+1, texto3, j);
                j++;
                x=i+1;
            }   
            texto1.getChars(x, a, texto3, j);
        }else{
            int j =0;
            for(int i = 0; i < texto1.length(); i++){
                texto1.getChars(i, i+1, texto3, j);
                j++;
                
                texto2.getChars(i, i+1, texto3, j);
                j++;
                x=i+1;
            }   
            texto2.getChars(x, b, texto3, j);
            
        }
       
        System.out.println("O resultado da intercalação das duas strings é: ");
        for (char ch : texto3)
         System.out.print( ch );
        
    }
    
}
