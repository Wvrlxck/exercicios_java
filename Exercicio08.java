/*
 Leia um vetor com 10 nomes de pessoas, após pedir que o usuário digite um nome qualquer de
pessoa. Escrever a mensagem “ACHEI”, se o nome estiver armazenado no vetor ou “NÃO
ACHEI”
caso contrário;*/

package atividade.exercicio08;

import java.util.Scanner;


public class Exercicio08 {

    public static void main(String[] args) {
        int n=10;
        String [] vetor1 = new String[n]; 
        String nome;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com os nomes do vetor");
        
        for (int i=0; i<n; i++) {
            vetor1[i] = input.nextLine();
        }
        
        System.out.println("Entre com o nome que deseja buscar");
        nome = input.nextLine();
        boolean achou = false;
        
        for (int i=0; i<n; i++){
        if(nome.compareTo(vetor1[i])==0){
            System.out.println("ACHEI");
            achou = true;
        }
        
        }
        if(achou ==false){
            System.out.println("NAO ACHEI");
        }
    }
}
