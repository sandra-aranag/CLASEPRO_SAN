package model;

import lombok.*;

@Data //getter y setters

public class Persona {

    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public Persona(){
        this.nombre = "Datos por defecto";
        this.apellido = "Datos por defecto";
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;

    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;

    }





}
