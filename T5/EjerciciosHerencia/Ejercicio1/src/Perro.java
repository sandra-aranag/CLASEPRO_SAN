public class Perro extends Animal{


    public Perro(){}

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: guau guau\n");
    }
}
