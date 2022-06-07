package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cachorro dog = new Cachorro("PitBraga", "Pincher", 5f);
        Peixe fish = new Peixe("Lambari", 0f);
        String habitat;
        double peso;

        System.out.println("Informações do cachorro \n" + dog);

        System.out.println("Digite o peso do peixe pescado e o habitat em que foi pescado");
        peso = sc.nextDouble();
        habitat = sc.nextLine();
        fish.setPeso(peso);
        fish.setTipoHabitat(habitat);


        System.out.println("Informações do peixe \n" + fish);

    }
}
