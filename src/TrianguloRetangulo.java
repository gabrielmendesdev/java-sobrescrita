public class TrianguloRetangulo extends FiguraGeometrica {

    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
