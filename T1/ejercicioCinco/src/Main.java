public class Main {

    public static void main(String[] args){

        final String NOMBRE_APP = "Van Gogh";
        String version = "1.0.2";
        final double VALOR_PI = 3.14159;
        String user = "Sandra";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: "+NOMBRE_APP);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+VALOR_PI);
        System.out.println("Usuario actual: "+user);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuación "+puntuacion);

        user = "Miguel";
        nivel = nivel+1;
        puntuacion = puntuacion+150;

        System.out.println("Usuario actualizado: "+user);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada "+puntuacion);



    }

}
