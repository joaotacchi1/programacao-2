package principal;

import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD(){

    }

    public CD(int c, double p, String s, int m){
        super(c,p,s);
        this.nMusicas = m;
    }

    @Override
    public String getTipo(){
        return "Nome do CD: " + getNome();
    }

    @Override
    public String getDetalhes(){
        System.out.println("Toca primeira música do CD");
        return super.getDetalhes() + "\nNúmero de músicas: " + nMusicas;
    }

    public void setMusicas(int m){
        this.nMusicas = m;
    }

    @Override
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDados();

        System.out.println("Número de músicas: ");
        setMusicas(sc.nextInt());
    }
}
