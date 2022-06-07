package letraE;

public class InvalidOperationException extends RuntimeException /*herdando RuntimeException como pedido na letra E*/{
    private String mensagem;

    public InvalidOperationException(String msg){
        this.mensagem = msg;
    }

    public String getMensagem() {
        return mensagem;
    }

    /*Resposta letra E
    Ao mudar a herança da classe InvalidOperationException de Exception para RuntimeException e tirar os tratamentos
    do main, o programa não continua após dar o erro
    O programa é executado pois é uma exceção implicita, dando erro apenas quando chega na linha de execução de tal erro*/
}
