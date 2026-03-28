package controller;

import model.Biblioteca;
import model.Libro;

import java.util.List;

public class BibliotecaController {

    Biblioteca biblioteca = new Biblioteca();

   /* ––––––––––––––––––––––––––––––––––––
    1.- AGREGAR LIBROS A LA BIBLIOTECA
    –––––––––––––––––––––––––––––––––––– */

    public void agregarLibro(Libro libro){
        biblioteca.getLibros().add(libro);
    }

    /* ––––––––––––––––––––––––––––––––––––
    2.- OBTENER LIBROS BIBLIOTECA
    –––––––––––––––––––––––––––––––––––– */

    public List<Libro> obtenerLibros(){
        return biblioteca.getLibros();
    }

    /* ––––––––––––––––––––––––––––––––––––
    3.- AÑADIR LIBROS A FAVORITOS
    –––––––––––––––––––––––––––––––––––– */

    public void agregarFavorito(int id) {
        for (Libro libro : biblioteca.getLibros()) {
            if (libro.getId() == id) {
                if (!biblioteca.getFavoritos().contains(libro)) {
                    biblioteca.getFavoritos().add(libro);
                    System.out.println("El libro ha sido añadido a 'favoritos' correctamente.");
                } else {
                    System.out.println("¡Error! El libro seleccionado ya estaba en favoritos.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado en la biblioteca. Por favor, inserta un ID válido.");
    }


    /* ––––––––––––––––––––––––––––––––––––
    4.- OBTENER LISTA DE FAVORITOS
    –––––––––––––––––––––––––––––––––––– */

    public List<Libro> obtenerFavoritos(){
        return biblioteca.getFavoritos();
    }


}







