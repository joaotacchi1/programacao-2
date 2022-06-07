package principal;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Invoice produto = new Invoice();

        System.out.println("Quantas borrachas comprou: ");
        produto.setQtd_comprada(sc.nextInt());

        produto.setValor_unitario(2.0);
        produto.setNum_prod(15);
        produto.setDescricao("Borracha");

        System.out.println("Número do produto: " + produto.getNum_prod());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Quantidade comprada: " + produto.getQtd_comprada());
        System.out.println("Valor: " + produto.getValor_unitario());
        System.out.println("Total da fatura: " + produto.getInvoice_amount());

    }
}
