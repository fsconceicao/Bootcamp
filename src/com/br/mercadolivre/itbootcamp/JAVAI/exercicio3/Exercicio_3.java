package com.br.mercadolivre.itbootcamp.JAVAI.exercicio3;

import java.util.Scanner;

public class Exercicio_3 {


    public static void main(String args[]){

        Integer n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que deseja verificar se é primo: ");
        n = sc.nextInt();

        System.out.println(isPrimo(n)?"Eh primo":"Nao eh primo");
    }

    static boolean isPrimo(Integer n){

        if(n<2) return false;

        for(int i=n-1;i>1;i--){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
