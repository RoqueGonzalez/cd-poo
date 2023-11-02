
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
    private static int age;
    private String hair;
    private static String colour;
    private Boolean castrated;
    private String eyeColour = "Green";
    public CatEncapsulated(String name, String breed, String hair, Boolean castrated, String eyeColour) {
        this.name = name;
        this.breed = breed;
        this.hair = hair;
        this.castrated = castrated;
        this.eyeColour = eyeColour;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static int getAge() {
        return age;
    }
    public static void setAge(int newAge) {
        CatEncapsulated.age = newAge;
    }
    public String getHair() {
        return hair;
    }
    public void setHair(String hair) {
        this.hair = hair;
    }
    public static String getColour() {
        return colour;
    }
    public static void setColour(String newColour) {
        CatEncapsulated.colour = newColour;
    }
    public Boolean getCastrated() {
        return castrated;
    }
    public void setCastrated(Boolean castrated) {
        this.castrated = castrated;
    }
    public String getEyeColour() {
        return eyeColour;
    }
    public void setEyeColour(String newEyeColour) {
        this.eyeColour = newEyeColour;
    }

    public static void changeColour(String newColour){
        setColour(newColour);
    }
    public void changeEyeColour(String newEyecolour){
        setEyeColour(newEyecolour);
    }
    public static void changeAge(int newAge){
        if(newAge>0){
            CatEncapsulated.setAge(newAge);
        } else {
            System.out.println("Tiene que ser un nº positivo");
        }
    }
    public void showAge(){
        System.out.println("La edad del gato es: ");
    }
    public void castrar(){
        setCastrated(true);
    }
    public boolean isCastrated(){
        return this.castrated;
    }
    public void catDetails() {
        System.out.println("Nombre: " + getName());
        System.out.println("Raza: " + getBreed());
        System.out.println("Edad: " + CatEncapsulated.getAge() + " meses");
        System.out.println("Tiene el pelo " + getHair() + " y de color " + CatEncapsulated.getColour());
        System.out.println("Castrado: " + (getCastrated() ? "Sí" : "No"));
        System.out.println("Tiene los ojos: " + getEyeColour() + "\n\n");
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Peke", "Persa", 10, "Corto", "Negro", Boolean.FALSE);
        Cat cat2 = new Cat("Toti", "Esfinge", 20, "Corto", "Negro", Boolean.FALSE);
        Cat cat3 = new Cat("Messi", "Siamesa", 30, "Corto", "Negro", Boolean.FALSE);

        cat1.castrar();
        cat2.castrar();

        CatEncapsulated.changeColour("Marrón");

        CatEncapsulated.changeAge(25);


    }
}
