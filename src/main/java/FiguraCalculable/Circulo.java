package FiguraCalculable;


public class Circulo extends Figura {
    private final double PI = 3.1416;
    private double radio,diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double area() {
        return PI*(radio*radio);
    }

    @Override
    public double perimetro() {
        return diametro*PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
