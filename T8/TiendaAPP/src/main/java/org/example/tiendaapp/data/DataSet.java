package org.example.tiendaapp.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.tiendaapp.model.Usuario;

import java.util.ArrayList;

public class DataSet {

    private static ObservableList<Usuario> listaUsuarios
            = FXCollections.observableArrayList(
                    new Usuario("Admin", "Admin", "Madrid", "Admin@correo.com", "admin", 42, "admin", "masculino"),
                    new Usuario("User", "User", "User", "user@correo.com", "user", 30, "user", "femenino"));
    //UNA VARIABLE QUE ES ESTÁTICA NO NECESITA UNA INSTANCIA DEL OBJETO, SINO QUE ESA VARIABLE YA EXISTE SOLO POR SER ESTÁTICA
    //EXISTE PORQUE PERTENECE A LA CLASE, NO A LA INSTANCIA DE LA CLASE, NO AL OBJETO ASOCIADO
    //Si la pones Final, la haces constante y no le puedes reasignar un valor


    public static ObservableList<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

    public static void setListaUsuarios(ObservableList<Usuario> lista){
       listaUsuarios = lista;
    }

}
