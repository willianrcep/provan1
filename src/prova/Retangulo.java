package prova;

/**
 * Retangulo
 */
public class Retangulo extends Figura implements IComum {

    private Double lado1;
    private Double lado2;

    public Retangulo(String cor, Double lado1, Double lado2) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {

        return "Retangulo [lado1 = " + lado1 + ", lado2= " + lado2 + ", cor=" + this.cor + "]";
    }

    @Override
    public double getArea() {
        Double a = (this.getLado1() - this.getLado1()) - (getLado2() - getLado2());
        return a;
    }

}
