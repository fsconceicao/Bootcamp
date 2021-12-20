package com.br.mercadolivre.itbootcamp.JAVAI.exercicio2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Integer m;
        Integer n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o múltiplo:");
        m = sc.nextInt();

        System.out.println("Digite o numero de multiplos de " + m + " deseja exibir:");
        n = sc.nextInt();

        exibeMultiplos(n, m);
    }

    static void exibeMultiplos(Integer n, Integer m){

        int x =1;

        System.out.println("Os " + n + " primeiros múltiplos de " + m + " são:");

        while(n > 0){
            if( x%m == 0){
                System.out.println(x);
                n --;
            }
            x++;
        }
    }
}
