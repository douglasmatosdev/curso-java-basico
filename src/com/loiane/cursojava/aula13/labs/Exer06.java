package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o raio de um círculo");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do cículo informado é : " + area);
    }
}
