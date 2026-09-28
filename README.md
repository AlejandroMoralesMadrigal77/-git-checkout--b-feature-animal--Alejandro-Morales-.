# Zoo Colaborativo — Ejercicio de Git/GitHub con Herencia e Interfaces

Repositorio inicial para el ejercicio colaborativo de la unidad de POO en Java.
Cada alumno/a crea su propia subclase de `Animal` y la incorpora al proyecto
mediante un Pull Request, tocando únicamente su línea reservada en `Main.java`.

## Cómo compilar y ejecutar

Desde la carpeta `src`:

```bash
cd src
javac com/virreymorcillo/zoo/model/*.java com/virreymorcillo/zoo/app/*.java -d ../out
java -cp ../out com.virreymorcillo.zoo.app.Main
```

Con el repositorio recién clonado (sin ningún PR mergeado todavía), la lista
`zoo` está vacía y el programa no imprime nada — es el comportamiento
esperado antes de que se incorpore ninguna contribución.

## Estructura

```
src/
└── com/
    └── virreymorcillo/
        └── zoo/
            ├── model/
            │   ├── Animal.java   (clase abstracta — no se toca)
            │   └── Pet.java       (interfaz — no se toca)
            └── app/
                └── Main.java      (solo se toca la línea reservada de cada alumno)
```

## Reglas para el alumnado

1. Haz un fork de este repositorio.
2. Clónalo y crea tu propia rama: `git checkout -b feature/animal-<tu-nombre>`.
3. Crea un fichero nuevo en `src/com/virreymorcillo/zoo/model/`, con el
   nombre de tu animal asignado, que extienda `Animal`.
4. Si tu animal es "mascota" (según el reparto del profesor), implementa
   también la interfaz `Pet`.
5. En `Main.java`, escribe **una única línea** dentro de tu marcador
   `// --- LÍNEA N ---` asignado. No modifiques ninguna otra parte del fichero.
6. No añadas ningún `import`: `Main.java` ya importa todo el paquete `model`.
7. Compila y ejecuta en local para comprobar que tu animal aparece.
8. Haz commit, push a tu fork, y abre un Pull Request contra este repositorio.

El diff de tu Pull Request debe mostrar exactamente dos cambios: tu fichero
nuevo, y la línea añadida en tu marcador de `Main.java`.

## Contrato técnico de la subclase

- Paquete: `com.virreymorcillo.zoo.model`.
- `extends Animal`.
- Constructor público con un parámetro `String nombre`, que llama a `super(nombre)`.
- Sobrescribe `makeSound()`.
- Si corresponde: `implements Pet` y sobrescribe `play()`.
