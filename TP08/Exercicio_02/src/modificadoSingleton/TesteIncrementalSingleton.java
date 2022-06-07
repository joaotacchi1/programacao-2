package modificadoSingleton;


public class TesteIncrementalSingleton {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            IncrementalSingleton inc = IncrementalSingleton.GetInstance();
            System.out.println(inc);
        }
    }
}
