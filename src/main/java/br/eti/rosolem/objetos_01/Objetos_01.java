package br.eti.rosolem.objetos_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sesi2dib
 */
public class Objetos_01 {

    public static void main3(String[] args) {

        Aluno a1 = new Aluno();

        a1.id = 7;
        a1.nome = "rosolem";
        a1.telefone = 99137;
        a1.dia = 14;
        a1.mes = 9;
        a1.ano = 2009;

        System.out.println(a1.toString());

        Aluno a2 = new Aluno(100, "Leo Rosolem", 99137, 14, 9, 2009);
        System.out.println(a2.toString());

    }

    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();

        Scanner tecladotext = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        while (true) {

            Aluno novoAluno = new Aluno();

            System.out.printf("id: ");
            novoAluno.id = teclado.nextInt();

            if (novoAluno.id == 0) {
                break;
            }

            System.out.printf("nome: ");
            novoAluno.nome = tecladotext.nextLine();

            System.out.printf("telefone: ");
            novoAluno.telefone = teclado.nextLong();

            System.out.printf("dia do nascimento: ");
            novoAluno.dia = teclado.nextInt();

            System.out.printf("mes do nascimento: ");
            novoAluno.mes = teclado.nextInt();

            System.out.printf("ano do nascimento: ");
            novoAluno.ano = teclado.nextInt();

            listaAlunos.add(novoAluno);
        }

        //saida de dados
        System.out.printf("+----------+--------------------+-------------+------------+-------+\n");
        System.out.printf("| ID       | Nome               | Telefone    | Dt.nasc    | Anos  |\n");
        System.out.printf("+----------+--------------------+-------------+------------+-------+\n");

        for (Aluno aux : listaAlunos) {
            System.out.println(aux.toString());
        }

        System.out.println("Fim");

    }
}
