package FiguraCalculable;

 class Triangulo extends Figura{
    private double base,altura,lado;

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public double perimetro() {
        return  lado + lado + lado;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
