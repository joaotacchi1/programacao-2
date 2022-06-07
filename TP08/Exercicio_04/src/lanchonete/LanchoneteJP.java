package lanchonete;

public class LanchoneteJP extends FabricaAbstrataSanduiches {

    @Override
    public Sanduiche SanduicheFactory(String pao, String presunto, String queijo, String salada) {
        System.out.println("Lanchonete JP");
        if (pao.equalsIgnoreCase("Frances")) {
            System.out.println("Para este pao, so possui essa combinação");
            return new Sanduiche("frances", "de frango", "mussarela", "com salada");
        } else {
            return new Sanduiche(pao, presunto, queijo, salada);
        }
    }
}
