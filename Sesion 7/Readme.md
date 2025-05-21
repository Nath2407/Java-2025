# 🟧 Sesión 07: Colecciones y estructuras de datos

## 🔶 Introducción

¡Bienvenido/a a la **Sesión 07**!

En esta etapa del módulo te adentrarás en una de las herramientas más poderosas para trabajar con archivos y directorios en Java: **NIO.2**.

¿Te imaginas poder leer, escribir, copiar o mover archivos de forma sencilla y eficiente? Pues en esta sesión aprenderás justo eso, ¡y mucho más!

Este prework te dará una primera mirada a los conceptos clave y te permitirá familiarizarte con las clases y métodos que usarás. La idea es que llegues a la sesión en vivo con una base sólida y listo para poner manos al código sin miedo.

> ¡Prepárate para llevar tu conocimiento de Java al siguiente nivel! 🚀

---

## 🎯 Objetivo

- Comprender qué es y para qué sirve la API `java.nio.file` (NIO.2).
- Familiarizarte con las funciones básicas para leer y escribir archivos usando `Files.readString()` y `Files.write()`.
- Explorar métodos avanzados para copiar, mover y gestionar archivos con seguridad.
- Conocer buenas prácticas para trabajar con archivos de forma eficiente y sin errores.

---

## 📋 Instrucciones

Este Prework está diseñado para conocer el contenido que se practicará durante la sesión en vivo. Por favor no lo omitas.

- Toma notas de lo que consideres relevante.
- Guarda tus preguntas o dudas para resolverlas en la sesión.
- Verifica que tu entorno de desarrollo esté listo:
  - IntelliJ IDEA Community Edition
  - JDK instalado

> Si tienes dificultades, pide ayuda a tu experto/a. ¡Estamos aquí para ayudarte! 🚀

---

## 👋 Bienvenido/a

Bienvenid@ al **séptimo Prework del módulo**. A continuación, te presentamos el tiempo estimado de lectura por tema:

| 📖 Temario | 🕰️ Tiempo sugerido |
|-----------|---------------------|
| Tema 01. Introducción a `java.nio.file` (NIO.2) | 5 min |
| Tema 02. Lectura y escritura de archivos con `Files.readString()` y `Files.write()` | 5 min |
| Tema 03. Manejo avanzado de archivos (`Path`, `Files.copy()`, `Files.move()`) | 5 min |
| Tema 04. Buenas prácticas en manejo de archivos | 5 min |

> ¡Comencemos! 🏁

---

## 📚 Tema 01. Introducción a `java.nio.file` (NIO.2)

⏳ **5 minutos de lectura**

Desde Java 7, la API NIO.2 moderniza el manejo de archivos a través del paquete `java.nio.file`.

### 🔍 Diferencias entre IO y NIO.2

| Característica        | IO (`java.io`)           | NIO.2 (`java.nio.file`)             |
|-----------------------|--------------------------|-------------------------------------|
| Estilo de acceso      | Secuencial                | Aleatorio y más flexible            |
| Orientación           | Streams                   | Buffers y canales                   |
| Soporte para archivos | Básico                    | Avanzado                            |
| Multithreading        | Poco eficiente            | Mejor rendimiento en paralelo       |
| Rutas                 | `File`                    | `Path`, `Files`, `FileSystems`     |
| Disponible desde      | Java 1.0                  | Java 7                              |

### 💡 ¿Por qué NIO.2?

Porque es más moderna, flexible y eficaz. Te permite trabajar con archivos y directorios de forma más controlada y segura.

### 📦 Estructura del paquete `java.nio.file`

```plaintext
java.nio.file
├── Path
├── Files
├── FileSystems
├── StandardWatchEventKinds
└── Paths


Fuente:BEDU
