package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor

public class Carrera {

    private int kmTotales;
    private ArrayList<Coche> listaCoches;


    public Carrera(int kmTotales, ArrayList<Coche> listaCoches) {
        this.kmTotales = kmTotales;
        this.listaCoches = listaCoches;
    }
}
