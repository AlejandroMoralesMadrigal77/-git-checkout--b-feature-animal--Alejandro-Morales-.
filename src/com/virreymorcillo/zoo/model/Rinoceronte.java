package com.virreymorcillo.zoo.model;

public class Rinoceronte extends Animal{
    public Rinoceronte(String nombre) {
        super(nombre);
    }
    @Override
    public void makeSound() {
        System.out.println(nombre + " pega un berrido.");
    }
}
