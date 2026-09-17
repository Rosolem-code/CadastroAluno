package br.eti.rosolem.objetos_01;

/**
 * Classe para representar o objeto Aluno dentro do sistema de cadastro de
 * aluno.
 *
 * @author sesi2dib
 */
public class Aluno {

    int id;
    String nome;
    long telefone;
    int dia;
    int mes;
    int ano;

    public Aluno() {
    }
    
    public Aluno(int id, String nome, long telefone, int dia, int mes, int ano) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    
    
    public int calcularIdade(){
        
        return 2026 - this.ano;
        
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %d - %d/%d/%d - %d\n",
                this.id,
                this.nome,
                this.telefone,
                this.dia,
                this.mes,
                this.ano,
                this.calcularIdade());
        
    }
    
}
