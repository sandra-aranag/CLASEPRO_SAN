public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlos Ruiz", "carlos.ruiz@gmail.com",
                new Direccion("Plaza Mayor 15", "Madrid", 28001));

        cliente1.mostrarDatos();
    }


}
