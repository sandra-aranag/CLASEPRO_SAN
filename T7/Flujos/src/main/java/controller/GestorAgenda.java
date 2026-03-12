package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GestorAgenda {

    private List<Usuario> contactos;

    public GestorAgenda(){
        contactos = new ArrayList<>();
    }

    public void listarContactos(){
        this.contactos.forEach(Usuario::MostrarDatos);
    }

    public void agregarUsuario(Usuario usuario){
        contactos.stream().filter(item->item.getDni().equalsIgnoreCase(usuario.getDni()))
                .findAny();
    }

    public List<Usuario> getContactos() {
        return contactos;
    }

    public void setContactos(List<Usuario> contactos) {
        this.contactos = contactos;
    }
}
