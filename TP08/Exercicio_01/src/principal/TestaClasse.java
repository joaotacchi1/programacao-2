package principal;

public class TestaClasse {
    public static void main(String[] args) {
        AlunoParticular aluno = AlunoParticular.GetInstance();

        aluno.setNome_aluno("João Vitor");

        System.out.println(aluno);
    }
}
