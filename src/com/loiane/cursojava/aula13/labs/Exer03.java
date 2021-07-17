package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        int resultado = primeiroNumero + segundoNumero;

        System.out.println("A soma dos valores informados é: " + resultado);
    }
}
