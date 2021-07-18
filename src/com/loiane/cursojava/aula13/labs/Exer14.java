package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o tamanho do arquivo em MB:");
        double tamanhoDoArquivo = sc.nextDouble();

        System.out.println("Informe a velocidade da internet:");
        double velocidadeDaInternet = sc.nextDouble();

        double tempo = tamanhoDoArquivo / velocidadeDaInternet;

        System.out.println("O tempo de download é: " + tempo + " min");

    }
}
