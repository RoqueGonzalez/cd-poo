package com.campusdual.exercisespoo.exerciseanimales;

public class Mamifero extends Animal{
    private String habitat;
    private String colorPelo;
    private int numeroPatas;

    public Mamifero(int altura, int peso, int edad, String habitat, String colorPelo, int numeroPatas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorPelo = colorPelo;
        this.numeroPatas = numeroPatas;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public int getNumeroPatas() {
        return numeroPatas;
    }
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
