package exercicio02;

public class Triangulo {
    public double base;
    public double altura;

    public Triangulo(double base, double     altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularAreaTriangulo(){
        double area = this.base*this.altura/2;
        System.out.println("A altura do triangulo é: " + area);
    }
}
