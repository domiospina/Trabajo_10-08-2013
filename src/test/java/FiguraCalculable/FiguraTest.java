package FiguraCalculable;

import org.junit.Test;


public class FiguraTest {
    @Test
    public void testArea() throws Exception {

        Circulo area1 = new Circulo(12, 56);
        System.out.println("el área es circulo es: " + area1.area());
        System.out.println();
        Cuadrado area2 = new Cuadrado(8);
        System.out.println("el área del cuadrado es: " + area2.area());
        System.out.println();
        Triangulo area3 = new Triangulo(8, 7, 6);
        System.out.println("el área del triangulo es: " + area3.area());
        System.out.println();
        Circulo peri1 = new Circulo(23, 34);
        System.out.println("el perimetro del circulo es: " + peri1.perimetro());
        System.out.println();
        Cuadrado peri2 = new Cuadrado(10);
        System.out.println("el perimetro del cuadrado es: " + peri2.perimetro());
        System.out.println();
        Triangulo peri3 = new Triangulo(10, 10, 10);
        System.out.println("el perimetro del triangulo es: " + peri3.perimetro());

    }

    @Test
    public void testPerimetro() throws Exception {

    }
}
