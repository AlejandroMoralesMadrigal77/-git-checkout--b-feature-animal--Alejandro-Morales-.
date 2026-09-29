package com.virreymorcillo.zoo.model;

public class Perro extends Animal implements Pet {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println(nombre + " (Perro) ladra: ¡Guau, guau!");
    }

    @Override
    public void play() {
        System.out.println(nombre + " juega a atrapar la pelota.");
    }
}
