public class Main {
//REFACTORIZACIÓN DE CÓDIGOS

    /*
    Ahorras líneas de código haciendo métodos. Es una forma de hacer limpio mi código.
     */

    public static void main(String[] args){
        System.out.println("Proyecto métodos");
        System.out.println("Vamos a realizar llamadas a métdos");
        /*saludar("Sandra");
        saludar("Rue");
        saludar("Kurtis");
        saludar("Marta");*/
        Operaciones operacionesMatematicas = new Operaciones(); //Con esto estoy linkando las dos clases. Es una variable compleja.
        //Si las clases estuvieran en carpetas diferentes tendríamos que importar la clase ya que están en jerarquías diferentes.
        operacionesMatematicas.sumar(1,4);
        operacionesMatematicas.restar(78, 6);


    }

    public static void saludar(String name){ //Esto es una referencia.

        System.out.println("Hola, "+name);
        System.out.println("Enantada de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de métodos");
    }

    public static void despedir(){
        System.out.println("A cerrar el portátil");
    }
}
