package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salario_final;
        int valor_pe = 20, valor_mao = 10, valor_podol = 50;
        int pe[] = new int[5];
        int mao[] = new int[5];
        int podol[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite quantos serviços de pé foram feitos no mês pra manicure " + (i + 1));
            pe[i] = scan.nextInt();
            System.out.println("Digite quantos serviços de mão foram feitos no mês pra manicure " + (i + 1));
            mao[i] = scan.nextInt();
            System.out.println("Digite quantos serviços de podologia foram feitos no mês pra manicure " + (i + 1));
            podol[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            salario_final = (float) ((float) ((pe[i] * valor_pe) + (mao[i] * valor_mao) + (podol[i] * valor_podol)) * 0.5);
            System.out.println("Salario final da manicure " + (i + 1) + " é: " + salario_final);

        }

    }
}
