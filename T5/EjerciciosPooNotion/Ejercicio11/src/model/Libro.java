package model;


/*Crea un sistema de biblioteca con las clases: Libro (titulo, autor, ISBN, disponible), Usuario (nombre, numeroSocio)
y Prestamo (libro, usuario, fechaPrestamo). Implementa métodos para prestar un libro (si está disponible) y devolverlo.
Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.*/

public class Libro {

    private String titulo, autor, ISBN;
    private boolean disponible;

    public Libro(){}

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
