package principal;

public class ContaException extends Exception{
    private String mensagem;

    public ContaException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
