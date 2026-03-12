public class EdadInvalidaException extends Exception{

    /*lance esta excepción si la edad es menor que 0 o mayor que 120.*/

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
    }

}
