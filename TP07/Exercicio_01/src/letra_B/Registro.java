package letra_B;

import java.util.HashSet;
import java.util.Set;

public class Registro {
    Set<Produtos> prod = new HashSet<>();

    public void addProduto(String nome, double preco, String cod){
        Produtos p = new Produtos(nome, preco, cod);

        if(this.prod.contains(p)){
            System.out.println("O sistema já possui esse produto");
        }else{
            prod.add(p);
            System.out.println("Produto adicionado");
        }
    }
}
