## 🎯 Objetivo

💻 Implementar un programa que simule un **cajero automático básico**, aplicando estructuras de control como `while`, `switch`, `break` y `continue` para navegar entre opciones y validar operaciones del usuario.

## 📝 Instrucciones

👥 Puedes resolver este reto de forma individual o en equipos.

### 🏗️ Estructura del programa

- Crea una clase llamada `CajeroAutomatico`.
- En el método `main`, define un **saldo inicial** (por ejemplo: `saldo = 1000.0`).  
  > *Tip:* Usa inferencia de tipo (`var saldo = 1000.0`) si estás en Java 10+.

### 📋 Menú interactivo

Muestra un menú en consola como este (puedes usar `do-while`):

```
Bienvenido al cajero automático
1. Consultar saldo
2. Depositar dinero
3. Retirar dinero
4. Salir
Seleccione una opción:
```

### 🔁 Repetición del programa

- El menú debe repetirse con un `while` hasta que el usuario seleccione **opción 4 (Salir)**.

### 🧠 Lógica con `switch`

- ✅ **1. Consultar saldo** → Muestra el saldo actual.
- 💰 **2. Depositar dinero** → Pide el monto a depositar y **súmalo** al saldo.
- 💸 **3. Retirar dinero** → Pide el monto a retirar y:
  - ⚠️ **Valida si hay suficiente saldo.**
  - ❌ Si no hay suficiente, **muestra un mensaje** y **no restes** nada.
- 👋 **4. Salir** → Muestra un mensaje de despedida y termina el programa.

> Usa `break` y `continue` para controlar el flujo correctamente.

## 🎯 Desafío adicional (opcional)

🧠 Si el usuario ingresa una opción inválida, muestra un mensaje de error y vuelve a mostrar el menú sin detener el programa.

## 💡 Propósito del reto

Este reto te ayudará a practicar:

- Ciclos `while` y `do-while`
- Control de flujo con `switch`, `break`, `continue`
- Validación de condiciones
- Manejo de entrada de usuario con `Scanner`
- Simulación de escenarios reales

🏆 ¡Nos vemos en el siguiente reto, mucho éxito! 🎉
