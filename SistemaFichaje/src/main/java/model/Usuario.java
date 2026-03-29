package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Usuario {

    private String nombre, apellido, dni, correo, password;

    public abstract boolean esAdmin();


}
