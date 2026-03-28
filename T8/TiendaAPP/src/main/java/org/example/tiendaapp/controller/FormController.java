package org.example.tiendaapp.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import org.example.tiendaapp.model.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private BorderPane borderGeneral;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnComprobar;

    @FXML
    private Button btnVaciar;

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
        btnComprobar.setOnAction(actionEvent -> {
            //actionEvent es lo que se ha provocado
            System.out.println("Procedemos a ver si el usuario existe en la lista");
        });

        btnVaciar.setOnAction(actionEvent -> {
            System.out.println("Procedemos a vaciar el formulario");
        });

        btnAgregar.setOnAction(actionEvent -> {
            //comprobar si todos los campos están rellenos
            String nombre = editNombre.getText();
            String apellido = editApellido.getText();
            String correo = editCorreo.getText();
            String direccion = editDireccion.getText();
            String pass = editPass.getText();
            String perfil = comboPerfil.getSelectionModel().getSelectedItem();
            String genero = ((RadioButton)(grupoGenero.getSelectedToggle())).getText();
            int edad = spinnerEdad.getValue();
            Usuario usuario = new Usuario(nombre, apellido, direccion, correo, pass, edad, perfil, genero);
            System.out.println("Usuario creado con éxito: " +usuario.getNombre());
        });

        btnComprobar.setOnMouseEntered(event -> {
            System.out.println("Ratón pasando por encima");
        });

        btnComprobar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseExited(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnComprobar.setOnMouseExited(new ManejoRaton());

    }

    //inicilización gráfica
    private void initGUI() {
        grupoGenero.getToggles().addAll(radioFemenino, radioMasculino);
        comboPerfil.setItems(listaPerfiles);
        spinnerEdad.setValueFactory(modeloSpinner);

    }

    private void instances() {
        grupoGenero = new ToggleGroup();
        listaPerfiles = FXCollections.observableArrayList("Administrador", "Cliente", "Trabajador");
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
