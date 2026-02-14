public class Direccion {

    /*Crea una clase Direccion con atributos calle, ciudad y codigoPostal. Luego crea una clase Cliente que tenga como
    atributos nombre, email y un objeto Direccion. Implementa un metodo para mostrar todos los datos del cliente
    incluyendo su dirección.*/

    private String calle, ciudad;
    private int codigoPostal;

    public Direccion(String calle, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", CP: " + codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
