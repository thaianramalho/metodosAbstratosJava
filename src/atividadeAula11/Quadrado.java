package atividadeAula11;

public class Quadrado extends FormaGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    double calcularArea() {
        return lado * lado;
    }
    
    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Quadrado:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
