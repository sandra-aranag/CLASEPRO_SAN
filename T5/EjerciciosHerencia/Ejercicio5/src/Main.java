public class Main {

    /*Crea una clase Empleado con atributos nombre y salarioBase. Crea dos clases hijas: Gerente (con atributo bonus) y
    Desarrollador (con atributo lenguajePrincipal). Implementa un metodo calcularSalarioTotal() en Gerente que sume
    el bonus al salario base. Crea objetos de ambos tipos y muestra su información completa.*/
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ana García", 40000, 10000);
        Desarrollador desarrollador = new Desarrollador("Sandra Arana", 30000, "Java");

        gerente.mostrarDatos();
        desarrollador.mostrarDatos();

    }

}
