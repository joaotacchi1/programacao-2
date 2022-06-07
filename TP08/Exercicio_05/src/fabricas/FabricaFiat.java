package fabricas;

import carros.Palio;
import carros.Siena;
import interfaces.CarroPopular;
import interfaces.CarroSedan;
import interfaces.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
    
}
