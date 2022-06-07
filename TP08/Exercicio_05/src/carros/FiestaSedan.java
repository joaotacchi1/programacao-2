package carros;

import interfaces.CarroSedan;

public class FiestaSedan implements CarroSedan {

    @Override
    public void exibirInfoSedan() {
        System.out.println("Este veículo é um Fiesta Sedan, da montadora Ford");
    }
    
}
