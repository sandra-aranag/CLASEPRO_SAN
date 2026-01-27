package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Coche {

    private String marca, modelo;
    private int dorsal;
    private double kmRecorridos;
    private int puntosAcumulados;


    public Coche(String marca, String modelo, int dorsal) {
        this.marca = marca;
        this.modelo = modelo;
        this.dorsal = dorsal;
        this.kmRecorridos = 0.0;
        this.puntosAcumulados = 0;
    }
}
