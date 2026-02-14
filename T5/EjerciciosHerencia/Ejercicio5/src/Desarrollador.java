public class Desarrollador extends Empleado {

    private String lenguajePrincipal;

    public Desarrollador(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

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
}
