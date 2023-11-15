package com.campusdual.exercisespoo.exercise16;

public class Exercise16 {

    public static int division(int dividendo,int divisor){
        try {
            return dividendo / divisor;
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
            return -1; //Porque hay un error
        } finally {
            System.out.println("Método terminado");
        }
    }

    public static void main(String[] args) {
        System.out.println(division(15,3));
    }
}
