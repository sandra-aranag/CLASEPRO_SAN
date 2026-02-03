public class Main {

    public static void main(String[] args) {

        //Persona persona = new Persona("Sandra", 31);

        Persona persona1 = new Persona("Ana", 25);
        System.out.println("\nDatos sin modificar:");
        persona1.mostrarPersona();

        persona1.setNombre("Laura");
        persona1.setEdad(25);
        System.out.println("\nDatos modificados:");
        System.out.println("Nombre:" +persona1.getNombre());
        System.out.println("Edad: " +persona1.getEdad());
    }

}
