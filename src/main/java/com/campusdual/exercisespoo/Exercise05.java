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
        esMayor(5,2);
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
public static void esMayor (int n,int n2){
       if (n > n2){
           System.out.println("Es mayor");
       }else{
           System.out.println("Es menor");
       }
}


}










