package model;

import lombok.*;

@Data//tienes todos los getter, setter por lombok
//@NoArgsConstructor //ya tienes el constructor vacío
@AllArgsConstructor
public class Coche {

    //TODOS ESTOS ELEMENTOS SON VARIBLES QUE CUALIFICAN EL OBJETO DEL COCHE.
    //SOLO DEBEMOS PONER LO QUE NOS INTERESA DENTRO DEL PROGRAMA.
   private String marca, modelo, bastidor, matricula, color;
    private int caballos;
    private double precio;

    private boolean usado;

    public Coche(){

    }
                //ESTO SON REFERENCIAS Y ESTE ES EL PRIMER CONSTRUCTOR, QUE SIEMPRE TIENEN QUE SER PUBLICOS
    public Coche(String marca, String modelo, String bastidor, String color, int caballos){
        this.marca=marca;
        this.modelo=modelo;
        this.bastidor=bastidor;
        this.color=color;
        this.caballos=caballos;

    }

    public Coche (String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //GETTER
    /*public int getCaballos(){
        return this.caballos; //aqui PUEDES QUITAR EL THIS PORQUE ES EVIDENTE QUE REFERENCIA  ALO DE ARRIBA.
    }

    public void setCaballos(int caballos){
        //this.caballos = this.caballos+caballos;
        this.caballos += caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }*/

    @Override
    public String toString() {
        return this.modelo + " " + this.marca + " " + this.precio;
    }
}
