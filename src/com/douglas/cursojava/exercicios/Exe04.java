package com.douglas.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author doug
 *
 * Description: Faça um programa que peça as 4 notas bimestrais e mostre a média.
 */
public class Exe04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe todas as 4 notas na linha abaixo");
		System.out.print("Notas: ");
		String strNotas = sc.nextLine();
		
		String[] listNotas = strNotas.split(" ");
		double media = 0.0;
		
		for (String nota : listNotas) {
			double n = Double.parseDouble(nota);
			media += n;
		}
		
		media = media / listNotas.length;
				
		System.out.printf("A média é: %.2f", media);
		
		sc.close();
	}

}
