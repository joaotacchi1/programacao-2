package principal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            someMethod();
        }catch(Exception e){
            System.out.println("Mostrando a exceção do someMethod2");
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    static void someMethod(){
        System.out.println("Inicio do someMethod");
        int a[] = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = i;
        }

        try {
            someMethod2();
        }catch(Exception e){
            someMethod2();
        }

    }

    static void someMethod2(){
        System.out.println("Inicio do someMethod2");
        int a[] = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = i;
        }
        System.out.println(a[3]);
    }
}
