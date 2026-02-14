package model;

/*Crea un sistema de biblioteca con las clases: Libro (titulo, autor, ISBN, disponible), Usuario (nombre, numeroSocio)
y Prestamo (libro, usuario, fechaPrestamo). Implementa métodos para prestar un libro (si está disponible) y devolverlo.
Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.*/

public class Usuario {

    private String nombre;
    private int numeroSocio;

    public Usuario(){}

    public Usuario(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
}
