package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número inteiro");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número inteiro");
        int numero2 = sc.nextInt();

        System.out.println("Digite um número real");
        double numero3 = sc.nextDouble();

        int resultado1 = (numero1 * numero2) * (numero2 / 2);
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);

    }
}
