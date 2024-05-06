package atividadeAula11;

public class Esfera extends Forma3D {
    private double raio;
    
    public Esfera(double raio) {
        this.raio = raio;
    }
    
    @Override
    double calcularArea() {
        return 4 * Math.PI * raio * raio;
    }
    
    @Override
    double calcularPerimetro() {
        // A esfera não possui perímetro
        return Double.NaN;
    }
    
    @Override
    double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Esfera:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volume: " + calcularVolume());
    }
}
