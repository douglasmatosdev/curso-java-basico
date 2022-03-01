package com.douglas.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author doug
 *	Description: Faça um programa que peça dois números e imprima a soma
 */

public class Exe03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double x1, x2, resultado;

		System.out.println("Digite dois números para soma: ");
		System.out.print("1° número: ");
		x1 = sc.nextDouble();
		System.out.print("2° número: ");
		x2 = sc.nextDouble();
		
		resultado = x1 + x2;
		
		System.out.printf("A soma de %.0f + %.0f é : %.0f", x1, x2, resultado);
		
		sc.close();
	}
}
