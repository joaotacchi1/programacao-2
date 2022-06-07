package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //aplicativo para teste da calculadora pedido na letra d

        Scanner sc = new Scanner(System.in), scan;
        Calculator calculadora = new Calculator();
        double div, log, a, b;
        int escolha = 0;
        boolean loop = true;

        do {

            try {
                scan = new Scanner(System.in);
                System.out.println("Digite a operação que deseja fazer." +
                        " Se for divisão, digite 1. Se for logaritmica, digite 2");
                escolha = scan.nextInt();
                if (escolha == 2 | escolha == 1) {

                    loop = false;
                }
            } catch (InputMismatchException c) {
                System.out.println("Entrada para escolher operação foi inválida, digite um dos números requisitados");
            }
        } while (loop);

        switch (escolha) {
            case 1:
                try {
                    System.out.println("Digite o primeiro valor");
                    a = sc.nextDouble();
                    System.out.println("Digite o segundo valor");
                    b = sc.nextDouble();
                    div = calculadora.div(a, b);
                    if (Double.isInfinite(div)) {
                        InvalidOperationException erro = new InvalidOperationException("ERRO");
                        System.out.println(erro.getMensagem() + "\nDivisão por 0");
                        erro.printStackTrace();
                    } else {
                        System.out.println(div);
                    }
                    break;
                } catch (InputMismatchException e)/*tratamento de exceção no programa que usa a calculadora pedido
                na letra c*/ {
                    InvalidOperationException i = new InvalidOperationException("Entrada de dados inválida");
                    System.out.println(i.getMensagem());
                    i.printStackTrace();
                    break;
                }
            case 2:
                try {
                    System.out.println("Digite o valor que deseja encontrar o logaritmo na base 10");
                    a = sc.nextDouble();
                    log = calculadora.log10(a);
                    if (Double.isNaN(log)) {
                        InvalidOperationException ioe = new InvalidOperationException("ERRO");
                        System.out.println(ioe.getMensagem() + "\nImpossivel calcular logaritmo de número negativo");
                        ioe.printStackTrace();
                    } else {
                        if (Double.isInfinite(log)) {
                            InvalidOperationException erro_log = new InvalidOperationException("ERRO");
                            System.out.println(erro_log.getMensagem() + "\nValor de a igual a 0. Não foi possivel fazer a conta");
                            erro_log.printStackTrace();
                        } else {
                            System.out.println(log);
                        }
                    }
                }catch (InputMismatchException ime){
                    InvalidOperationException erro_input_log = new InvalidOperationException("Entrada de dados inválida");
                    System.out.println(erro_input_log.getMensagem());
                    erro_input_log.printStackTrace();
                }
        }
    }
}
