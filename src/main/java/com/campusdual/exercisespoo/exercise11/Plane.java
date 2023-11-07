package com.campusdual.exercisespoo.exercise11;

public class Plane implements IMachine {
    private String name;
    public Plane(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void start() {
        System.out.println("El avión está encendido.");
    }
    @Override
    public void stop() {
        System.out.println("El avión está parado.");
    }
    @Override
    public void maintenance() {
        System.out.println("El avión está en mantenimiento.");
    }
    public void takeOff(){
        System.out.println("El avión esta despegando");
    }
    public void land(){
        System.out.println("El avión está aterrizando");
    }
    public void fly() {
        System.out.println("El avión está volando");
    }
    public String getDetails(){
        return "EL nombre del avion es: " + this.getName();
    }
}
