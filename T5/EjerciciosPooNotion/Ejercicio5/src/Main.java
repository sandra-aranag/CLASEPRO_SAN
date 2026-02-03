public class Main {

    public static void main(String[] args) {
        CuentaBancaria  primeraCuenta = new CuentaBancaria("Sandra", 2000);
        CuentaBancaria  segundaCuenta = new CuentaBancaria("Kurtis", 3000);
        CuentaBancaria  terceraCuenta = new CuentaBancaria("Rue", 5000);



        primeraCuenta.mostrarDatos();
        primeraCuenta.depositar(500);

        segundaCuenta.mostrarDatos();
        segundaCuenta.retirar(500);
        segundaCuenta.depositar(10);

        terceraCuenta.mostrarDatos();
        terceraCuenta.retirar(1000);

        System.out.println("\nSaldos finales: ");
        System.out.println(primeraCuenta.getTitular() + ": " + primeraCuenta.getSaldo());
        System.out.println(segundaCuenta.getTitular() + ": " + segundaCuenta.getSaldo());
        System.out.println(terceraCuenta.getTitular() + ": " + terceraCuenta.getSaldo());



    }

}
