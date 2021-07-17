package com.loiane.cursojava.aula11;

public class CuriosidadeInt {

    public static void main(String[] args) {

        int var1 = 2147483647; // já está no valor máximo de um tipo 'int'

        int var2 = 100;

        System.out.println(var1 + var2); // -2147483549

        // O resultado vai ser o menor valor suportado pelo tipo 'int' que é -2147483549
    }
}
