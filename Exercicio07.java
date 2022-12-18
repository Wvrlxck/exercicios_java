/* Dados dois vetores de tamanho N, verifique se os mesmos possuam conteúdo igual;*/

package atividade.exercicio07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int n=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o tamanho dos vetores ");
        n = input.nextInt();
        int vetor1[] = new int[n]; 
        int vetor2[] = new int[n];
        int i=0;
        System.out.println("Entre com o conteudo do primeiro vetor ");
        while(i<n){
            vetor1[i] = input.nextInt();  
            i++;
        }
        i=0;
        System.out.println("Entre com o conteudo do segundo vetor ");
        while(i<n){
            vetor2[i] = input.nextInt();  
            i++;
        }

        if(Arrays.equals(vetor1,vetor2)){
            System.out.println("vetor1  e vetor2 iguais");
        }else{
            System.out.print("vetor1  e vetor2 diferentes");
        }
    }
}
