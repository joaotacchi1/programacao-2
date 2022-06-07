package principal;

public class Bicicleta extends Veiculo {
    private float vel;

    @Override
    public float acelera(float velocidade) {
        this.vel = velocidade;
        System.out.println("A bicicleta está a uma velocidade de " + vel + " km/h");
        return this.vel;
    }

    @Override
    public void parar() {
        this.vel = 0;
        System.out.println("O carro está parado e a velocidade dele é" + vel);
    }
}
