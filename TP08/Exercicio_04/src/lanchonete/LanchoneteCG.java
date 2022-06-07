package lanchonete;

public class LanchoneteCG extends FabricaAbstrataSanduiches {

    @Override
    public Sanduiche SanduicheFactory(String pao, String presunto, String queijo, String salada) {
        System.out.println("Lanchonete CG");
        if (pao.equalsIgnoreCase("Integral")) {
            System.out.println("Para este pao, so possui essa combinação");
            return new Sanduiche("integral", "de frango", "prato", "sem salada");
        } else {
            return new Sanduiche(pao, presunto, queijo, salada);
        }
    }
}
