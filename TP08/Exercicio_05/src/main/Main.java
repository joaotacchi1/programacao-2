package main;

import interfaces.CarroPopular;
import interfaces.CarroSedan;
import interfaces.FabricaDeCarro;
import fabricas.FabricaFiat;
import fabricas.FabricaFord;

public class Main {

    public static void main(String[] args) {
        
        /* Para substituir o veículo por um veículo Ford, basta
           trocar o tipo da fábrica como está no comentário abaixo.
           Essa é uma implementação mais simples do Abstract Factory. 
        */  
        FabricaDeCarro fabricaDeVeiculos = new FabricaFord();
        //FabricaDeCarro fabricaDeVeiculos = new FabricaFiat();
        CarroPopular popular = fabricaDeVeiculos.criarCarroPopular();
        CarroSedan sedan = fabricaDeVeiculos.criarCarroSedan();
        
        popular.exibirInfoPopular();
        sedan.exibirInfoSedan();
        
    }
    
}
