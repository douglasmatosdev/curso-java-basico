package com.loiane.cursojava.aula14;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe é sua idade");

        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor 17 - pesquisar mais
        // > = 17 - muito caro

        System.out.println("Informe o valor do item.");
        double valor = sc.nextDouble();

        if (valor <=10) {
            System.out.println("Está barato, pode comprar.");
        } else if (valor > 10 && valor < 15){
            System.out.println("Pode pedir um desconto");
        } else if (valor >=15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else { // valor >= 17
            System.out.println("Muito caro!!!");
        }
    }
}
