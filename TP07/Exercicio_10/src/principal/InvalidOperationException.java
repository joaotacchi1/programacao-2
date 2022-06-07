package principal;

public class InvalidOperationException extends Exception{
    //classe pedida na letra b
    private String mensagem;

    public InvalidOperationException(String msg){
        this.mensagem = msg;
    }

    public String getMensagem() {
        return mensagem;
    }
}
