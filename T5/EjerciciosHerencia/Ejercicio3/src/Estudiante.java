public class Estudiante extends Persona{
   /*Crea una clase Estudiante que
     herede de Persona y añada el atributo curso. Añade un metodo estudiar() en la clase Estudiante. Crea objetos y
     prueba todos los métodos.*/

    private String curso;


    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " +getNombre()+ " y tengo " +getEdad()+ " años.");

    }

    public void estudiar(){
        System.out.println("Estoy estudiando " +getCurso()+ "\n");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
