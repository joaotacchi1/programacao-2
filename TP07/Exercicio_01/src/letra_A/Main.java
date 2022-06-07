package letra_A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nome_pessoa = new HashSet<>();
        int n, opcao, apaga_tudo;
        String nome;

        System.out.println("Digite quantas pessoas quer adicionar");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa");
            nome_pessoa.add(sc.nextLine());
        }

        System.out.println("Deseja remover algum nome? Se sim, digite 0. Se não, digite outro número qualquer");
        opcao = sc.nextInt();
        sc.nextLine();
        if(opcao == 0){
            System.out.println("Digite o nome que deseja remover");
            nome = sc.nextLine();
            if(nome_pessoa.contains(nome) == true){
                nome_pessoa.remove(nome);
            }else{
                System.out.println("Este nome não esta registrado no conjunto");
            }
        }

        System.out.println("VERIFICA NOME ARMAZENADO\nDigite um nome para saber se ja foi armazenado");
        nome = sc.nextLine();
        if (nome_pessoa.contains(nome) == true){
            System.out.println("Nome já armazenado");
        }else{
            System.out.println("O nome não esta armazenado");
        }

        System.out.println(nome_pessoa);

        System.out.println("Deseja apagar todos os nomes? Se sim, digite 0. Se não, digite outro número qualquer");
        apaga_tudo = sc.nextInt();
        if (apaga_tudo == 0){
            nome_pessoa.removeAll(nome_pessoa);
            System.out.println("Nomes apagados");
            System.out.println(nome_pessoa);

        }else{
            System.out.println(nome_pessoa);
        }



    }
}
