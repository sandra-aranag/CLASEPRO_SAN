import controller.AdminController;
import controller.FileController;
import controller.LoginController;
import controller.TrabajadorController;
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
        FileController fileController = new FileController();

        usuarios.add(new Administrador("Admin", "Admin", "1234A", "admin@admin.com", "1111"));
        usuarios.add(new Trabajador("Juan", "Sanchez", "3333J", "juan@empresa.com", "2222"));
        usuarios.add(new Trabajador("Marta", "Hernandez", "6666A", "marta@empresa.com", "2222"));
        usuarios.add(new Trabajador("Sandra", "Arana", "3333B", "sandra@empresa.com", "2222"));
        LoginController loginController = new LoginController(usuarios);
        Usuario usuarioLogueado = null;

      do {
          System.out.println("\n––––– SISTEMA DE LOGIN –––––");
          System.out.println("Introduce tu correo electrónico: ");
          String correo = scanner.nextLine();
          System.out.println("Introduce tu contraseña: ");
          String password = scanner.nextLine();

          usuarioLogueado = loginController.login(correo, password);

          if(usuarioLogueado == null){
              System.out.println("¡¡¡ERROR!!! El usuario o la contraseña son incorrectos. Inténtalo de nuevo.");
          }
      } while (usuarioLogueado == null);


        if (usuarioLogueado.esAdmin()){
            AdminController adminController = new AdminController(usuarios, fileController);
            adminController.menuAdmin();
        } else {
            TrabajadorController trabajadorController = new TrabajadorController(fileController);
            trabajadorController.menuTrabajador(usuarioLogueado);
        }
        scanner.close();
        }

    }

