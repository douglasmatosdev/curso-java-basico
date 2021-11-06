package com.douglas.cursojava.aula07;

class Erro03 {

    // O método main foi definido com a letra inicial maiúscula
    // isso irá gerar um erro:
    // Error: Main method not found in class Erro03, please define the main method
    // as: public static void main(String[] args
    
    // public static void Main(String[] args) {
    public static void main(String[] args) {

        System.out.println("Você digitou: " + 1 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero at Erro03.main(Erro03.java:11)
    }
}