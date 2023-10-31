package com.javapoo;


import com.javapoo.App;
import com.javapoo.Animal;
import com.javapoo.Cachorro;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    public static void main(String[] args) {
        App estudanteApp = new App();
        Animal Animal1=new Animal();
        Cachorro cachorro=new Cachorro();
        estudanteApp.Idade = 23;
        estudanteApp.Nome= "Anderson de Sousa Brito";
        estudanteApp.Sexo= 'M';
        cachorro.Nome="Jake";
        Animal1.comer();
        cachorro.latir();
        System.out.println(estudanteApp.Nome);
        System.out.println(estudanteApp.Idade);
        System.out.println(estudanteApp.Sexo);
        cachorro.dormir();
    }
}
