package atividadeAula11;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    double calcularPerimetro() {
        double lado = Math.sqrt((base * base) + (altura * altura));
        return base + altura + lado;
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Triângulo:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
