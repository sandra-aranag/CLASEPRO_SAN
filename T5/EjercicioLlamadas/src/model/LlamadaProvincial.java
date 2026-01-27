package model;

public class LlamadaProvincial extends Llamada implements Tarificable{

    private final double COSTE_SEG = 0.15;

    public LlamadaProvincial(){}

    public LlamadaProvincial(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Llamada Local");
        super.mostrarDatos();
    }

    @Override
    public void calcularCoste() {

    }
}
