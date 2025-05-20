## 🎯 Objetivo
Practicar el uso de las colecciones ArrayList, HashSet y HashMap en un contexto profesional de biotecnología, con el propósito de:

Registrar el orden de llegada de muestras genéticas.

Identificar especies únicas procesadas.

Asociar cada muestra con su respectivo investigador responsable.

## 🧬 Escenario
Te encuentras colaborando como desarrollador Java en un laboratorio de biotecnología molecular. El equipo de bioinformática necesita tu ayuda para organizar el registro de las muestras genéticas que llegan diariamente.

Debes implementar un sistema que permita llevar control de:

📥 El orden de llegada de las muestras (pueden repetirse si se replican).

🧬 Las especies únicas que han sido procesadas.

🧑‍🔬 El ID de cada muestra asociado con el nombre del investigador responsable.

 ## 🛠️ Instrucciones
Crea un programa en Java que cumpla con los siguientes requisitos:

Usa un ArrayList<String> para registrar el orden en que llegaron las muestras.

Ejemplo:
"Homo sapiens", "Mus musculus", "Arabidopsis thaliana", "Homo sapiens"

Usa un HashSet<String> para obtener una lista de especies únicas procesadas.

Usa un HashMap<String, String> para asociar cada ID de muestra con el nombre del investigador responsable.

Ejemplo:

"M-001" → "Dra. López"

"M-002" → "Dr. Hernández"

 ## Muestra en consola:

📋 Lista completa y ordenada de las muestras recibidas.

🧬 Especies únicas que han sido procesadas.

🧑‍🔬 Relación ID de muestra → Investigador responsable.

🔍 Búsqueda de un investigador por ID de muestra (por ejemplo, buscar "M-002").

💡 Consejos para resolver el reto
Utiliza nombres de variables descriptivos y en español.

Agrega comentarios que expliquen claramente cada bloque de código.

Usa System.out.println() para mostrar resultados de forma clara y ordenada.
