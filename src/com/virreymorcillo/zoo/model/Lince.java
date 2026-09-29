package com.virreymorcillo.zoo.model;
public class Lince extends Animal {
    public Lince (String nombre) {
        super(nombre);
    }
    @Override
    public void makeSound() {
        System.out.println(nombre + " (Lince) ruge con fuerza ");
    }

}

