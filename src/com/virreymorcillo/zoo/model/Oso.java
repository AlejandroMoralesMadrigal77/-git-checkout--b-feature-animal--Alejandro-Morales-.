package com.virreymorcillo.zoo.model;

public class Oso extends Animal{
    public Oso(String nombre) {
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println(nombre + "(Oso) aulla y balida");
    }
}
