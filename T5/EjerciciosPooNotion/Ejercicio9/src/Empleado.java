public class Empleado {

    /*Crea una clase Empleado con atributos nombre, puesto y salario. En el metodo main, crea un array de 5 empleados,
    inicialízalos con datos y luego muestra: todos los empleados, el empleado con mayor salario y el salario promedio.*/

    private String nombre, puesto;
    private double salario;


    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }


    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("puesto = " + puesto);
        System.out.println("salario = " + salario);
    }

    @Override
    public String toString() {
        return "Lista de empleados:{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static Empleado obtenerMayorSalario(Empleado[] empleados) {

        Empleado mayor = empleados[0];

        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > mayor.getSalario()) {
                mayor = empleado;
            }
        }

        return mayor;
    }

    public static double calcularPromedio(Empleado[] empleados) {

        double suma = 0;

        for (Empleado empleado : empleados) {
            suma += empleado.getSalario();
        }

        return suma / empleados.length;
    }


}
