package controller;

import model.Carrera;
import model.Coche;


import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CarreraController {

    private Random random = new Random();

    public void carreraSimulacion(Carrera carrera){
        for (Coche coche : carrera.getListaCoches()) {
            coche.setKmRecorridos(0);
        }

        boolean llegadoMeta = false;

        while(!llegadoMeta){
            for (Coche coche : carrera.getListaCoches()) {
                int avance = random.nextInt(31) + 20;
                coche.setKmRecorridos(coche.getKmRecorridos() + avance);

                if (coche.getKmRecorridos() >= carrera.getKmTotales()) {
                    llegadoMeta = true;
                }
            }
        }

        Collections.sort(carrera.getListaCoches(), new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                if (c2.getKmRecorridos() > c1.getKmRecorridos()) {
                    return 1;
                } else if (c2.getKmRecorridos() < c1.getKmRecorridos()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        asignarPuntos(carrera);
        mostrarPodio(carrera);
    }

    private void asignarPuntos(Carrera carrera) {
        carrera.getListaCoches().get(0).setPuntosAcumulados(carrera.getListaCoches().get(0).getPuntosAcumulados() + 10);
        carrera.getListaCoches().get(1).setPuntosAcumulados(carrera.getListaCoches().get(1).getPuntosAcumulados() + 8);
        carrera.getListaCoches().get(2).setPuntosAcumulados(carrera.getListaCoches().get(2).getPuntosAcumulados() + 6);
    }

    private void mostrarPodio(Carrera carrera) {
        System.out.println("==== ¡¡¡PODIO DE LA CARRERA!!! ==== ");
        System.out.println("1º Lugar: " + carrera.getListaCoches().get(0).getMarca() + " [10 pts]");
        System.out.println("2º Lugar: " + carrera.getListaCoches().get(1).getMarca() + " [8 pts]");
        System.out.println("3º Lugar: " + carrera.getListaCoches().get(2).getMarca() + " [6 pts]");
    }

    public void mostrarCampeon(Coche lider) {
        System.out.println("—————————————————————————————————————————");
        System.out.println("El ganador es: " + lider.getMarca() + " con dorsal " + lider.getDorsal());
        System.out.println("—————————————————————————————————————————");
    }

}

