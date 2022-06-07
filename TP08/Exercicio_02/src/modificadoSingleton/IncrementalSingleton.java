package modificadoSingleton;

public class IncrementalSingleton {
    private static IncrementalSingleton instance;

    private int numero;

    private IncrementalSingleton(){
    }

    public static IncrementalSingleton GetInstance(){
        if(instance == null){
            instance = new IncrementalSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Incremental " + ++numero;
    }
}
