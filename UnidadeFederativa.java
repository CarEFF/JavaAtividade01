/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA('B',"Bahia"),
    SAOPAULO('s',"São Paulo"),
    RIODEJANEIRO('R',"Rio de janeiro");

    private final String texto;
    private final char sigla;

    private UnidadeFederativa(char sigla, String texto) {
        this.texto = texto;
        this.sigla = sigla;
    }
    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
    
    


}
