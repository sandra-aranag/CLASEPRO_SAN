public class Producto {

    /*Crea una clase Producto con atributos nombre, precio y cantidad. Sobrescribe el metodo toString() para mostrar
   la información del producto de forma legible. Crea varios productos y muéstralos usando System.out.println().*/

    private String nombre;
    private double precio;
    private int cantidad;


    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
