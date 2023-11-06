package com.campusdual.exercisespoo.exercise09;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getDetails(){
        System.out.println("El nombre es: " + this.getName());
        System.out.println("y el apellido: " + this.getSurname());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Pedro","López");
        System.out.println("El nombre de la persona es " + p1.name + " y su apellido es " + p1.surname);
    }
}
