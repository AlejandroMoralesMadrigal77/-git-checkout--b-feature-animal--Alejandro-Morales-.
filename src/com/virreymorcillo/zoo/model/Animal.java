package com.virreymorcillo.zoo.model;

/**
 * Clase abstracta base del ejercicio colaborativo.
 *
 * NO SE MODIFICA. Cada alumno crea su propia subclase que extiende Animal,
 * en un fichero nuevo dentro de este mismo paquete (com.virreymorcillo.zoo.model).
 */
public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: cada subclase decide cómo suena su animal.
    public abstract void makeSound();
}
