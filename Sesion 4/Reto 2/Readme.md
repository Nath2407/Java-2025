# 📄 Reto: Declaración de Impuestos con Record y Validación Segura

## 🎯 Objetivo

📄 Modelar una declaración de impuestos con `record` y validarla contra una cuenta fiscal usando **encapsulación** y comparación segura con `Objects.equals()`.

---

## 📝 Instrucciones

👤 Este reto se puede resolver de forma individual.

---

### 🧾 Parte 1: Record `DeclaracionImpuestos`

Crea un `record` llamado `DeclaracionImpuestos` con los siguientes campos:

- `String rfcContribuyente`
- `double montoDeclarado`

---

### 🏦 Parte 2: Clase `CuentaFiscal`

Crea una clase tradicional llamada `CuentaFiscal` con:

- Un atributo privado `String rfc` (**no modificable una vez asignado**).
- Un atributo privado `double saldoDisponible`.

#### Implementa lo siguiente:

- Constructor con **validación** para que el saldo no sea negativo.
- Getters para ambos atributos.
- Método `validarRFC(DeclaracionImpuestos d)` que compare el RFC de la cuenta con el de la declaración usando `Objects.equals()`.

---

## 💻 Clase `Main`

- Crea una declaración de impuestos.
- Crea una cuenta fiscal.
- Muestra la información de ambas.
- Valida si el RFC coincide y muestra el resultado.

