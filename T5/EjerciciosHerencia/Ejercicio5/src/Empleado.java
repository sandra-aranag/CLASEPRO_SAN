public abstract class Empleado {

    private String nombre;
    private int salarioBase;

    public Empleado(){}
    public Empleado(String nombre, int salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("salarioBase = " + salarioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
}
