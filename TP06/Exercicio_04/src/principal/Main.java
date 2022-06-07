package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;
        int n;

        System.out.println("Digite a quantidade de produtos que vai cadastrar");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("O produto é um CD ou DVD?");
            c = sc.nextLine();
            if (c.equals("CD") || c.equals("cd")) {
                CD cd1 = new CD();
                cd1.inserirDados();
                cd1.printDados();
            } else {
                DVD dvd1 = new DVD();
                dvd1.inserirDados();
                dvd1.printDados();
            }
        }
    }
}
