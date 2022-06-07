package principal;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta();

        conta.setLimite(10000);
        conta.deposita(1000);
        System.out.println("CONTA ANTES DO SAQUE");
        System.out.println(conta);
        try {
            conta.saca(3000);
        } catch (ContaException e) {
            System.out.println(e.getMensagem());
        }

        System.out.println("\nCONTA DEPOIS DO SAQUE");
        System.out.println(conta);
    }
}
