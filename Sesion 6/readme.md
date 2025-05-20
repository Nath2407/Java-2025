## 🎯 Objetivo

⚒️ Comprender y utilizar las colecciones en Java (`List`, `Set`, `Map`), diferenciando sus estructuras (`ArrayList`, `HashSet`, `HashMap`) y aplicando ordenamiento con `Comparable` y `Comparator`, así como una introducción a las colecciones concurrentes para entornos multihilo.

---

## 📘 Material del prework

Antes de comenzar con los ejercicios de esta sesión, recordemos que en el material de prework hemos cubierto los fundamentos teóricos que aplicaremos hoy.  
A lo largo de esta sesión, pondremos en práctica estos conceptos mediante una serie de ejercicios y retos diseñados para reforzar y validar nuestro entendimiento.

🔥 ¡Vamos a comenzar! 🔥

---

## 📂 Temas de la sesión...

---

### 📖 Introducción a las colecciones (`List`, `Set`, `Map`)

Las colecciones permiten almacenar y manipular grupos de datos de manera eficiente:

- `List`: ordenada y permite duplicados.
- `Set`: no permite duplicados.
- `Map`: maneja pares clave-valor.

📜 Ejemplo 01: Introducción a las colecciones

---

### 📖 Diferencias entre `ArrayList`, `HashSet` y `HashMap`

Cada estructura tiene un propósito distinto:

- `ArrayList`: lista ordenada, acceso por índice, permite duplicados.
- `HashSet`: no ordenada, sin duplicados.
- `HashMap`: clave-valor, clave única.

📜 Ejemplo 02: Diferencias entre `ArrayList`, `HashSet` y `HashMap`

---

### 🔥 Reto 01: Registro y análisis de muestras genéticas

Desarrollar una aplicación que use diferentes colecciones para registrar muestras genéticas, analizar duplicados y ordenarlas según criterios definidos.

---

### 📖 Ordenamiento con `Comparator` y `Comparable`

Permiten ordenar colecciones según un criterio:

- `Comparable`: define orden natural (desde la clase).
- `Comparator`: define orden externo y personalizado.

📜 Ejemplo 03: Ordenamiento con `Comparator` y `Comparable`

---

### 📖 Introducción a colecciones concurrentes

En entornos multihilo, se requieren estructuras seguras para evitar condiciones de carrera:

- `CopyOnWriteArrayList`: lista segura para lectura concurrente.
- `ConcurrentHashMap`: mapa con acceso concurrente.

---

✅ **Conceptos que reforzarás**

- Diferencias entre estructuras de colección (`ArrayList`, `HashSet`, `HashMap`)
- Uso y aplicación de ordenamiento (`Comparable`, `Comparator`)
- Introducción a programación concurrente con colecciones seguras
- Mejores prácticas en el manejo de datos en Java
