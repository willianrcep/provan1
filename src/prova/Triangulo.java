package prova;

public class Triangulo extends Retangulo implements IComum {

    private Double base;
    private Double altura;

    public Triangulo(String cor, Double lado1, Double lado2, Double base, Double altura) {
        super(cor, lado1, lado2);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        Double a = this.getBase() * this.getAltura() + 4.056;

        return a;
    }

    @Override
    public String toString() {
        return "Triangulo [cor=" + cor + ", base=" + base + ", altura=" + altura + "]";
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
