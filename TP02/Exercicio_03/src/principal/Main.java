package principal;

public class Main {
    public static void exibe_string(String str[], int n){
        if(n==1){
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null) {
                    break;
                }
                if (i == 0) {
                    System.out.print("s1= " + str[i]);
                }
                else{
                    System.out.print(" " + str[i]);
                }
            }
            System.out.println();
        }
        else if(n==2){
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null) {
                    break;
                }
                if (i == 0) {
                    System.out.print("s2= " + str[i]);
                }
                else{
                    System.out.print(" " + str[i]);
                }
            }
            System.out.println();
        }
        else if(n==3){
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null) {
                    break;
                }
                if (i == 0) {
                    System.out.print("uniao= " + str[i]);
                }
                else{
                    System.out.print(" " + str[i]);
                }
            }
            System.out.println();
        }
        else if(n==4){
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null) {
                    break;
                }
                if (i == 0) {
                    System.out.print("interseção= " + str[i]);
                }
                else{
                    System.out.print(" " + str[i]);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        IntegerSet s1 = new IntegerSet();
        s1.insereElemento(1);
        s1.insereElemento(5);

        IntegerSet s2 = new IntegerSet();
        s2.insereElemento(1);
        s2.insereElemento(7);

        String str1[] = s1.converte_string();
        exibe_string(str1, 1);

        String str2[] = s2.converte_string();
        exibe_string(str2, 2);

        String str_uniao[] = s1.uniao(s2).converte_string();
        exibe_string(str_uniao, 3);

        String str_interseção[] = s1.intersecao(s2).converte_string();
        exibe_string(str_interseção, 4);

        System.out.println("s1 e s2 iguais? " + s1.diferenca(s2));
        s1.insereElemento(7);
        s1.deletaElemento(5);
        System.out.println("s1 e s2 iguais? " + s1.diferenca(s2));
    }
}
