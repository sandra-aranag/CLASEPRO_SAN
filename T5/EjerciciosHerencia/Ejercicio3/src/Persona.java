public abstract class Persona {

    /*Crea una clase Persona con atributos nombre y edad, y un metodo presentarse(). Crea una clase Estudiante que
     herede de Persona y añada el atributo curso. Añade un metodo estudiar() en la clase Estudiante. Crea objetos y
     prueba todos los métodos.*/

    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void presentarse();

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
    }

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
