package com.campusdual.exercisespoo;

public class Exercise05 {
    // Comprobar si un nº es positivo o negativo. Mayor o menor que 0
    // Comprobar si un nº es multiplo de otro. Resto de la division es 0
    // Comprobar si un nº es menor a otro. Mayor que el otro

    public static void main(String[] args) {
        System.out.print("Comprobar si el nº es positivo o negativo: " );
        esPositivo(-4);
        System.out.print("Comprobar si un nº es multiplo de otro: ");
        esMultiplo(4,2);
        System.out.print("Comprobar si es mayor o menor: ");
        esMayor(4,4);
    }
public static void esPositivo(int numero){
        if (numero>=0){
            System.out.println("Es un nº positivo");
        }else {
            System.out.println("Es un nº negativo");
        }
        }

   public static void esMultiplo(int num1, int num2){
        if (num1 % num2==0){
            System.out.println(num1 + " Es multiplo de " + num2);
        }else {
            System.out.println(num1 + " No es multiplo de " + num2);
        }
   }
public static void esMayor (int numero1,int numero2){
    if (numero1 < numero2) {
        System.out.println(numero1 + " es menor que " + numero2);
    } else if (numero1 > numero2) {
        System.out.println(numero1 + " es mayor que " + numero2);
    } else {
        System.out.println(numero1 + " es igual a " + numero2);
    }
    }
    }














