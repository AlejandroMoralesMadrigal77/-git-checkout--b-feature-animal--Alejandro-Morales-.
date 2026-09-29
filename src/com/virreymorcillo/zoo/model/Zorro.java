package com.virreymorcillo.zoo.model;
public class Zorro extends Animal {
    public Zorro(String nombre) {
        super(nombre);
    }
  @Override
    public void makeSound() {
        System.out.println("El zorro hace: ¡Auuuu!"); 
    }
}
