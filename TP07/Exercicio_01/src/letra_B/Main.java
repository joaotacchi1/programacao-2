package letra_B;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();

        registro.addProduto("Macarrao", 20, "1001");
        registro.addProduto("Macarrao penny", 25, "1001");
        registro.addProduto("Macarrao", 20, "1");

        for (Produtos mostra:
                registro.prod) {
            System.out.println(mostra);
        }

    }
}
