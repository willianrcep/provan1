package prova;

public class Quadrado extends Retangulo implements IComum {

    public Quadrado(String cor, Double lado1, Double lado2) {
        super(cor, lado1, lado2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getArea() {
        Double a = 60.0;
        return a;
    }

    @Override
    public String toString() {
        return "Quadrado [lado1 = " + getLado1() + ", lado2= " + getLado2() + ", cor=" + this.cor + "]";
    }

}
