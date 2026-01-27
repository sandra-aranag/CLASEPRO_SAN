package model;

import lombok.Data;
import java.util.ArrayList;

@Data
public class Campeonato {

    private ArrayList<Coche> listaParticipantes;

    public Campeonato(ArrayList<Coche> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public ArrayList<Coche> getListaParticipantes() {
        return listaParticipantes;
    }
}