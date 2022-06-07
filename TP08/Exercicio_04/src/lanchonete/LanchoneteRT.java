package lanchonete;

public class LanchoneteRT extends FabricaAbstrataSanduiches {

    @Override
    public Sanduiche SanduicheFactory(String pao, String presunto, String queijo, String salada) {
        System.out.println("Lanchonete RT");
        if (pao.equalsIgnoreCase("Bola")) {
            System.out.println("Para este pao, so possui essa combinação");
            return new Sanduiche("bola", "de peru", "cheddar", "sem salada");
        } else {
            return new Sanduiche(pao, presunto, queijo, salada);
        }
    }
}
