/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private LocalDate datanascimento;
    private double salario;
    private String telefone;
    private String email;
    private Genero genero;
    private Setor setor;
    private Endereco endereco;
    //private int Idade;

    public Funcionario(int id, String nome, String cpf, String rg, String matricula, LocalDate datanascimento, double salario, String telefone, String email, Genero genero, Setor setor, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.datanascimento = datanascimento;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.setor = setor;
        this.endereco = endereco;
    }
    
    
    public int getIdade(){
    return Period.between(datanascimento,LocalDate.now()).getYears();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "id:" + id 
                + "\n nome:" + nome 
                + "\n cpf:" + cpf 
                + "\n rg:" + rg 
                + "\n matricula:" + matricula 
                + "\n datanascimento:" + datanascimento 
                + "\n Idade:" + getIdade()
                + "\n salario:" + salario 
                + "\n telefone:" + telefone 
                + "\n email:" + email 
                + "\n genero:" + genero.getTexto()
                + "\n setor:" + setor 
                + "\n endereco:" + endereco;
    } 
    
}
