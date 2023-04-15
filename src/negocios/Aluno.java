/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    
    public Aluno(String nome, String cpf, String dataNascimento, int matricula, String curso) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public String toString() {
        return "Aluno " + nome + "|  CPF " + cpf + " | " + dataNascimento + " |  MATRÍCULA " + matricula + " |  CURSO: " + curso + "";
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
        System.out.println("Disciplinas matriculadas: ");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}

