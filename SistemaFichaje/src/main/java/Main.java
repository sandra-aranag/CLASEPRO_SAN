import controller.LoginController;
import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Administrador("Admin", "Admin", "1234A", "admin@admin.com", "1111"));
        usuarios.add(new Trabajador("Juan", "Sanchez", "3333J", "juan@empresa.com", "2222"));

        LoginController loginController = new LoginController(usuarios);

        System.out.println("\n––––– SISTEMA DE LOGIN –––––");
        System.out.println("Introduce tu correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String password = scanner.nextLine();

        Usuario usuarioLogueado = loginController.login(correo, password);

        if(usuarioLogueado == null){
            System.out.println("El usuario o la contraseña son incorrectos");
        }


        }
    }

