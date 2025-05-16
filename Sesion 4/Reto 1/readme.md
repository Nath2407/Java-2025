# 🧾 Reto: Modelado de Facturas en Java

## 🎯 Objetivo

💼 Modelar facturas emitidas para un sistema contable, reforzando el uso de:
- Constructores
- Métodos `equals()`, `hashCode()`
- Método `toString()`

---

## 📝 Instrucciones

👤 Este reto se puede resolver de forma individual.

### 📄 Requisitos

Crea una clase llamada `Factura` con los siguientes atributos:

- `String folio`  
- `String cliente`  
- `double total`  

### Implementa lo siguiente:

- Un **constructor con parámetros** para inicializar todos los atributos.
- El método **`toString()`** para mostrar la información con este formato:  
  `🧾 Factura [folio=..., cliente=..., total=$...]`
- El método **`equals()`**, donde dos facturas son iguales si tienen el mismo `folio`.
- El método **`hashCode()`**, basado en el atributo `folio`.

---

## 💻 Clase `Main`

1. Crea dos objetos `Factura` con el mismo folio, pero diferentes cliente o total.
2. Muestra ambas facturas usando `toString()`.
3. Compara si son iguales usando `equals()`.

