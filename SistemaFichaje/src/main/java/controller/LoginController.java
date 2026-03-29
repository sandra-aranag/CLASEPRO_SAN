package controller;

import model.Usuario;

import java.util.List;

public class LoginController {

    private List<Usuario> usuarios;

    public LoginController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario login(String correo, String password){
        for (Usuario user : usuarios) {
            if (correo.equals(user.getCorreo()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
