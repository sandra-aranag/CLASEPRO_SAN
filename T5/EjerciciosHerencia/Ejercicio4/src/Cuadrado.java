public class Cuadrado extends Figura{

        /*Crea una clase Figura con un metodo calcularArea(). Crea dos clases hijas: Circulo (con atributo radio) y
    Cuadrado (con atributo lado). Implementa el metodo calcularArea() en cada clase hija con la fórmula correspondiente.
    Crea objetos de cada tipo y muestra sus áreas.*/

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuadrado con lado: " + lado);
    }
}
