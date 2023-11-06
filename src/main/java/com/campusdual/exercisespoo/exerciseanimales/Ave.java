package com.campusdual.exercisespoo.exerciseanimales;

public class Ave extends Animal{
    private String habitat;
    private String colorPlumas;
    private String colorPico;

    public Ave(int altura, int peso, int edad, String habitat, String colorPlumas, String colorPico) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorPlumas = colorPlumas;
        this.colorPico = colorPico;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    public String getColorPico() {
        return colorPico;
    }
    public void setColorPico(String colorPico) {
        this.colorPico = colorPico;
    }
}
