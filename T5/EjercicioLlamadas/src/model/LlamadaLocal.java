package model;

public class LlamadaLocal extends Llamada implements Regulable{


    public LlamadaLocal(){}

    public LlamadaLocal(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Llamada Local");
        super.mostrarDatos();
    }


    @Override
    public boolean regularNumeros() {
        return getnOrigen()%2==0;
    }
}
