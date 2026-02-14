package controller;

import model.Libro;
import model.Usuario;

public class Prestamo {

    /*Crea un sistema de biblioteca con las clases: Libro (titulo, autor, ISBN, disponible), Usuario (nombre, numeroSocio)
y Prestamo (libro, usuario, fechaPrestamo). Implementa métodos para prestar un libro (si está disponible) y devolverlo.
Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.*/

    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;

        libro.setDisponible(false);

    }

    public void devolverLibro(){
        libro.setDisponible(true);
        System.out.println("El libro " +libro.getTitulo()+ " ha sido devuelto.");
    }

    public String estaPrestado(){
        return "Libro: " +libro.getTitulo()+ " | Usuario: " +usuario.getNombre()+ " | Fecha: " + fechaPrestamo;
    }



}
