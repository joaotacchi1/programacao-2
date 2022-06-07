package carros;

import interfaces.CarroPopular;

public class Fiesta implements CarroPopular {

    @Override
    public void exibirInfoPopular() {
        System.out.println("Este veículo é um Fiesta, da montadora Ford");
    }
    
}
