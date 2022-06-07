package principal;

public class FormaGeometricaFactory {

    public static FormaGeometrica GetForma(String forma) {
        if (forma.equalsIgnoreCase("Quadrado")) {
            return new Quadrado();
        } else {
            if(forma.equalsIgnoreCase("Circulo")){
                return new Circulo();
            }else{
                return new Triangulo();
            }
        }
    }
}
