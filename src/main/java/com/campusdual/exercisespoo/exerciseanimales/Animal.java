package com.campusdual.exercisespoo.exerciseanimales;

public class Animal {
    private int altura;
    private int peso;
    private int edad;

    public Animal(int altura, int peso, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
