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
public abstract class Pessoa {
    String nome;
    String cpf;
    String dataNascimento;
    
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public abstract void imprimirDados();
}
