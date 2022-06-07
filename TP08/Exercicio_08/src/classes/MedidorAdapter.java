package classes;

import interfaces.MedidorCelsiusIF;

public class MedidorAdapter implements MedidorCelsiusIF {
    
    private MedidorFarenheit medidorFarenheit;
    
    public MedidorAdapter() {
        this.medidorFarenheit = new MedidorFarenheit();
    }

    @Override
    public double medirTemperatura() {
        double tempFarenheit = this.medidorFarenheit.getTemperaturaFarenheit();
        System.out.println("Temperatura em Farenheit: " + tempFarenheit);

        double tempCelsius = (tempFarenheit - (double)32) / (double)1.8;

        return tempCelsius;
    }
    
}
