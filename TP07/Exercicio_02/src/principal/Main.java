package principal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Funcionario> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String id;

        Funcionario funcionario1 = new Funcionario("Steve Jobs", "Chefe", 100);
        Funcionario funcionario2 = new Funcionario("Scott McNealy", "Sub-Chefe", 50);

        map.put("a1234", funcionario1);
        map.put("a1235", funcionario2);

        System.out.println("Digite o id de busca:");
        id = sc.nextLine().toLowerCase();
        System.out.println(map.get(id));


        Set<String> chaves = map.keySet();

        System.out.println("\nMostrando as informações de todos os funcionarios");
        for (String mostra:
             chaves) {
            System.out.println("--------------");
            System.out.println("Chave: " + mostra + "\nInformações do funcionário\n" + map.get(mostra));
        }

    }
}
