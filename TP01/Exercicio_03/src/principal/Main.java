package principal;

import java.util.Scanner;

public class Main {
    public static int func_recursiva(int n) {

        if(n<3){
            return n;
        }
        else{
            return 2*func_recursiva(n-1) + 3*func_recursiva(n-2);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, result;

        System.out.println("Digite um número");
        num = scan.nextInt();

        result = func_recursiva(num);

        System.out.println("F(" + num + ") = " + result);

    }
}
