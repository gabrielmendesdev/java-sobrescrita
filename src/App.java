public class App {
    public static void main(String[] args) {
        FiguraGeometrica retangulo = new Retangulo(10, 5);
        FiguraGeometrica triangulo = new TrianguloRetangulo(10, 5);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo Retângulo: " + triangulo.calcularArea());
    }
}
