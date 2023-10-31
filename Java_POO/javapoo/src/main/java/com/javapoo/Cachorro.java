package com.javapoo;

public class Cachorro extends Animal {
    public String Nome;
    public String Raça;
    public void latir() {
        System.out.println("O "+Nome+" está latindo.");
    }
    public void dormir(){
        System.out.println(Nome +" está dormindo");
    }
    public void acordar(){
        System.out.println(Nome +" está acordando");
    }
}
