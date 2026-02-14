public abstract class Vehiculo {

    /*Crea una clase Vehiculo con atributos marca y modelo. Crea una clase Coche que herede de Vehiculo y añada el
    atributo numeroPuertas. Implementa constructores en ambas clases usando super(). Crea varios objetos y muestra
    su información.*/

    private String marca;
    private int modelo;

    public Vehiculo(){}
    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println("Vehículo: " + marca);
        System.out.println("modelo = " + modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

}
