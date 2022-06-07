package letraE;

import principal.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in), scan;
        principal.Calculator calculadora = new Calculator();
        double div, log, a, b;
        int escolha = 0;
        boolean loop = true;

        do {
            scan = new Scanner(System.in);
            System.out.println("Digite a operação que deseja fazer." +
                    " Se for divisão, digite 1. Se for logaritmica, digite 2");
            escolha = scan.nextInt();
            if (escolha == 2 | escolha == 1) {
                loop = false;
            } else {
                System.out.println("Entrada para escolher operação foi inválida, digite um dos números requisitados");
            }
        } while (loop);

        switch (escolha) {
            case 1:
                System.out.println("Digite o primeiro valor");
                a = sc.nextDouble();
                System.out.println("Digite o segundo valor");
                b = sc.nextDouble();
                div = calculadora.div(a, b);
                if (Double.isInfinite(div)) {
                    System.out.println("Resultado da divisão tende a infinito");
                } else {
                    System.out.println(div);
                }
                break;

            case 2:
                System.out.println("Digite o valor que deseja encontrar o logaritmo na base 10");
                a = sc.nextDouble();
                log = calculadora.log10(a);
                if (Double.isNaN(log)) {
                    System.out.println("Valor não existe na escala real");
                } else {
                    if (Double.isInfinite(log)) {
                        System.out.println("Resultado do logaritmo tende a infinito");
                    } else {
                        System.out.println(log);
                    }
                }
        }
    }
}
