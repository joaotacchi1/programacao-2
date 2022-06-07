package carros;

import interfaces.CarroPopular;

public class Palio implements CarroPopular {

    @Override
    public void exibirInfoPopular() {
        System.out.println("Este veículo é um Palio, da montadora Fiat");
    }
    
}
