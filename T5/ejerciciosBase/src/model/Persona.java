package model;

import lombok.*;

@Data //getter y setters

public class Persona {
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;
    private char genero;

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Género: " + genero);

    }

    public Persona() {
        this.nombre = "Datos por defecto";
        this.apellido = "Datos por defecto";
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        this.genero = 0;

    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
        this.genero = 'U';
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        this.genero = 0;

    }

    public void incrementarEdad(int incremento) {
        this.edad += incremento;
    }

    //Un metodo que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula
    // IMC = peso / (altura * altura)

    public double calculadoraImc() {
        double alturaMetros = this.altura / 100.0;
        return this.peso / (alturaMetros * alturaMetros);
    }

    public String estadoFisico() {
        double imc = calculadoraImc();

        if (genero == 'M'){
            return estadoHombre(imc);
        }else{
            return estadoMujer(imc);
        }



    }

    private String estadoHombre(double imc){
        if (imc < 20){
            return "Bajo peso";
        } else if (imc >= 20 && imc <=27) {
            return "Normopeso";
        }else if (imc >=27 && imc <=30){
            return "Sobrepeso";
        } else if (imc >=30 && imc <=40) {
            return "Obesidad";
        }else {
            return "Obsesidad mórbida";
        }
    }

    private String estadoMujer(double imc){
        if (imc < 20){
            return "Bajo peso";
        } else if (imc >= 20 && imc <=25) {
            return "Normopeso";
        }else if (imc >=25 && imc <=30){
            return "Sobrepeso";
        } else if (imc >=30 && imc <=40) {
            return "Obesidad";
        }else {
            return "Obsesidad mórbida";
        }
    }
}
