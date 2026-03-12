public class Desarrollador extends Empleado {

    private String lenguajePrincipal;


    public Desarrollador(String nombre, int salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Puesto: Desarrollador");
        System.out.println("Salario base: " +getSalarioBase()+ "€");
        System.out.println("Lenguaje principal: " + lenguajePrincipal);

    }
}
