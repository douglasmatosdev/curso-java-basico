package com.douglas.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author doug
 *	Description: Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número]"
 */

public class Exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();
		
		System.out.printf("O número informado foi %.0f", numero);
		
		sc.close();
	}
}
