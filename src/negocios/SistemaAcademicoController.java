/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.management.jfr.RecordingInfo;

/**
 *
 * @author lucas
 */
public class SistemaAcademicoController {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void cadastrarAluno(String nome, String cpf, String dataNascimento, int matricula, String curso) {
        Aluno aluno = new Aluno(nome, cpf, dataNascimento, matricula, curso);
        alunos.add(aluno);
    }

    public void cadastrarProfessor(String nome, String cpf, String dataNascimento, int codigo, String areaAtuacao) {
        Professor professor = new Professor(nome, cpf, dataNascimento, codigo, areaAtuacao);
        professores.add(professor);
    }

    public void cadastrarDisciplina(String nome, int cargaHoraria, Professor professor) {
        // Verifica se há professores cadastrados
        ArrayList<Professor> professores = retornaTodosProfessores();
        if (professores.size() == 0) {
            JOptionPane.showMessageDialog(null, "Não há professores cadastrados!");
            return; // Interrompe a execução do método
        }

        // Cadastra a disciplina com o professor selecionado
        Disciplina disciplina = new Disciplina(nome, cargaHoraria, professor);
        disciplinas.add(disciplina);
    }


    public void matricularAluno(Aluno aluno, Disciplina disciplina) {
        aluno.adicionarDisciplina(disciplina);
    }
    
    public ArrayList<Aluno> retornaTodosAlunos() {
        return alunos;
    }
    
    public ArrayList<Professor> retornaTodosProfessores() {
        return professores;
    }
    
    public Professor retornaProfessorPorNome(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().equals(nome)) {
                return professor;
            }
        }
        return null;
    }
    
    public ArrayList<Disciplina> retornaTodasDisciplinas() {
        return disciplinas;
    }
}

