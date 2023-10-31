package com.javapoo;

public class AppTest 
{

    public static void main(String[] args) {
  


        App estudanteApp = new App();
        Animal Animal1=new Animal();
        Cachorro cachorro=new Cachorro();
        Carro Car = new Carro();

        estudanteApp.Idade = 23;
        estudanteApp.Nome= "Anderson de Sousa Brito";
        estudanteApp.Sexo= 'M';
        cachorro.Nome="Jake";
        cachorro.Raça="border collie";
        Car.Marca="Toyota";
        Car.Modelo="Corolla";
        Car.Ano= 2014;

        Animal1.comer();
        cachorro.latir();
        System.out.println(estudanteApp.Nome);
        System.out.println(estudanteApp.Idade);
        System.out.println(estudanteApp.Sexo);
        System.out.println("A raça do seu cachorro é "+ cachorro.Raça);
        cachorro.dormir();
        Car.Seucarro();

    }
}
