import prova.Circulo;
import prova.Quadrado;
import prova.Retangulo;
import prova.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Quadrado quadrado = new Quadrado("a", 2.0, 2.0);
        quadrado.setCor("Roxo");
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32.0, 12.0);
        Triangulo triangulo = new Triangulo("Azul", 1.0, 2.0, 5.0, 12.0);

        System.out.print(quadrado);
        System.out.print("e Base do quadrado: " + quadrado.getArea());
        System.out.print("\n" + triangulo);
        System.out.print("e Base do triangulo: " + triangulo.getArea());
        System.out.print("\n" + circulo);
        System.out.print("e Base do Circulo: " + circulo.getArea());
        System.out.print("\n" + retangulo);
        System.out.print("e Base do Retangulo: " + retangulo.getArea());
    }
}
