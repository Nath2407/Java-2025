# Objetivo

Diseñar un sistema de pagos en el que distintos métodos de pago (efectivo, tarjeta, transferencia) compartan una estructura común pero tengan comportamientos específicos.  
Aplicarás el uso de interfaces, clases abstractas y polimorfismo para modelar un flujo flexible y extensible.

---

## 🛠️ Escenario

Estás construyendo un módulo para una tienda en línea.  
El sistema debe permitir procesar pagos mediante diferentes medios: **efectivo**, **tarjeta bancaria** o **transferencia**.

Cada tipo de pago debe implementar su propia lógica de **autenticación** y **procesamiento**, siguiendo un **contrato común** (interfaz) y compartiendo una **estructura base** (clase abstracta).  
Además, debe cumplir el **principio de extensión**: poder agregar nuevos métodos sin modificar los existentes.

---

## 📝 Instrucciones

### 🔧 Interfaz `Autenticable`


### Método boolean autenticar()
🧱 Crea una clase abstracta MetodoPago con:

### Atributo monto (double)
Método abstracto procesarPago()
Método concreto mostrarResumen() que imprima el tipo de pago y el monto
💳 Crea las clases concretas que extiendan MetodoPago y implementen Autenticable:

### PagoEfectivo → autenticar() siempre retorna true (no requiere validación)
### PagoTarjeta → valida si hay fondos suficientes
### PagoTransferencia → simula una validación bancaria externa
### 🧠 Cada clase debe sobrescribir procesarPago() y autenticar() usando @Override

### 🧪 En la clase CajaRegistradora:

Crea un arreglo de tipo MetodoPago con instancias mezcladas (polimorfismo)
Recorre el arreglo, llama a autenticar() y si es válido, llama a procesarPago() y mostrarResumen()
✅ Autenticación exitosa.
💵 Procesando pago en efectivo por $150.0
📄 Tipo: PagoEfectivo - Monto: $150.0

✅ Autenticación exitosa.
💳 Procesando pago con tarjeta por $320.0
📄 Tipo: PagoTarjeta - Monto: $320.0

❌ Fallo de autenticación. PagoTransferencia no válido.
