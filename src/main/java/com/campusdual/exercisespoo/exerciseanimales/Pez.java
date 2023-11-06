package com.campusdual.exercisespoo.exerciseanimales;

public class Pez extends Animal{
    private String habitat;
    private Boolean tieneBranquias;
    private int numeroAletas;

    public Pez(int altura, int peso, int edad, String habitat, Boolean tieneBranquias, int numeroAletas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.tieneBranquias = tieneBranquias;
        this.numeroAletas = numeroAletas;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public Boolean getTieneBranquias() {
        return tieneBranquias;
    }
    public void setTieneBranquias(Boolean tieneBranquias) {
        this.tieneBranquias = tieneBranquias;
    }
    public int getNumeroAletas() {
        return numeroAletas;
    }
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
}
