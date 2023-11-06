package com.campusdual.exercisespoo.exerciseanimales;

public class Pollo extends Ave{
    private String nombreCientifico;
    private String nombre;
    private String territorio;
    private String sonido;

    public Pollo(int altura, int peso, int edad, String habitat, String colorPlumas, String colorPico,
                 String nombreCientifico, String nombre, String territorio, String sonido) {
        super(altura, peso, edad, habitat, colorPlumas, colorPico);
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.territorio = territorio;
        this.sonido = sonido;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    public void presentarse() {
        System.out.println(getSonido() + "; Soy " + getNombre());
    }
}
