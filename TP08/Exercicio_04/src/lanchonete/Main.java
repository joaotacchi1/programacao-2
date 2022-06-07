package lanchonete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pao, presunto, queijo, escolha, salada;
        int loop = 0;

        do{
            System.out.println("Digite os ingredientes que deseja");
            System.out.println("Pao: ");
            pao = sc.nextLine();
            System.out.println("Presunto: ");
            presunto = sc.nextLine();
            System.out.println("Queijo: ");
            queijo = sc.nextLine();
            System.out.println("Com ou sem salada?");
            salada = sc.nextLine();

            System.out.println("Qual restaurante que deseja pedir o hamburguer");
            escolha = sc.nextLine();

            if(escolha.equalsIgnoreCase("CG")){
                FabricaAbstrataSanduiches fabrica = new LanchoneteCG();
                Sanduiche meu_sanduiche = fabrica.SanduicheFactory(pao, presunto, queijo, salada);
                System.out.println(meu_sanduiche);
            }else {
                if(escolha.equalsIgnoreCase("RT")){
                    FabricaAbstrataSanduiches fabrica = new LanchoneteRT();
                    Sanduiche meu_sanduiche = fabrica.SanduicheFactory(pao, presunto, queijo, salada);
                    System.out.println(meu_sanduiche);
                }else{
                    FabricaAbstrataSanduiches fabrica = new LanchoneteJP();
                    Sanduiche meu_sanduiche = fabrica.SanduicheFactory(pao, presunto, queijo, salada);
                    System.out.println(meu_sanduiche);
                }
            }

            System.out.println("Deseja continua fazendo hamburguer?");
            loop = sc.nextInt();
            sc.nextLine();

        }while(loop == 1);

    }
}
