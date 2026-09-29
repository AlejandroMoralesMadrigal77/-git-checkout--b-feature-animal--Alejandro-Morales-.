package com.virreymorcillo.zoo.app;

// Import de paquete completo (no uno por clase): así, cuando un alumno
// añade su propia clase dentro de com.virreymorcillo.zoo.model, queda
// automáticamente visible aquí sin tener que tocar esta sección.
import com.virreymorcillo.zoo.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Punto de entrada del ejercicio colaborativo.
 *
 * Este fichero SÍ puede modificarse, pero SOLO en la línea reservada que
 * el profesor te haya asignado (ver tabla de reparto). No toques ninguna
 * otra línea, ni siquiera la de un compañero, aunque esté vacía, y no
 * añadas ningún import: el import de arriba ya cubre tu clase nueva.
 *
 * Hay 10 líneas reservadas por defecto. Si el grupo tiene más alumnos,
 * el profesor debe copiar el bloque "--- LÍNEA N ---" y añadir tantas
 * líneas como haga falta antes de publicar el repositorio inicial.
 */
public class Main {
    public static void main(String[] args) {

        List<Animal> zoo = new ArrayList<>();

        // --- LÍNEA 1 ---


        // --- LÍNEA 2 ---


        // --- LÍNEA 3 ---
        zoo.add(new Lince("SALIEGA"));



        // --- LÍNEA 4 ---


        // --- LÍNEA 5 ---


        // --- LÍNEA 6 ---


        // --- LÍNEA 7 ---


        // --- LÍNEA 8 ---


        // --- LÍNEA 9 ---


        // --- LÍNEA 10 ---


        for (Animal a : zoo) {
            a.makeSound();
            if (a instanceof Pet) {
                Pet mascota = (Pet) a;
                mascota.play();
            }
        }
    }
}
