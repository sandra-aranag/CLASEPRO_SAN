public class Libro {

    /*Crea una clase Libro con atributos titulo, autor y paginas. Implementa tres constructores: uno sin parámetros
    (valores por defecto), uno con título y autor, y otro con los tres parámetros. Crea tres objetos usando cada
    constructor y muestra sus datos.*/

    private String titulo, autor;
    private int paginas;

    public Libro(){
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.paginas= 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDatos(){
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("paginas = " + paginas + " páginas");
    }


}
