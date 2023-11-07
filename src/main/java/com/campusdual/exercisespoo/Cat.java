package com.campusdual.exercisespoo;

/*
Crea una clase llamada Cat
La clase debe tener las siguientes propiedades sin inicializar:
- nombre (name)
- raza (breed)
- sexo (sex)
- edad en meses (age) (estática)
- tamaño del pelo (hair)
- color del pelo (colour) (estática)
- un booleano que indique si está castrado/a o no (castrated)I
La clase debe tener las siguientes propiedades con los valores inicializados
- el color de los ojos (eyeColour): "green"
 Crea un constructor que incluya todos los atributos no inicializados
 Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos
 Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque
 Crea un método que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado
 Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)
 Crea un main()
 Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge
 Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)
 Cámbiale el color del pelo a los dos primeros gatos
 Cámbiale el color de los ojos al último gato
 Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)
 Vuelve a hacer el ejercicio en una nueva clase aplicando la encapsulación (atributos private, getters y setters)
 Verás cómo afecta a los métodos estáticos
*/
public class Cat {
    public String name;
    public String breed;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;
    private String eyeColour = "Green";

    public Cat(String name, String breed, int age, String hair, String colour, Boolean castrated) {
        this.name = name;
        this.breed = breed;
        Cat.age = age;
        this.hair = hair;
        Cat.colour = colour;
        this.castrated = castrated;
    }
    public static void changeColour(String newColour) {
        Cat.colour = newColour;
    }
    public void changeEyeColour(String newEyeColour) {
        this.eyeColour = newEyeColour;
    }
    public static void changeAge(int newAge) {
        if(newAge>0){
            Cat.age = newAge;
        } else{
            System.out.println("No se puede poner la edad en negativo");
        }
    }
    public void showAge() {
        System.out.println("La edad del gato es: " + Cat.age);
    }
    public void castrar(){
        this.castrated = true;
    }
    public boolean isCastrated(){
        return this.castrated;
    }
    public void catDetails() {
        System.out.println("Nombre: " + this.name);
        System.out.println("Raza: " + this.breed);
        System.out.println("Edad: " + Cat.age + " meses");
        System.out.println("Tiene el pelo " + this.hair + " y de color " + Cat.colour);
        System.out.println("Castrado: " + (this.castrated ? "Sí" : "No"));
        System.out.println("Tiene los ojos: " + this.eyeColour + "\n\n");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Peke","Persa",10,"Corto","Negro",false);
        Cat cat2 = new Cat("Toti","Esfinge",20,"Corto","Negro",false);
        Cat cat3 = new Cat("Messi","Siamesa",30,"Corto","Negro",false);

        cat1.castrar();
        cat2.castrar();

        Cat.changeColour("Marrón");
        Cat.changeColour("Gris");

        cat3.changeEyeColour("Amarillo");

        Cat.changeAge(-25);

        cat1.catDetails();
        cat2.catDetails();
        cat3.catDetails();
    }
}