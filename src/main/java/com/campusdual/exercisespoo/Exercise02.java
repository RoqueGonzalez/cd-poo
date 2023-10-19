package com.campusdual.exercisespoo;

public class Exercise02 {

    public static void main(String[] args) {
    // Área de un circulo = pi * r *r
    // Longitud de una circunferencia = pi * 2 * r
    // Área de un cuadrado = lado * lado

        double r = 7;
        double pi = Math.PI;
        double lado = 2.15;

        System.out.print("Área del círculo: ");
        System.out.println(pi*r*r);  //Tambien puedes poner MATH.PI en vez de pi
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(pi*2*r);
        System.out.print("Área del cuadrado: ");
        System.out.println(Math.pow(lado,2));

    }



}
