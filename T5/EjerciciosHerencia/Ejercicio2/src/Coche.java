public class Coche extends Vehiculo{
    
    private int numPuertas;

    public Coche(String marca, int modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numPuertas = " + numPuertas);
    }
}
