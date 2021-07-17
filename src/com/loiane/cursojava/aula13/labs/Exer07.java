package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inform o tamanho do lado do quadrado:");
        double lado = sc.nextDouble();

        // área = lado * lado
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é :" + area);
        System.out.println("O dobro da área do quadrado é :" + area * 2);
    }
}
