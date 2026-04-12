package org.example.tiendaapp.controller;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.Usuario;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private BorderPane borderGeneral;

    @FXML
    private ListView<Usuario> listViewUsuarios;

    private ObservableList<Usuario> listaUsuarios;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnComprobar;

    @FXML
    private Button btnVaciar;

    @FXML
    private Button btnVolver;

    @FXML
    private CheckBox checkLista;

    @FXML
    private ComboBox<String> comboPerfil;

    private ObservableList<String> listaPerfiles;

    @FXML
    private TextField editApellido;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editDireccion;

    @FXML
    private TextField editNombre;

    @FXML
    private TextField editPass;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private RadioButton radioMasculino;

    private ToggleGroup grupoGenero;

    @FXML
    private Spinner<Integer> spinnerEdad;
    //No se le asocia una lista, sino un SpinnerValueFactory, que es un tipo de modelo de datos
    private SpinnerValueFactory.IntegerSpinnerValueFactory modeloSpinner;

    private Effect shadow;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instances();
        initGUI();
        actions();
    }

    private void actions() {

        btnVolver.setOnAction(actionEvent -> {

            Stage stage = new Stage();

            try{
                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Tienda APP");
                stage.show();
                ((Stage)btnVolver.getScene().getWindow()).close();
            } catch (IOException e) {
                System.out.println("Poner el dialogo");
            }


        });

        btnComprobar.setOnAction(actionEvent -> {
            Usuario usuario = listViewUsuarios.getSelectionModel().getSelectedItem();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Detalles del usuario");
            alert.setContentText(String.format("Los datos del usuario son\nnombre:%s\nApellido:%s\nCorreo:%s",
                    usuario.getNombre(), usuario.getApellido(), usuario.getCorreo()));

        });

        btnVaciar.setOnAction(actionEvent -> {
            System.out.println("Procedemos a vaciar el formulario");
        });

        btnAgregar.setOnAction(actionEvent -> {
            //comprobar si todos los campos están rellenos
            Alert dialogo = null;
            if (editNombre.getText().isEmpty()
                || editDireccion.getText().isEmpty()
                || editApellido.getText().isEmpty()
                || editCorreo.getText().isEmpty()
                || grupoGenero.getSelectedToggle() == null
                || comboPerfil.getSelectionModel().getSelectedIndex() == -1
            ) {
                dialogo = new Alert(Alert.AlertType.WARNING);
                dialogo.setTitle("Datos");
                dialogo.setContentText("Confirma que todos los datos están rellenos");

            }else {
                String nombre = editNombre.getText();
                String apellido = editApellido.getText();
                String correo = editCorreo.getText();
                String direccion = editDireccion.getText();
                String pass = editPass.getText();
                String perfil = comboPerfil.getSelectionModel().getSelectedItem();
                String genero = ((RadioButton)(grupoGenero.getSelectedToggle())).getText();
                int edad = spinnerEdad.getValue();
                Usuario usuario = new Usuario(nombre, apellido, direccion, correo, pass, edad, perfil, genero);
                listaUsuarios.add(usuario);
                dialogo = new Alert(Alert.AlertType.CONFIRMATION);
                dialogo.setTitle("Exito");
                dialogo.setContentText("Usuario agregado con éxito. ¿Quieres borrar los datos?");
                Optional<ButtonType> result = dialogo.showAndWait();
            }
            dialogo.show();
        });

        btnEliminar.setOnAction(actionEvent -> {
            //Eliminar el elemento de la lista
            Usuario usuario = listViewUsuarios.getSelectionModel().getSelectedItem();
            if (usuario == null){
                Alert dialogo = new Alert(Alert.AlertType.WARNING);
                dialogo.setTitle("Selección");
                dialogo.setContentText("Por favor selecciona un elemento para poder eliminar");
                dialogo.show();
            } else {
                Alert dialogo = new Alert(Alert.AlertType.CONFIRMATION);
                dialogo.setTitle("Eliminar");
                dialogo.setContentText("¿Estás seguro de que quieres eliminar al usuaro con email " +usuario.getCorreo()+ "?");
                Optional<ButtonType> respuesta = dialogo.showAndWait();
                if (respuesta.get() == ButtonType.OK){
                    listaUsuarios.remove(usuario);
                    listViewUsuarios.getSelectionModel().select(-1);
                }
            }
        });

        btnComprobar.setOnMouseEntered(event -> {
            System.out.println("Ratón pasando por encima");
        });

        btnComprobar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnEliminar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseExited(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnEliminar.setOnMouseExited(new ManejoRaton());
        btnComprobar.setOnMouseExited(new ManejoRaton());

        checkLista.selectedProperty().addListener(
                (observable, oldValue, newValue) ->{
                   if (newValue){
                       borderGeneral.setRight(listViewUsuarios);
                   } else {
                       borderGeneral.setRight(null);
                   }
                } );

    }

    //inicilización gráfica
    private void initGUI() {
        grupoGenero.getToggles().addAll(radioFemenino, radioMasculino);
        comboPerfil.setItems(listaPerfiles);
        spinnerEdad.setValueFactory(modeloSpinner);
        listViewUsuarios.setItems(listaUsuarios);
        if (!checkLista.isSelected()){
            borderGeneral.setRight(null);
        }

    }

    private void instances() {
        grupoGenero = new ToggleGroup();
        listaPerfiles = FXCollections.observableArrayList("Administrador", "Cliente", "Trabajador");
        listaUsuarios = DataSet.getListaUsuarios();
        modeloSpinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 90, 18, 1);
        shadow = new DropShadow();

    }

    class ManejoRaton implements EventHandler<MouseEvent>{

        @Override
        public void handle(MouseEvent mouseEvent) {
            if(mouseEvent.getEventType() == mouseEvent.MOUSE_EXITED){
                System.out.println("Saliendo");
            } else if (mouseEvent.getEventType() == mouseEvent.MOUSE_ENTERED) {
                System.out.println("Entrando");
                ((Button)(mouseEvent.getSource())).setEffect(shadow);
            }
        }
    }
}
