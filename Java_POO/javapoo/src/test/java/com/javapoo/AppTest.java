package com.javapoo;


import com.javapoo.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    public static void main(String[] args) {
        App estudanteApp = new App();
        estudanteApp.Idade = 23;
        estudanteApp.Nome= "Anderson de Sousa Brito";
        estudanteApp.Sexo= 'M';
        System.out.println(estudanteApp.Nome);
        System.out.println(estudanteApp.Idade);
        System.out.println(estudanteApp.Sexo);
    }
}
