public abstract class Animal {

    /*Crea una clase Animal con atributos nombre y edad, y un metodo hacerSonido(). Luego crea dos clases hijas:
    Perro y Gato que hereden de Animal. Sobrescribe el metodo hacerSonido() en cada clase hija para que muestre
    el sonido correspondiente. Crea objetos de cada tipo y prueba los métodos.*/

    private String nombre;
    private int edad;

    public Animal(){}
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();
    
    public void mostrarDatos(){
        System.out.println("Animal: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
