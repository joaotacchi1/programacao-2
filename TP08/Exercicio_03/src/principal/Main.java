package principal;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica forma1 = FormaGeometricaFactory.GetForma("triangulo");
        forma1.desenhar();

        FormaGeometrica forma2 = FormaGeometricaFactory.GetForma("circulo");
        forma2.desenhar();

        FormaGeometrica forma3 = FormaGeometricaFactory.GetForma("quadrado");
        forma3.desenhar();

    }
}
