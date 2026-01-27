package model;

//Auqi guardamos todos los elementos comunes de las personas

public abstract class Persona {

    private String nombre, apellido;

    public Persona(){}
    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    //TODO: DARLE UNA VUELTA DE ABSTRACCION
    public abstract void saludar();

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}
