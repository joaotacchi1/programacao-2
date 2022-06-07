package main;

import classes.Cliente;
import classes.SomadorAdapter;

public class Main {

    public static void main(String[] args) {
        
        SomadorAdapter adapterSomador = new SomadorAdapter();
        
        Cliente cliente = new Cliente(adapterSomador);
        
        cliente.executar();
        
    }
    
}
