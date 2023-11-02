package com.campusdual.exercisespoo;

public class CustomObject {
    private int actualFuel = 10; // cambio public por private
    private static String fuelLabel = "Gasolina";
    public int getActualFuel(){
        return this.actualFuel;
    }
    public void setActualFuel(int actualFuel){
        if (actualFuel >= 0){
            this.actualFuel = actualFuel;
        } else{
            System.out.println("La capacidad no puede ser negativa");
        }
    }
    public static String getFuelLabel(){
        return CustomObject.fuelLabel;
    }
    public static void setFuelLabel(String fuelLabel){
        CustomObject.fuelLabel = fuelLabel;
    }
    public void showDetails(){
        System.out.println("El tipo de combustible es: " + CustomObject.getFuelLabel());
    }

    public static void main(String[] args) {
        CustomObject cO = new CustomObject(); // Creamos una instancia de la clase CustomObject
        cO.showDetails(); // Accedemos de forma no estática al metodo del objeto (la instancia)
        CustomObject.setFuelLabel("Diésel");
        cO.showDetails();
        System.out.println("El tipo de combustible de la clase es: " + CustomObject.getFuelLabel());
    }
}
