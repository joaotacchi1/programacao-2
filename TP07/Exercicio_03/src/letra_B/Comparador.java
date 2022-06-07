package letra_B;

import java.util.Comparator;

public class Comparador implements Comparator<Empregado> {

    @Override
    public int compare(Empregado e1, Empregado e2) {
        if (e1.getData_contratacao().isBefore(e2.getData_contratacao())){
            return 1;
        }
        if (e1.getData_contratacao().isAfter(e2.getData_contratacao())){
            return -1;
        }
        return 0;
    }
}
