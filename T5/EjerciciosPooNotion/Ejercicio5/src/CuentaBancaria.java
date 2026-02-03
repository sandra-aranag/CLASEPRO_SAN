
/*Crea una clase CuentaBancaria con atributos titular y saldo. Implementa métodos depositar(cantidad) y retirar(cantidad).
Crea tres cuentas diferentes, realiza varias operaciones en cada una y muestra el saldo final de todas.*/

public class CuentaBancaria {

    private String titular;
    private double saldo, cantidad;


    public CuentaBancaria(){}
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarDatos(){
        System.out.println("\nCuenta de: " + titular);
        System.out.println("Saldo de: " + saldo + "€");
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if (cantidad > 0){
            this.saldo += cantidad;
        }
        System.out.println("Depósito de " + cantidad + "€. Nuevo saldo: " + saldo + "€");
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= this.saldo){
            this.saldo -= cantidad;
        }

        System.out.println("Retiro de " + cantidad + "€. Nuevo saldo: " + saldo + "€");
    }
}
