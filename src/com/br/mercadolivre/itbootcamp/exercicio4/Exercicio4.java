package com.br.mercadolivre.itbootcamp.exercicio4;

import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args) {

        int m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de m  que representa o valor limite [1 - m]:");
        m = scanner.nextInt();

        System.out.println("Os números primos entre 1 e " + m + " são:");
        for (int i=1; i<m;i++){
            if(isPrimo(i)){
                System.out.println(i);
            }
        }

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
