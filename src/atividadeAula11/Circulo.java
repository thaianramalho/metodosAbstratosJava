package atividadeAula11;

public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Círculo:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
