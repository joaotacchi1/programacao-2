package principal;

public class Main {
    public static void main(String[] args) {
        int inteiroA[] = new int[5];
        int inteiroB[] = new int[5];
        double result[] = new double[5];

        try{
            for (int i = 0; i < 6; i++) {
                inteiroA[i] = i*2;
                inteiroB[i] = i/2;

                result[i] = inteiroA[i] / inteiroB[i];
                System.out.println(result[i]);
            }
        }catch(ArithmeticException e){
            System.out.println("Erro aritmético\n");
        }

        System.out.println("Após saida do primeiro escopo do try/catch");

        try{
            System.out.println("\nEntrando no segundo escopo");
            System.out.println(result[6]);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Não foi possivel acessar aquele vetor");
            a.printStackTrace();
        }

        System.out.println("\nApós saida do segundo escopo");

    }
}
