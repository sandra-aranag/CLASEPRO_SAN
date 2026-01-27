package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.Collections;
import java.util.Comparator;

public class CampeonatoController {

    private CarreraController carreraController = new CarreraController();

    public void empezarCampeonato(Campeonato campeonato, int numCarreras, int kmPorCarrera) {

        for (int i = 1; i <= numCarreras; i++) {
            System.out.println("\n––– CARRERA " + i + " DE " + numCarreras + " –––");

            Carrera carrera = new Carrera(kmPorCarrera, campeonato.getListaParticipantes());
            carreraController.carreraSimulacion(carrera);
            mostrarClasificacionGeneral(campeonato);
        }

    }

    private void mostrarClasificacionGeneral(Campeonato campeonato) {
        Collections.sort(campeonato.getListaParticipantes(), new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                return Integer.compare(c2.getPuntosAcumulados(), c1.getPuntosAcumulados());
            }
        });

        System.out.println("\n=== CLASIFICACIÓN GENERAL ===");
        System.out.printf("%-10s %-15s %-10s %-10s%n", "Posición", "Piloto", "Dorsal", "Puntos");

        for (int i = 0; i < campeonato.getListaParticipantes().size(); i++) {
            Coche c = campeonato.getListaParticipantes().get(i);
            System.out.printf("%-10d %-15s %-10d %-10d%n", (i + 1), c.getMarca(), c.getDorsal(), c.getPuntosAcumulados());
        }
    }
}