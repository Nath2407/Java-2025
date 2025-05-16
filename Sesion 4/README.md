# 🧪 Sesión: Fundamentos de Clases en Java

## 🎯 Objetivo

Comprender los elementos fundamentales de una clase en Java, tales como:

- Constructores  
- Métodos especiales (`equals()`, `hashCode()`, `toString()`)  
- Uso de `record` y `Objects.equals()`  
- Principios de encapsulación e inmutabilidad  

Todo ello con el propósito de estructurar clases seguras, limpias y eficientes.

---

## 📘 Material del Prework

Antes de comenzar con los ejercicios de esta sesión, recuerda revisar el material del prework. Ahí se cubren los fundamentos teóricos que aplicaremos hoy.  
A lo largo de la sesión, reforzaremos este conocimiento mediante ejercicios prácticos y retos.  

> 🔥 ¡Vamos a comenzar! 🔥

---

## 📂 Temas de la Sesión

### 📖 Constructores e Inicialización de Objetos

Los constructores permiten crear e inicializar objetos de forma segura y controlada.

**Tipos de constructores:**

- Constructor por defecto  
- Constructor con parámetros  
- Constructor de copia  
- Sobrecarga de constructores  
- Asignación de valores por defecto  

> 🧠 Mejora la legibilidad, garantiza estados válidos y personaliza la creación de objetos.

📜 **Ejemplo 01:** Constructores e inicialización de objetos

---

### 📖 Métodos `equals()`, `hashCode()` y `toString()`

Permiten comparar, identificar y representar objetos de manera efectiva:

- `equals()`: compara el contenido de objetos  
- `hashCode()`: genera un valor hash único (útil en estructuras como `HashSet`)  
- `toString()`: muestra una representación legible del objeto  

> 🧠 Ayudan en la depuración, comparación y organización del código.

📜 **Ejemplo 02:** Métodos `equals()`, `hashCode()` y `toString()`  
🔥 **Reto 01:** Registro y comparación de facturas

---

### 📖 Uso de `record` y `Objects.equals()`

Java introduce herramientas modernas para simplificar el manejo de datos:

- `record`: clases inmutables con menos código  
- `Objects.equals()`: comparación segura que maneja `null`  

> 🧠 Permiten crear estructuras de datos limpias, modernas y libres de errores de `NullPointerException`.

📜 **Ejemplo 03:** Uso de `record` y `Objects.equals()`

---

### 📖 Principios de Encapsulación e Inmutabilidad

Encapsular atributos protege los datos internos de una clase. La inmutabilidad evita que los valores cambien una vez asignados.

**Prácticas clave:**

- Uso de `private`, `getters` y `setters`  
- Validación de datos  
- Clases inmutables (`final`, sin setters)  

> 🧠 Mejora la seguridad, mantenibilidad y evita errores.

📜 **Ejemplo 04:** Principios de encapsulación e inmutabilidad  
🔥 **Reto 02:** Comparación de declaraciones de impuestos

---

## ✅ Conclusión

Esta sesión te ayudará a dominar los componentes esenciales para construir clases en Java de forma profesional. Al finalizar, serás capaz de:

- Crear objetos correctamente con constructores
- Comparar e imprimir objetos de forma segura y clara
- Aplicar buenas prácticas de encapsulación e inmutabilidad
- Usar herramientas modernas como `record` y `Objects.equals()`
