package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe um valor em metros:");
        double metros = sc.nextDouble();

        // 1m = 100cm
        double cm = metros * 100;

        System.out.println(metros + "m é igual a " + cm + "cm");
    }
}
