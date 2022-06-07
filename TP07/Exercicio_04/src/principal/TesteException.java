package principal;

public class TesteException {
    static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    static void metodo2(){
        System.out.println("Inicio do metodo 2");
        int array[] = new int[10];
        for (int i = 0; i < 15; i++) {
            try {
                array[i] = i;
                System.out.println(i);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array não possui posição " + i);
            }
        }
        System.out.println("Fim do metodo 2");
    }


    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
}
