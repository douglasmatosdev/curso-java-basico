package com.douglas.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author doug
 * Description: Faça um programa que peça um raio de um circulo, calcule e mostre sua área.
 */
public class Exe06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular a área de um circulo");
		
		double raio, area;
		double PI = 3.14159;
				
		System.out.print("Informe o valor do raio: ");
		raio = sc.nextDouble();
		
		area = PI * (raio * raio);
		
		System.out.printf("A área do circulo é %.5f", area);
		
		sc.close();
	}

}
