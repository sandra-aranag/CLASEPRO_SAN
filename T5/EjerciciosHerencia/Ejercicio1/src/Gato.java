public class Gato extends Animal{


    public Gato(){}

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: miau miau\n");
    }
}
