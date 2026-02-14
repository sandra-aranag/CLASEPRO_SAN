public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);
        Cuadrado cuadrado = new Cuadrado(4.0);

        circulo.mostrarDatos();
        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        
        cuadrado.mostrarDatos();
        System.out.printf("Área: %.2f%n", cuadrado.calcularArea());

    }


}
