public class Main {

    public static void main(String[] args) {

        /*Crea una clase Empleado con atributos nombre, puesto y salario. En el metodo main, crea un array de 5 empleados,
    inicialízalos con datos y luego muestra: todos los empleados, el empleado con mayor salario y el salario promedio.*/

        Empleado[] empleados = new Empleado[5];

        empleados[0] = new Empleado("Jose Ramiro", "Programador", 40000);
        empleados[1] = new Empleado("Marta Hernández", "Desarrollador", 35000);
        empleados[2] = new Empleado("Elena San Blas", "Administrativo", 18000);
        empleados[3] = new Empleado("Sandra Ortega", "Diseñadora", 25000);
        empleados[4] = new Empleado("Julia Sánchez", "Tester", 22000);

        int contador=1;
        System.out.println("Lista de empleados: ");
        for (Empleado empleado : empleados ) {
            System.out.println(contador + ". "
                    + empleado.getNombre() + " - "
                    + empleado.getPuesto() + " - "
                    + empleado.getSalario() + "€");
            contador++;
        }

        Empleado mayor = Empleado.obtenerMayorSalario(empleados);
        double promedio = Empleado.calcularPromedio(empleados);

        System.out.println("\nEmpleado con mayor salario: "
                + mayor.getNombre() + " ("
                + mayor.getSalario() + "€)");

        System.out.println("Salario promedio: " + promedio + "€");



    }

}
