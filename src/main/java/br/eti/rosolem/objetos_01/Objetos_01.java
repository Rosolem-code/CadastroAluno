package br.eti.rosolem.objetos_01;

import java.util.Scanner;

/**
 *
 * @author sesi2dib
 */
public class Objetos_01 {

    public static final int max = 1;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladotext = new Scanner(System.in);
        
        System.out.println("aperte 1 para começar o cadastro ou 0 para sair: ");
        
                
        
        //entrada de dados       
        String[] name = new String[max];
        long[] telefone = new long[max];
        int[] id = new int[max];
        int[] dia = new int[max];
        int[] mes = new int[max];
        int[] ano = new int[max];

        for (int i = 0; i < id.length; i++) {
            System.out.printf("id %d: ", i);
            id[i] = teclado.nextInt();

            System.out.printf("nome %s: ", i);
            name[i] = tecladotext.nextLine();

            System.out.printf("telefone %d: ", i);
            telefone[i] = teclado.nextLong();

            System.out.printf("dia do nascimento %d: ", i);
            dia[i] = teclado.nextInt();

            System.out.printf("mes do nascimento %d: ", i);
            mes[i] = teclado.nextInt();

            System.out.printf("ano do nascimento %d: ", i);
            ano[i] = teclado.nextInt();

        }
        //processamento

        //saida de dados
        System.out.printf("+----------+--------------------+-------------+------------+-------+\n");
        System.out.printf("| ID       | Nome               | Telefone    | Dt.nasc    | Anos  |\n");
        System.out.printf("+----------+--------------------+-------------+------------+-------+\n");

        for (int i = 0; i < id.length; i++) {
            System.out.printf("| %-8d | %-18s | %-11d | %02d/%02d/%04d |  %-2d   |\n",
                    id[i],
                    name[i],
                    telefone[i],
                    dia[i],
                    mes[i],
                    ano[i],
                    2026 - ano[i]);

        }
        System.out.printf("+----------+--------------------+-------------+------------+-------+\n");
        System.out.println("Fim");

    }
}
