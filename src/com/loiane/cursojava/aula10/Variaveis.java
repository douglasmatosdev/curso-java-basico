package com.loiane.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {

        // Convenção Java
        int idade = 20;
        String nome = "Douglas";
        String nomeDoMeuCachorro = "Kiara";

        // Aceito, mas não é utilizado
        int _idade;
        int $idade;
        String ano2014;

        // Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // má prática
        int a = 10;
        String b = "João";
    }
}
