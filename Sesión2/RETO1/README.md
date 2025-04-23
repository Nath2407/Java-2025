# 💊 Reto: Simulador de Farmacia

## 🎯 Objetivo

⚒️ Desarrollar un programa que calcule el total de una compra en farmacia y aplique un descuento si supera cierta cantidad.  
Este reto refuerza el uso de operadores aritméticos, asignación, entrada por consola, e inferencia de tipo con `var`.

## 📝 Instrucciones

👥 Puedes resolver este reto de forma individual o en equipo.

### 🏗️ Crea una clase llamada `SimuladorFarmacia`

Solicita al usuario los siguientes datos:

- Nombre del medicamento (`String`)
- Precio unitario (`double`)
- Cantidad de piezas (`int`)

### 🔢 Lógica del programa

1. Calcula el **total sin descuento** multiplicando el precio por la cantidad.
2. Si el total supera los **$500.00**, aplica un **15% de descuento** usando el operador ternario `? :`.
3. Muestra en consola el resumen con el siguiente formato:

```
Medicamento: Amoxicilina
Cantidad: 5
Precio unitario: $120.0
Total sin descuento: $600.0
¿Aplica descuento?: true
Descuento: $90.0
Total a pagar: $510.0
```

## 📌 Consideraciones

- Usa `var` en al menos una línea.
- No uses `if`, `else` ni `switch`.
- Solo operadores básicos y ternarios.
- El descuento solo debe calcularse si el total supera los $500.00.


