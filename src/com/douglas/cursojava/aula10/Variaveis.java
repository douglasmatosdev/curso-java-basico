package com.douglas.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
	
		// Conveção Java
		int idade = 30;
		String nome = "Adão";
		String nomeDoMeuCachorro = "Kiara";
		String ano2014 = "2014";
		
		// Aceito, mas não é utilizado
		int _idade;
		int $idade;
		
		
		// Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 40;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// Má prática
		int a = 25;
		String b = "Adão";
	}

}
