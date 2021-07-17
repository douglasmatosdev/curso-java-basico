package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o valor/hora");
        double valorHora = sc.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        double horas = sc.nextDouble();

        double salario = valorHora * horas;

        System.out.println("O salário é de: " + salario);
    }
}
