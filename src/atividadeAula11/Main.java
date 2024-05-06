package atividadeAula11;

public class Main {
	
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 4);
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(5, 4);
        Circulo circulo = new Circulo(3);
        
        triangulo.imprimirInformacoes();
        System.out.println();
        quadrado.imprimirInformacoes();
        System.out.println();
        retangulo.imprimirInformacoes();
        System.out.println();
        circulo.imprimirInformacoes();
        
        Cubo cubo = new Cubo(3);
        Esfera esfera = new Esfera(3);
        Cilindro cilindro = new Cilindro(3, 5);
        
        cubo.imprimirInformacoes();
        System.out.println();
        esfera.imprimirInformacoes();
        System.out.println();
        cilindro.imprimirInformacoes();
    }
}
