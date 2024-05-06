package atividadeAula11;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double calcularArea() {
        return base * altura;
    }
    
    @Override
    double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Retângulo:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
