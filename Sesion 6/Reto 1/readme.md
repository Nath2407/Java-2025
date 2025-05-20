# Gestión Concurrente de Temas y Recursos para Clases

## Objetivo
Practicar el uso de:

- `Comparable` y `Comparator` para ordenar temas de clase.
- `CopyOnWriteArrayList` para gestionar de forma segura una lista de temas activos.
- `ConcurrentHashMap` para mantener un repositorio de recursos compartidos por tema, accesible de forma segura desde distintos usuarios.

## Escenario
Eres educadora y estás preparando el temario mensual de clases para un grupo de docentes que colaboran contigo. Cada tema tiene:

- Un nombre.
- Un número de prioridad (1 = urgente, 2 = importante, 3 = opcional).

Tu equipo también comparte materiales y enlaces digitales por tema, que se almacenan en un repositorio compartido. El sistema debe:

- Gestionar los temas activos usando una lista concurrente.
- Ordenar los temas por nombre (alfabético) y por prioridad (orden ascendente).
- Mantener un repositorio concurrente de materiales asociados a cada tema, donde se guarde el título del tema como clave y el enlace o recurso sugerido como valor.

## Instrucciones
- Crea una clase `Tema` con:
  - `titulo` (String)
  - `prioridad` (int)
- Implementa `Comparable<Tema>` para ordenar por título.
- En tu método `main`:
  - Usa `CopyOnWriteArrayList<Tema>` para gestionar los temas activos.
  - Muestra la lista ordenada alfabéticamente (orden natural).
  - Luego ordénala por prioridad ascendente (1 → 3) usando `Comparator`.
  - Usa `ConcurrentHashMap<String, String>` como repositorio:
    - Clave: título del tema.
    - Valor: descripción o enlace del recurso compartido.

## Ejemplo
```java
temas.add(new Tema("Lectura comprensiva", 2));
temas.add(new Tema("Matemáticas básicas", 1));
temas.add(new Tema("Cuidado del medio ambiente", 3));

recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
