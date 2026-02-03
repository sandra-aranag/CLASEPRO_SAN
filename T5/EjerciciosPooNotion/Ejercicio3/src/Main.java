public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        rectangulo.mostrarDatos();
        System.out.println("\nÁrea: "+rectangulo.calcularArea());
        System.out.println("Perímetro: " +rectangulo.calcularPerimetro());
    }

}
