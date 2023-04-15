/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class Professor extends Pessoa {
    private int codigo;
    private String areaAtuacao;
    
    public Professor(String nome, String cpf, String dataNascimento, int codigo, String areaAtuacao) {
        super(nome, cpf, dataNascimento);
        this.codigo = codigo;
        this.areaAtuacao = areaAtuacao;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Código: " + getCodigo());
        System.out.println("Área de Atuação: " + getAreaAtuacao());
    }

    
    public String toString() {
        return "Professor " + nome + "|  CPF " + cpf + " | " + dataNascimento + " |  REGISTRO " + codigo + " |  ÁREA DE ATUAÇÃO: " + areaAtuacao + "";
    }
    
    
}
