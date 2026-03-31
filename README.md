# actividad-4
actividad 4
# Simulación de Banco con Colas y Prioridad en Java

## Descripción

Este proyecto implementa una simulación de atención de clientes en un banco utilizando estructuras de datos.

El sistema modela la llegada de clientes en el tiempo y su atención en ventanilla, diferenciando entre clientes normales y clientes urgentes, a quienes se les da prioridad.

---

## Objetivo

Aplicar estructuras de datos como colas y colas de prioridad para resolver un problema de atención con prioridades, simulando un entorno real.

---

## Estructura del Proyecto

### Cliente.java

Clase que representa a cada cliente del banco.

Atributos:

* id: identificador del cliente
* tipo: "normal" o "urgente"
* tiempoLlegada: momento en el que llega al sistema

---

### Nodo.java

Clase auxiliar que permite construir una lista enlazada para la implementación de la cola.

Atributos:

* dato: objeto de tipo Cliente
* siguiente: referencia al siguiente nodo

---

### Cola.java

Implementa una cola (FIFO - First In, First Out) para manejar clientes normales.

Métodos:

* encolar(Cliente c): agrega un cliente al final
* desencolar(): elimina el cliente del frente
* estaVacia(): verifica si la cola está vacía

---

### SimulacionBanco.java

Clase principal que ejecuta la simulación.

Funciones principales:

* Genera clientes de manera aleatoria
* Clasifica clientes en normales y urgentes
* Usa una cola FIFO para clientes normales
* Usa una PriorityQueue para clientes urgentes
* Atiende primero a los clientes urgentes
* Calcula el tiempo de espera de cada cliente
* Muestra estadísticas finales

---

## Funcionamiento

1. El sistema avanza en unidades de tiempo (simulación).
2. En cada unidad de tiempo:

   * Puede llegar un cliente (probabilidad aleatoria).
   * Se asigna un tipo (normal o urgente).
   * Se agrega a la estructura correspondiente.
3. Se atiende un cliente por unidad de tiempo:

   * Primero los urgentes.
   * Luego los normales.
4. Se calcula el tiempo de espera.
5. Al finalizar, se muestran estadísticas.

---

## Tipos de Estructuras Utilizadas

* Cola (FIFO): para clientes normales
* Cola de prioridad (PriorityQueue): para clientes urgentes
* Lista enlazada: implementación interna de la cola

---

## Ejecución

1. Compilar los archivos:

```
javac *.java
```

2. Ejecutar el programa:

```
java SimulacionBanco
```

---

## Resultados

El programa muestra en consola:

* Llegada de clientes
* Atención de clientes
* Tiempo de espera por cliente
* Total de clientes atendidos
* Tiempo promedio de espera

---

## Conceptos Aplicados

* Estructuras de datos
* Programación orientada a objetos
* Simulación de sistemas
* Manejo de colas y prioridades
* Cálculo de métricas

---

## Autor

Juan Camilo Puentes

---

## Notas

Este proyecto es una simulación simplificada de un sistema real de atención al cliente, donde se aplican conceptos fundamentales de estructuras de datos para resolver problemas de prioridad y orden.
