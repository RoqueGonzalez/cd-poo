package com.campusdual.exercisespoo;

public class Exercise04 {
    // Sumar los 5 primeros numeros naturales
    // Sumar los 20 primeros numeros pares
    // Calcular el factorial de un numero que queramos

    public static void main(String[] args) {
        sumarPrimeros();
        System.out.print("El resultado de sumar los 5 primeros numeros es: ");
        System.out.println(sumarPrimeros());
        System.out.print("El resultado de sumar los 20 primeros numeros pares es: ");
        System.out.println(sumarPares());
        System.out.print("El resultado de calcular el factorial de 7 es: ");
        System.out.println(factorial());
    }

    public static int sumarPrimeros() {
        int suma = 1 + 2 + 3 + 4 + 5;
        return suma;
    }

    public static int sumarPares() {
        int suma = 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40;
        return suma;
    }
    public static int factorial(){
        int fact = 7*6*5*4*3*2*1;
        return fact;

    }


}