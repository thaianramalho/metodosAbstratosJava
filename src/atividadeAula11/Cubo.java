package atividadeAula11;

public class Cubo extends Forma3D {
    private double lado;
    
    public Cubo(double lado) {
        this.lado = lado;
    }
    
    @Override
    double calcularArea() {
        return 6 * (lado * lado);
    }
    
    @Override
    double calcularPerimetro() {
        return 12 * lado;
    }
    
    @Override
    double calcularVolume() {
        return lado * lado * lado;
    }
    
    @Override
    void imprimirInformacoes() {
        System.out.println("Cubo:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Volume: " + calcularVolume());
    }
}
