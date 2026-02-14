public class Gerente extends  Empleado{

    private int bonus;

    public Gerente(int bonus) {
        this.bonus = bonus;
    }

    public Gerente(String nombre, int salarioBase, int bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }


    public int calcularSalarioTotal(int salarioTotal){
        return super.getSalarioBase()+this.bonus;
    }


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
