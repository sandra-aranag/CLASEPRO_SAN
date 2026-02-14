public class Cliente {
    /*Crea una clase Direccion con atributos calle, ciudad y codigoPostal. Luego crea una clase Cliente que tenga como
atributos nombre, email y un objeto Direccion. Implementa un metodo para mostrar todos los datos del cliente
incluyendo su dirección.*/
    private String nombre, email;
    Direccion direccion;

    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }
    
    public void mostrarDatos(){
        System.out.println("Cliente: " + nombre);
        System.out.println("Email = " + email);
        System.out.println("Dirección = " + direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
