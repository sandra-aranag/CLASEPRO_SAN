package model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Administrador extends Usuario{

    public Administrador(String nombre, String apellido, String dni, String correo, String password) {
        super(nombre, apellido, dni, correo, password);
    }

    @Override
    public boolean esAdmin() {
        return true;
    }

}
