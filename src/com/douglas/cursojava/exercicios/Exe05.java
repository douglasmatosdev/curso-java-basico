package com.douglas.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author doug
 * Description: Faça um programa que converta metros em centimetros
 */
public class Exe05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double metros, centimetros;

		System.out.println("Conversão de m(metros) para cm(centimetros)");
		System.out.print("Entre com um valor em metros: ");
		metros = sc.nextDouble();
		centimetros = metros * 100;
		
		System.out.println("Resultado: " + metros + " m corresponde há " + centimetros + " cm");
		sc.close();
	}

}
