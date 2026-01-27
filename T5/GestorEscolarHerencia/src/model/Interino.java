package model;

public final class Interino extends Profesor {

    private int horasOposicion;
    private boolean estadoBolsa;


    public Interino(String nombre, String apellido, int salario, int horasOposicion) {
        super(nombre, apellido, salario);
        this.horasOposicion = horasOposicion;
    }

    public Interino(String nombre, String apellido, int salario, int horasOposicion, boolean estadoBolsa) {
        super(nombre, apellido, salario, horasOposicion);
        this.estadoBolsa = estadoBolsa;
    }

    public void realizarOposicion(){
        System.out.println("Voy a realizar la oposición");
        if((int)(Math.random()*2)>0){
            this.estadoBolsa=true;
            System.out.println("He aprobado");
        }else {
            System.out.println("Me quedo como estoy");
        }
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Soy un interino, te saludo");
    }

    public int getHorasOposicion() {
        return horasOposicion;
    }

    public void setHorasOposicion(int horasOposicion) {
        this.horasOposicion = horasOposicion;
    }

    public boolean isEstadoBolsa() {
        return estadoBolsa;
    }

    public void setEstadoBolsa(boolean estadoBolsa) {
        this.estadoBolsa = estadoBolsa;
    }
}
