package principal;

import java.util.ArrayList;

public class Main {
    public static boolean verificarResultExistente(String especie, ArrayList<Resultado> results) {
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).getEspecie().equalsIgnoreCase(especie)) {
                return false;
            }
        }
        return true;
    }

    public static void listagemAnimais(ArrayList<InfoAnimal> animais, Ferramentas tools) {
        ArrayList<Resultado> results = new ArrayList<>();
        ArrayList<InfoAnimal> filtro = new ArrayList<>();
        ArrayList<String> especies = new ArrayList<>();

        tools = new Ferramentas() {

            @Override
            public ArrayList<InfoAnimal> filtrarEspecie(ArrayList<InfoAnimal> completo, String especieFiltrar) {

                ArrayList<InfoAnimal> filter = new ArrayList<>();

                for (int i = 0; i < completo.size(); i++) {
                    if (completo.get(i).getNomeEspecie().equalsIgnoreCase(especieFiltrar)) {
                        filter.add(completo.get(i));

                    }
                }
                return filter;
            }

            @Override
            public ArrayList<String> classificarEspecies(ArrayList<InfoAnimal> completo) {
                ArrayList<String> nomesEspecie = new ArrayList<>();

                for (int i = 0; i < completo.size(); i++) {
                    if (!nomesEspecie.contains(completo.get(i).getNomeEspecie())) {
                        nomesEspecie.add(completo.get(i).getNomeEspecie());

                    }
                }
                return nomesEspecie;
            }
        };

        for (int i = 0; i < animais.size(); i++) {

            if (verificarResultExistente(animais.get(i).getNomeEspecie(), results)) {

                filtro = tools.filtrarEspecie(animais, animais.get(i).getNomeEspecie());
                results.add(new Resultado(animais.get(i).getNomeEspecie(), filtro.size()));

            }

        }
        especies = tools.classificarEspecies(animais);

        System.out.println(especies);

        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i).getQuantidade() + " | " + results.get(i).getEspecie());
        }
    }

    public static void main(String[] args) {
        // Vector<Animal> animais = new Vector<>();
        ArrayList<InfoAnimal> animais = new ArrayList<>();
        animais.add(new InfoAnimal("Alan", "Boi"));
        animais.add(new InfoAnimal("Cidinha", "Vaca"));
        animais.add(new InfoAnimal("Marley", "Cachorro"));
        animais.add(new InfoAnimal("Vampira", "Cachorro"));
        animais.add(new InfoAnimal("Maggie", "Cachorro"));

        Ferramentas tools = null;

        listagemAnimais(animais, tools);

    }

}
