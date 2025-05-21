# 🎮 Refactorización y Principios SOLID en un Motor de Narrativa para Videojuegos

##🎯 Objetivo

🧠 Aplicar **refactorización** y los **principios SOLID** en un caso práctico relacionado con **videojuegos narrativos**, separando responsabilidades y utilizando interfaces para lograr un sistema **escalable** y **mantenible**.

---

## 📝 Instrucciones

🎮 Imagina que formas parte del equipo de desarrollo de un videojuego narrativo. Actualmente, una clase llamada `Narrador` concentra toda la lógica de decisiones, transiciones de historia y los diálogos, lo cual dificulta su mantenimiento y evolución.

Tu misión será **refactorizar** este motor narrativo aplicando **buenas prácticas de diseño orientado a objetos**.

---

## 🧩 Actividades

1. Crea una clase principal llamada `MainNarrativa` que simule el flujo de una escena narrativa.

2. Refactoriza el diseño original (una clase gigante llamada `Narrador`) dividiendo las responsabilidades en **al menos tres interfaces**:

   - `TransicionHistoria`: define cómo se pasa de una escena a otra.
   - `GestorDialogo`: se encarga de imprimir o manejar los diálogos.
   - `LogicaDecision`: toma decisiones según la acción del jugador.

3. Implementa una clase por cada interfaz que cumpla una responsabilidad específica. Ejemplos:
   - `TransicionSimple`
   - `DialogoTexto`
   - `DecisionBinaria`

4. Utiliza **inyección de dependencias** para que la clase principal (`MainNarrativa`) dependa solo de las interfaces, no de implementaciones concretas (Principio **DIP**).

5. Aplica también el principio **OCP (Open/Closed Principle)**: las clases deben estar abiertas a extensión (por ejemplo, nuevas transiciones o diálogos), pero cerradas a modificaciones.

6. Ejecuta una **simulación simple** donde el usuario tome una decisión, y el sistema responda con una transición de historia y un diálogo.

---

## 💡 Tip

✅ Si tienes dudas sobre cómo dividir responsabilidades, piensa en una **obra de teatro**:

- El narrador solo cuenta lo que pasa.
- Los actores solo dicen su diálogo.
- El guión decide qué sucede según lo que hagan los personajes.

---
Fuente:BEDU
## ✅ Resultado Esperado

Un sistema modular, basado en interfaces, fácil de extender y mantener, que siga los principios SOLID y permita manejar escenas narrativas de manera profesional.

---
