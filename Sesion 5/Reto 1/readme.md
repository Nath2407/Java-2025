# Objetivo

Construir un sistema que modele diferentes tipos de unidades de emergencia, aplicando los principios de **herencia** y **composición** en Java.  
Reforzarás el uso de `extends`, `super`, y el diseño modular usando clases auxiliares.

---

## 🛠️ Escenario

Estás diseñando un sistema que permite registrar y activar diferentes unidades de respuesta a emergencias, como **ambulancias**, **patrullas** y **camiones de bomberos**.  
Aunque todas comparten ciertas funciones (como responder a una emergencia), cada una puede tener un comportamiento específico.

Además, todas las unidades están equipadas con tecnología como **sistemas GPS**, **sirenas**, y son operadas por **personal capacitado**.  
Estos componentes serán modelados mediante **composición**.

---

## 📝 Instrucciones

### 🧱 Clase abstracta `UnidadEmergencia`
- Atributo: `nombre` (`String`)
- Método abstracto: `responder()`
- Método concreto: `activarUnidad()` → imprime mensaje de activación

---

### 🚑 Subclases de `UnidadEmergencia`
Crea las siguientes clases que **extienden** `UnidadEmergencia`:

- `Ambulancia`
- `Patrulla`
- `UnidadBomberos`

Cada clase debe:
- Sobrescribir el método `responder()` con un mensaje propio

---

### 🧩 Clases auxiliares para composición

- `SistemaGPS` → método `localizar()`
- `Sirena` → método `activarSirena()`
- `Operador` → atributo `nombre`, método `reportarse()`

---

### 🔁 Composición en las subclases

En `Ambulancia`, `Patrulla` y `UnidadBomberos`, agrega los componentes como atributos por **composición**, y crea un método `iniciarOperacion()` que invoque:

1. `activarUnidad()` (heredado)
2. `localizar()` (GPS)
3. `activarSirena()` (Sirena)
4. `reportarse()` (Operador)
5. `responder()` (método sobrescrito)

---

### 🧪 Clase `CentralEmergencias` (método `main`)
- Crea una instancia de cada tipo de unidad
- Llama al método `iniciarOperacion()` en cada una

---

## 🧩 Salida esperada

```text
🚨 Activando unidad: Ambulancia  
📍 GPS: Ubicación actual detectada.  
🔊 Sirena: Activada.  
👷 Operador Juan reportándose.  
🩺 Ambulancia en camino al hospital más cercano.

🚨 Activando unidad: Patrulla  
📍 GPS: Ubicación actual detectada.  
🔊 Sirena: Activada.  
👮 Operador Laura reportándose.  
🚓 Patrulla atendiendo situación de seguridad ciudadana.

🚨 Activando unidad: UnidadBomberos  
📍 GPS: Ubicación actual detectada.  
🔊 Sirena: Activada.  
👨‍🚒 Operador Marco reportándose.  
🔥 Unidad de bomberos respondiendo a incendio estructural.
Fuente: Material BEDU
