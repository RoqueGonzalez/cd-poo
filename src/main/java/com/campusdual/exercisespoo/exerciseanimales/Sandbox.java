package com.campusdual.exercisespoo.exerciseanimales;

public class Sandbox {
    public static void main(String[] args) {
        Perro p1 = new Perro(120, 25, 8, "Domestico", "Negro", 4,
                "Canis lupus familiaris", "Balto", "Hogar", "Guau, Guau");
        Caballo c1 = new Caballo(160, 300, 18, "Pradera", "Negro", 4,
                "Equus caballus", "Spirit", "LLanura", " ¡hiiii, hiiii!");
        Halcon h1 = new Halcon(25, 10, 13, "Montañas", "Marron", "Negro",
                "falco", "Rony", "Cielo", "ra, ra, ra, ra");
        Pollo po1 = new Pollo(10, 50, 2, "Corral", "Amarillo", "Naranja",
                "Gallus gallus domesticus", "Calimero", "Granja", "Pio,pio");
        Delfin d1 = new Delfin(150, 60, 5, "costas", Boolean.FALSE, 3,
                "delphinidae", "Flipper", "oceano", "iiii iiii");
        Orca o1 = new Orca(700, 3000, 20, "salvaje", Boolean.FALSE, 3,
                "orcinus orca", "Willy", "oceano", "seshhhh");

        p1.presentarse();
        c1.presentarse();
        h1.presentarse();
        po1.presentarse();
        d1.presentarse();
        o1.presentarse();
    }
}
