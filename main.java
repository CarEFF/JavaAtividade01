/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade02;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Rua", "561", "Rua direta", "40454-120", "Salvador", UnidadeFederativa.RIODEJANEIRO);
        Funcionario funcionario = new Funcionario(01, "Carlos", "321.654.987-54", "985-852-123-41", "658932", LocalDate.of(2001, Month.JUNE, 17), 0321, "71986532124", "carlos@gmail.com", Genero.MASCULINO, Setor.SAUDE, endereco);
        
        System.out.println("Hello World!");
        System.out.println(funcionario.toString());
        
        
    }
}
