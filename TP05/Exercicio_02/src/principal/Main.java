package principal;

import cliente.ClienteX;
import contratado.Gerente;
import contratado.Vendedor;

public class Main {
    public static void preenche_cliente(ClienteX cliente1){
        cliente1.setIdade(18);
        cliente1.setAnoNasc(2002);
        cliente1.setSexo("Masculino");
        cliente1.setValorDivida(1500f);
    }

    public static void preenche_vendedor(Vendedor v1){
        v1.setSalario(1200f);
        v1.setValorVendas(5000f);
        v1.setQtdVendas(20);
    }

    public static void preenche_gerente(Gerente gerente){
        gerente.setIdade(45);
        gerente.setMatricula("85659970");
        gerente.setNome_gerencia("A casa é sua");
        gerente.setSalario(10000f);
    }

    public static void main(String[] args) {
        ClienteX cliente1 = new ClienteX("Pedro");
        Vendedor v1 = new Vendedor("Luis");
        Gerente gerente = new Gerente("João");

        System.out.println("CLIENTE");
        preenche_cliente(cliente1);
        System.out.println(cliente1);

        System.out.println("\nVENDEDOR");
        preenche_vendedor(v1);
        System.out.println(v1);

        System.out.println("\nGERENTE");
        preenche_gerente(gerente);
        System.out.println(gerente);
    }
}
