package model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Trabajador extends Usuario{

    public Trabajador(String nombre, String apellido, String dni, String correo, String password) {
        super(nombre, apellido, dni, correo, password);
    }

    @Override
    public boolean esAdmin() {
        return false;
    }

}
