package model;

public final class Fijo extends Profesor implements Inspector{


    private int pagaExtra;
    private int nHoras;


    public Fijo(){}

    public Fijo(String nombre, String apellido, int salario){
        super(nombre, apellido, salario);
        setnExperiencia(8);
    }
    public Fijo(String nombre, String apellido, int salario, int nHoras){
        super(nombre, apellido, salario);
        setnExperiencia(8);
        this.nHoras = nHoras;
    }


    public Fijo(String nombre, String apellido, int salario, int pagaExtra, int nHoras){
        this(nombre, apellido, salario, nHoras);
        this.pagaExtra=pagaExtra;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("pagaExtra = " + pagaExtra);
        System.out.println("nHoras = " + nHoras);
    }

   @Override
   public void corregirExamen(){
        super.corregirExamen();
       System.out.println("Soy un profesor fijo y corrijo muy duramente");
   }

   @Override
   public void saludar(){
       System.out.println("Chicos, vamos a dar la clase, como soy fijo es una superclase");
   }

   public void pedirCambioHoras(int nHoras){
        if(nHoras>this.nHoras){
            System.out.println("Quiero un cambio de horas");
        }else{
            System.out.println("No quiero un cambio de horas");
        }
   }



    public int getPagaExtra() {
        return pagaExtra;
    }

    public void setPagaExtra(int pagaExtra) {
        this.pagaExtra = pagaExtra;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public void realizarInspeccion(int nivel) {
        System.out.println("Vamos a inspeccionar");
        System.out.println("Soy fijo, por lo tanto soy un poco laxo. El nivel que aplico es "+nivel/2);
    }
}
