# 📄 Reto: Clase Factura con Encapsulación y Optional en Java

## 🎯 Objetivo

Diseñar una clase **Factura** aplicando los principios de **encapsulación** con modificadores de acceso y utilizando la clase **Optional** para manejar valores que pueden ser nulos, como el RFC del cliente.

---

## 📝 Instrucciones

### 🧾 Tu reto será modelar una factura sencilla que contenga:

- Datos básicos de una compra  
- Opcionalmente, el RFC del cliente  

El acceso a los atributos debe estar protegido y debe permitirse el uso seguro de valores nulos a través de **Optional**.

---

### 🧱 1. Crear la clase Factura

#### 🔐 Atributos privados:

- `double monto`: cantidad total de la factura 💵  
- `String descripcion`: breve concepto de lo facturado 🧾  
- `Optional<String> rfc`: RFC del cliente (puede estar presente o no)  

#### 🛠️ Métodos públicos:

- Constructor `Factura(double monto, String descripcion, String rfc)`  
  - Si el RFC es `null`, debe almacenarse usando `Optional.empty()`  
- Método `String getResumen()`  
  - Devuelve una cadena con los datos de la factura  
  - Si el RFC está presente, se muestra  
  - Si no, se muestra `"RFC: [No proporcionado]"`

---

### 🚀 2. En la clase Principal

#### 📌 Actividades:

- Crear al menos 2 facturas:  
  - Una con RFC  
  - Otra sin RFC (`null`)  
- Imprimir el resumen de ambas facturas usando el método `getResumen()`

---

### 🧩 Salida esperada
Factura generada:
Descripción: Servicio de consultoría
Monto: $255200.0
RFC: ABCC010101XYZ

Factura generada:
Descripción: Reparación de equipo
Monto: $180260.0
RFC: [No proporcionado]
