# 🏗️ Registro de Parámetros de Simulación

## 🎯 Objetivo

Aplicar las clases `Path` y `Files` de la API `java.nio.file` (NIO.2) para:

- Crear un archivo de configuración de simulación.
- Verificar su existencia.
- Leer su contenido desde la consola.

Este ejercicio simula una tarea real del rol de **Process Simulation Engineer**, donde se documentan los parámetros antes de ejecutar una corrida de simulación en una planta de manufactura digital.

---

## 🛠️ Instrucciones

1. Crear una clase principal llamada `RegistroSimulacion`.
2. Usar `Path` y `Paths.get()` para definir la ruta del archivo `parametros.txt`, dentro de la carpeta `config/`.
3. Escribir parámetros simulados:
    ```
    Tiempo de ciclo: 55.8 segundos
    Velocidad de línea: 1.2 m/s
    Número de estaciones: 8
    ```
4. Utilizar `Files.writeString()` para guardar el contenido.
5. Verificar la existencia del archivo con `Files.exists()`.
6. Leer y mostrar el contenido usando `Files.readString()`.

---

##💡 Tip
✅ Puedes encapsular la lógica de escritura y lectura en métodos separados como guardarParametros() y leerParametros() para mejorar la legibilidad.

📘 ¿Quieres repasar cómo funcionan Path, Files.write() o Files.readString()?
🔗 Documentación oficial de NIO.2 – Oracle

🏆 Este reto te acerca a un escenario real en simulación industrial, donde la trazabilidad y correcta documentación de parámetros es clave para garantizar la calidad y reproducibilidad de resultados.
