package letra_A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random gera_aleatorio = new Random();
        List<Integer> lista = new ArrayList<>();
        int cont_min, min, max;

        for (int i = 0; i < 50; i++) {
            lista.add(gera_aleatorio.nextInt(100));
        }

        min = Collections.min(lista);
        max = Collections.max(lista);
        cont_min = Collections.frequency(lista,min);

        System.out.println(lista);
        System.out.println("Máximo:" + max);
        System.out.println("Minimo:" + min + "//Frequencia:" + cont_min);

        Collections.sort(lista);
        System.out.println("Lista em ordem crescente");
        System.out.println(lista);

    }
}
