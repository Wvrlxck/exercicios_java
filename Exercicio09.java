/*
 Construa uma matriz 50 por 50 de números reais e depois de construída, colocar o conteúdo de
sua diagonal principal dentro de um vetor e depois do vetor montado, imprimir o vetor;*/

package atividade.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        double matriz[][] = new double [50][50];
        double vetor[] = new double [50]; 
        int j = 0;
        for(int i=0; i<50; i++){
            do{
                matriz[i][j]=j;
                j++;
            }while(j<50);
            j=0;
        }
        System.out.println("A diagonal principal é");
        for(int i=0; i<50; i++){
           
            System.out.print(" "+ matriz[i][i]);
        }        
               
            
           
        
        
        
        
        
        
    }
}
