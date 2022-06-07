package principal;

public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        Bicicleta bicicleta = new Bicicleta();

        System.out.println("AUTOMÓVEL");

        automovel.acelera(50f);
        automovel.parar();
        automovel.trocarOleo(5f);

        System.out.println("BICICLETA");

        bicicleta.acelera(10f);
        bicicleta.parar();

    }
}
