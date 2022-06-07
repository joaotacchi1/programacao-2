package letra_B;

import java.util.Comparator;

public class ComparaNome implements Comparator<Empregado> {

    @Override
    public int compare(Empregado e1, Empregado e2) {
        return e1.getNome().compareTo(e2.getNome());
    }
}
