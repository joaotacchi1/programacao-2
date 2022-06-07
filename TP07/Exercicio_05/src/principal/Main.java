package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado;
        System.out.println("Eu sei dividir");
        int a=0, b=0;
        double r = 0;
        boolean loop = true;

        while (loop) {
            teclado = new Scanner(System.in);
            try {
                System.out.println("Informe o primeiro valor");
                a = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Informe o segundo valor");
                b = teclado.nextInt();
                r = a / b;
                loop = false;
            } catch (InputMismatchException e) {
                System.out.println("Entrada de dados inválida");
                System.out.println("Digite um número inteiro");
            } catch (ArithmeticException e) {
                System.out.println("Denominador igual a 0...Problemas na divisão");
                System.out.println("Digite um número válido para o segundo valor");
            }
        }

        System.out.println(a + "/" + b + "=" + r);

    }
}
