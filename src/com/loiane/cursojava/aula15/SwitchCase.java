package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe um dia da semana.");

        int diaDaSemana = sc.nextInt();

        if(diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if(diaDaSemana == 2) {
            System.out.println("Segunda-feira");
        } else if(diaDaSemana == 3) {
            System.out.println("Terça-feira");
        } else if(diaDaSemana == 4) {
            System.out.println("Quarta-feira");
        } else if(diaDaSemana == 5) {
            System.out.println("Quinta-feira");
        } else if(diaDaSemana == 6) {
            System.out.println("Sexta-feira");
        } else if(diaDaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia válido.");
        }

        switch(diaDaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira"); break;
            case 3: System.out.println("Terça-feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia válido.");
        }

    }
}
