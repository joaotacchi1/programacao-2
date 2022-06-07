package principal;

public class Automovel extends Veiculo {
    private float litro_atual;
    private float velocidade_atual;

    public void trocarOleo(float litros){
        this.litro_atual = litros;
        System.out.println("O oléo foi trocado, colocou-se " + litro_atual + " litros no carro");
    }

    @Override
    public float acelera(float velocidade) {
        this.velocidade_atual = velocidade;
        System.out.println("O carro está a uma velocidade de " + velocidade_atual + " km/h");
        return velocidade_atual;
    }

    @Override
    public void parar() {
        this.velocidade_atual = 0;
        System.out.println("O carro está parado, a velocidade dele é " + velocidade_atual);
    }
}
