package model;

public abstract class Llamada {

    //NO ES OBLIGATORIO METODOS ABSTRACTOS, SOLO SI QUIERO METODOS ABSTRACTOSS

    private static long nOrigen;
    private static long nDestino;
    private static int duracion;
    private static double coste;

    public Llamada(){}

    public Llamada(long nOrigen, long nDestino, int duracion){
        this.nOrigen=nOrigen;
        this.nDestino=nDestino;
        this.duracion=duracion;

    }

    public void mostrarDatos(){
        System.out.println("nOrigen = " + nOrigen);
        System.out.println("nDestino = " + nDestino);
        System.out.println("duracion = " + duracion);
        System.out.println("coste = " + coste);
    }

    public long getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(long nOrigen) {
        this.nOrigen = nOrigen;
    }

    public long getnDestino() {
        return nDestino;
    }

    public void setnDestino(long nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public static double getCoste() {
        return coste;
    }

    public static void setCoste(double coste) {
        Llamada.coste = coste;
    }
}
