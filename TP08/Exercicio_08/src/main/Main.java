package main;

import classes.Cliente;
import classes.MedidorAdapter;

public class Main {

    public static void main(String[] args) {
        
        MedidorAdapter adapterMedidor = new MedidorAdapter();
        Cliente cliente = new Cliente(adapterMedidor);
        
        cliente.medirTemp();
        
    }
    
}
