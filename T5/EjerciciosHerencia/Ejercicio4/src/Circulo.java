public class Circulo extends Figura{

        /*Crea una clase Figura con un metodo calcularArea(). Crea dos clases hijas: Circulo (con atributo radio) y
    Cuadrado (con atributo lado). Implementa el metodo calcularArea() en cada clase hija con la fórmula correspondiente.
    Crea objetos de cada tipo y muestra sus áreas.*/

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Círculo con radio: " + radio);
    }
}
