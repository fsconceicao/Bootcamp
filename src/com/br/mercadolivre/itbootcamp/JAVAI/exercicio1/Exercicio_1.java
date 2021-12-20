package com.br.mercadolivre.itbootcamp.JAVAI;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n;

        System.out.println("Digite o valor de N:");
        n = sc.nextInt();

        exibeNpares(n);

    }

    public static void exibeNpares(Integer n){

        System.out.println("Exibindo o(s) " + n + " primeiros números pares");

        for(int i=0, j=0 ; i<n;i++){
            System.out.println(j);
            j+=2;
        }

    }

}
