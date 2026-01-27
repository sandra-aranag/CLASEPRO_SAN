package model;

public class LlamadaNacional extends Llamada implements Tarificable{

    private int franja;

    public LlamadaNacional(){}

    public LlamadaNacional(long nOrigen, long nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
        calcularCoste();
    }


    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Llamada Nacional");
        super.mostrarDatos();
    }

    @Override
    public void calcularCoste() {

    }
}
