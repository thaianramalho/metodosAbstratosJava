package atividadeAula11;

public class Cilindro extends Forma3D {
    private double raio;
    private double altura;
    
    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    
    @Override
    double calcularArea() {
        return (2 * Math.PI * raio * altura) + (2 * Math.PI * raio * raio);
    }
    
    @Override
    double calcularPerimetro() {
        // O cilindro não possui perímetro
        return Double.NaN;
    }
    
    @Override
    double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Cilindro:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volume: " + calcularVolume());
    }
}

