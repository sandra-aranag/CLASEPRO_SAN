/*Crea una clase llamada Persona con dos atributos: nombre y edad. Define un constructor que inicialice estos atributos.
En el metodo main, crea un objeto de tipo Persona y muestra sus datos.*/


public class Persona {

    private String nombre;
    private int edad;

    public void mostrarPersona(){
        System.out.println("Los datos de la persona son:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public Persona(){}
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


/*Amplía la clase Persona del ejercicio anterior añadiendo métodos getter y setter para los atributos nombre y edad.
Crea un objeto, modifica sus valores usando los setters y muestra los datos usando los getters.*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
