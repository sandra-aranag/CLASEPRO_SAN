public class Rectangulo {

    /*Crea una clase Rectangulo con atributos base y altura. Añade métodos calcularArea() y calcularPerimetro()
    que devuelvan el área y el perímetro respectivamente. Crea un objeto y muestra los resultados.*/

    private double base, altura;


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mostrarDatos(){
        System.out.println("\nRectángulo con base = " + base);
        System.out.println("Rectángulo con altura = " + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        double area = this.base*this.altura;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro= 2*(this.base*this.altura);
        return perimetro;
    }
}
