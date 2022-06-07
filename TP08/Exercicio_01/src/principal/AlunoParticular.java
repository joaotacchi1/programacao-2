package principal;

public class AlunoParticular {
    private static AlunoParticular instance;

    private String nome_aluno;



    private AlunoParticular(){

    }

    public static AlunoParticular GetInstance(){
        if (instance == null){
            instance = new AlunoParticular();
        }

        return instance;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    @Override
    public String toString() {
        return "Nome do único aluno particular: " + nome_aluno;
    }
}
