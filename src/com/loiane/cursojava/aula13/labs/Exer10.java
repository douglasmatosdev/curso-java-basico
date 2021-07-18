package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inform uma temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura " + celsius +" C é igual a " + farenheit + " F");
    }
}
