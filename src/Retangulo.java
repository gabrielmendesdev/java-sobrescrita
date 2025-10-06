public class Retangulo extends FiguraGeometrica {

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
