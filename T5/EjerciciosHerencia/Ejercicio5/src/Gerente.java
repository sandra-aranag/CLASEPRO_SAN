public class Gerente extends  Empleado{

    private int bonus;

    public Gerente(String nombre, int salarioBase, int bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }


    public int calcularSalarioTotal(){
        return super.getSalarioBase()+this.bonus;
    }


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado: " + getNombre());
        System.out.println("Puesto: Gerente");
        System.out.println("Salario base: " +getSalarioBase()+ "€");
        System.out.println("Bonus:  " +bonus+ "€");
        System.out.println("Salario total: " +calcularSalarioTotal()+ "€");

    }
}
