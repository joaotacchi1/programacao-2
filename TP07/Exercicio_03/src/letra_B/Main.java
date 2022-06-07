package letra_B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        Comparador compara = new Comparador();
        ComparaNome compara2 = new ComparaNome();
        Empregado min, max, mais_experiente, menos_experiente;

        Empregado empregado1 = new Empregado("a123", "Pedro", 2000, LocalDate.of(2020, 2, 28));
        Empregado empregado2 = new Empregado("b123", "Joao", 3000, LocalDate.of(2020, 3, 20));
        Empregado empregado3 = new Empregado("c123", "Gabriel", 1000, LocalDate.of(2020, 7, 3));
        Empregado empregado4 = new Empregado("d123", "Celso", 2500, LocalDate.of(2020, 3, 15));

        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);
        empregados.add(empregado4);

        Collections.sort(empregados);

        System.out.println("Ordem crescente por salario");
        for (Empregado p :
                empregados) {
            System.out.println(p.getNome() + "\nSalario: " + p.getSalario());
            System.out.println("------------");
        }

        Collections.sort(empregados, compara2);

        System.out.println("\nOrdem alfabetica");
        for (Empregado p :
                empregados) {
            System.out.print(p.getNome() + "/");
        }


        Collections.sort(empregados, compara);

        mais_experiente = Collections.max(empregados, compara);
        menos_experiente = Collections.min(empregados, compara);
        System.out.println("\n\nFuncionario mais experiente");
        System.out.println(mais_experiente);
        System.out.println("-------------");
        System.out.println("Funcionario menos experiente");
        System.out.println(menos_experiente);


        min = Collections.min(empregados);
        max = Collections.max(empregados);
        System.out.println("-----------");
        System.out.println("Funcionario com menor salario");
        System.out.println(min);
        System.out.println("-----------");
        System.out.println("Funcionario com maior salario");
        System.out.println(max);




    }
}
