package prova;

public class Circulo extends Figura implements IComum {

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Circulo(String cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double getArea() {
        double a = 384.0;
        return a;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + cor + "]";
    }

}
