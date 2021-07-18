package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inform uma temperatura em Farenheit: ");
        double farenheit = sc.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);

        System.out.println("A temperatura " + farenheit +" F é igual a " + celsius + "C ");
    }
}
