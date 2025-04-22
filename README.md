# Matrices1
<!-- README.md -->
# Ejercicio Práctico 1: Clase Matriz en Java

Este proyecto contiene una pequeña librería para trabajar con matrices de enteros:

- **Matriz**: clase que encapsula un arreglo bidimensional, con métodos para imprimirla, obtener su transpuesta y consultar dimensiones / valores puntuales.
- **DemoMatriz**: clase con método `main` que muestra ejemplos de uso.

---

## Cómo compilar y ejecutar

Requiere Java 11+ y Maven.

```bash
# Compilar
mvn clean compile

# Ejecutar demo
mvn exec:java -Dexec.mainClass="matrices.DemoMatriz"
