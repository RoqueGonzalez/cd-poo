package com.campusdual.exercisespoo;
/*Sintaxis de for
 * El bucle for consta de 3 partes:
 * Una expresión de inicialización (se ejecuta al principio, asignando a la variable de control un valor inicial)
 * Una expresión de condición que hará que el bucle se mantenga mientras que se cumpla
 * Una expresión de incremento/decremento sobre la variable de control para conseguir la finalización del bucle
 * El código que se repetirá en cada iteración será el que vaya entre llaves*/

public class EjerciciosRepaso {
    //Mostrar por pantalla los 30 primeros números pares PERO USANDO SOLO FOR
    public static void mostrar30NumerosPares() {
        for (int i = 2; i <= 60; i += 2) { //i+=2 --> i = i + 2
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //mostrar30NumerosPares();
        //calcularCuadrados();
        contarLetras('V');
    }

//    //Sumar los primeros 100 números naturales
//    public static void sumNumbers(int num) {
//        int sumaTotal = 0;
//        for (int i = 1; i <= num; i++) {
//            sumaTotal = sumaTotal + i; //tambien funcionaria con sumaTotal += i
//        }
//        System.out.println("La suma de los 100 primeros números naturales es " + sumaTotal);
//    }

// Calcular el cuadrado de los 20 primeros numeros naturales y mostrarlos
    public static void calcularCuadrados() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(" El cuadrado de " + i + " es " + (i * i));
        }
    }
// Construye un método que, recibiendo por parametro una letra del abedecadrio muestre por pantalla cuntas letras le faltan hasta llegar a la Z
    public static void contarLetras(char letra){
        int contador = 0;
        for (char i = letra; i <= 'Z'; i++) {
            contador++;
        }
        System.out.println("La cantidad de letras del abecedario que hay entre la " + letra + " y la Z, es: " + contador);
    }


}

