package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o valor/hora");
        double valorHora = sc.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double irff = (salarioBruto / 100) * 11;
        double totalDeDescontos = inss + sindicato + irff;
        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + irff);
        System.out.println("Total de descontos: " + totalDeDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
