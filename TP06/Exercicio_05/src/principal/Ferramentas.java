package principal;

import java.util.ArrayList;

public interface Ferramentas {
    public ArrayList<InfoAnimal> filtrarEspecie(ArrayList<InfoAnimal> completo, String especieFiltrar);
    public ArrayList<String> classificarEspecies(ArrayList<InfoAnimal> completo);
}
