import model.Coche;

public class Main {
    public static void main(String[] args) {
        // METODO CONSTRUCTOR
        Coche ford = new Coche("Ford", "Focus", "1234A", "Verde", 150); //Esto es la instancia de la clase -> un objeto de la cocche
        //Coche opel = new Coche(); //le cambias el nombre y con esto has creado un nuevo objeto, siguiendo la misma estructura.

        Coche opel = new Coche();

        Coche mercedes = new Coche("Mercedes", "Clase C",  80000);
        System.out.println(mercedes);





    }


}
