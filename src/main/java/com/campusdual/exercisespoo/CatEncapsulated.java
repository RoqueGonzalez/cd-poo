
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
public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;
    private String eyeColour = "Green";

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour,
                           boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return this.breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("La edad debe estar en positivo");
        }
    }
    public String getHair() {
        return this.hair;
    }
    public void setHair(String hair) {
        this.hair = hair;
    }
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isCastrated() {
        return this.castrated;
    }
    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }
    public String getEyeColour() {
        return this.eyeColour;
    }
    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void catEncapsulatedDetails() {
        System.out.println("Nombre: " + this.getName());
        System.out.println("Raza: " + this.getBreed());
        System.out.println("Sexo: " + this.getSex());
        System.out.println("Edad: " + this.getAge() + " meses");
        System.out.println("Tiene el pelo " + this.getHair() + " y de color " + this.getColour());
        System.out.println("Castrado: " + (this.isCastrated() ? "Sí" : "No"));
        System.out.println("Tiene los ojos: " + this.getEyeColour() + "\n\n");
    }
    public static void main(String[] args) {
        CatEncapsulated catE1 = new CatEncapsulated("Peke", "Persa", "Macho", 10, "Corto",
                "Negro",false);
        CatEncapsulated catE2 = new CatEncapsulated("Toti", "Esfinge", "Macho",20,
                "Corto", "Negro", false);
        CatEncapsulated catE3= new CatEncapsulated("Messi", "Siamesa", "Macho",30,
                "Corto", "Negro", false);

        catE1.setCastrated(true);
        catE2.setCastrated(true);

        catE1.setColour("Marron");
        catE2.setColour("Gris");

        catE3.setEyeColour("Amarillo");

        catE3.setAge(20);

        catE1.catEncapsulatedDetails();
        catE2.catEncapsulatedDetails();
        catE3.catEncapsulatedDetails();






    }
}
