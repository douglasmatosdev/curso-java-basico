package com.douglas.cursojava.aula07;

class Erro02 {
    public static void main(String[] args) {

        // var int cont; // Semântica, regras de específicas de cada linguagem para definição de variáveis
        // int cont;
        int cont = 0;
        System.out.println("Você digitou: " + cont); // Erro de semâtica, tentando usar uma variável que não foi inicializada.
    }
}