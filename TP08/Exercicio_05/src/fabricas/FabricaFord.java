package fabricas;

import carros.Fiesta;
import carros.FiestaSedan;
import interfaces.CarroPopular;
import interfaces.CarroSedan;
import interfaces.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }
    
}
