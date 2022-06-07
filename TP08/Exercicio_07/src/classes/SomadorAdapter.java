package classes;

import interfaces.SomadorEsperado;
import java.util.Arrays;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {
    
    private SomadorExistente somadorExistente;
    
    public SomadorAdapter() {
        this.somadorExistente = new SomadorExistente();
    }

    @Override
    public int somaVetor(int[] vetor) {
        
        /* Criando um vetor de Integer, pois não podemos converter um
           vetor de int diretamente para uma lista de Integer
        */
        Integer vet[] = new Integer[10];

        for(int i = 0; i < 10; i++) {
            vet[i] = Integer.valueOf(vetor[i]);
        }

        /* Convertendo o vetor na lista de Integer, para usarmos
           a soma do somador existente.
        */
        List<Integer> listaDeInteiros = Arrays.asList(vet);
        
        int resultado = this.somadorExistente.somaLista(listaDeInteiros);
        
        return resultado;
    }
    
}
