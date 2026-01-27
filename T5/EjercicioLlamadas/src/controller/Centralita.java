package controller;

import model.Llamada;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double caja;
    public Centralita(){
        listaLlamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        this.caja+=llamada.getCoste();
    }

    public void mostrarLlamadas(){

        listaLlamadas.forEach(Llamada::mostrarDatos);

    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
