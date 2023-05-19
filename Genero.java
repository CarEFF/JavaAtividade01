/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminino");
    
    private char sigla;
    private String texto;

    private Genero(char sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }
    
    public char getSigla() {
        return sigla;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
