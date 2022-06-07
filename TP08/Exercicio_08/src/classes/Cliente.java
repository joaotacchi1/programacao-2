package classes;

import interfaces.MedidorCelsiusIF;

public class Cliente {
    
    private MedidorCelsiusIF medidorCelsius;
    
    public Cliente(MedidorCelsiusIF medidorCelsius) {
        this.medidorCelsius = medidorCelsius;
    }
    
    public void medirTemp() {
        double tempCelsius = this.medidorCelsius.medirTemperatura();
        System.out.println("Temperatura em Celsius: " + tempCelsius);
    }
    
}
