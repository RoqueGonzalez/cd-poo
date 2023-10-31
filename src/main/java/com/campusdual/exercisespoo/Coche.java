package com.campusdual.exercisespoo;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String combustible;
    public int velocidad = 0;
    public int revoluciones = 0;
    public int giro = 0;

    public Coche(String marca, String modelo, int velocidadMaxima, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible;
    }

    public void arrancar() {
        this.revoluciones = 1000;
    }

    public void apagar() {
        if (this.velocidad == 0)
            this.revoluciones = 0;
    }

    public int acelerar() {
        if (this.revoluciones != 0) {
            if (this.velocidad < this.velocidadMaxima) {
                this.velocidad = this.velocidad + 10;
            }
        }
        return this.velocidad;
    }

    public int frenar() {
        if (this.velocidad > 0) {
            this.velocidad = this.velocidad - 10;
        }
        return this.velocidad;
    }

    public void girarVolante(int gradosDeGiro) {
        if (gradosDeGiro < 0) {
            System.out.println("Giro a la izquierda ");
        } else if (gradosDeGiro>0){
            if (gradosDeGiro>45) {
                gradosDeGiro = 45;
            }
            System.out.println("Giro a la derecha ");
        } else {
            if (gradosDeGiro<-45) {
                gradosDeGiro = -45;
            }
            System.out.println("Pongo el volante recto");
        }
        this.giro = gradosDeGiro;
    }

    public void marchaAtras() {
        System.out.println("Coche marcha atrás ");
    }

    public void mostrarDetalles() {
        System.out.println(this.marca + " " + this.modelo + " Max " + this.velocidadMaxima + "Km/h " + this.combustible);
        System.out.println(this.velocidad + " km/h - " + this.revoluciones + " RPM - " + this.giro + "ºde giro");
    }

    public static void main(String[] args) {
        System.out.println("== Creo el coche");
        Coche miCoche = new Coche("Seat", "Ibiza", 170, "Gasolina");
        System.out.println("-Muestro los detalles del coche-");
        miCoche.mostrarDetalles();
        System.out.println("-Arranco el coche-");
        miCoche.arrancar();
        miCoche.mostrarDetalles();
        System.out.println("-Acelero el coche-");
        for (int i = 0; i < 20; i++) {
            miCoche.acelerar();
        }
        miCoche.mostrarDetalles();
        System.out.println("-Freno el coche-");
        for (int i = 0; i < 25; i++) {
            miCoche.frenar();
        }
        miCoche.mostrarDetalles();
        System.out.println("-Apago el coche-");
        miCoche.apagar();
        miCoche.mostrarDetalles();
        System.out.println("-Mostrar detalles-");
        miCoche.mostrarDetalles();
        System.out.println("-Giramos el volante-");
        miCoche.girarVolante(15);
        miCoche.mostrarDetalles();
        System.out.println("-Giramos el volante-");
        miCoche.girarVolante(-10);
        miCoche.mostrarDetalles();
        System.out.println("-Giramos el volante-");
        miCoche.girarVolante(0);
        miCoche.mostrarDetalles();
    }
}
