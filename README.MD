# 🎯 Juego del Ahorcado en Java

Una implementación robusta y eficiente del clásico juego del **Ahorcado**, desarrollada en Java y ejecutable mediante consola. Este proyecto se centra en la manipulación dinámica de cadenas de texto y lógica de control de flujo.

---

## 🚀 Características

* **Interfaz Interactiva:** Experiencia de juego fluida directamente en la terminal.
* **Gestión de Pistas:** Generación dinámica de la palabra oculta mediante el uso de `String` y `charAt()`.
* **Eficiencia en Memoria:** Actualización de la palabra adivinada sin depender de estructuras de datos complejas o arrays innecesarios.
* **Validación de Entradas:** Control estricto de intentos y validación de caracteres ingresados por el usuario.
* **Motor de Búsqueda:** Recorrido indexado para detectar coincidencias múltiples de una misma letra.

---

## 🛠️ Tecnologías y Conceptos Aplicados

El proyecto sirve como una excelente práctica para dominar los fundamentos de Java:

| Concepto | Aplicación |
| :--- | :--- |
| **Java SE** | Núcleo del lenguaje. |
| **Scanner** | Captura de datos del usuario por consola. |
| **Bucles (while / for)** | Gestión del ciclo de vida del juego y recorrido de strings. |
| **Condicionales (if/else)** | Lógica de validación de aciertos y errores. |
| **String Manipulation** | Uso de métodos como `length()`, `charAt()` y concatenación dinámica. |

---

## 🧠 Lógica del Juego

El motor del juego sigue estos pasos lógicos:

1.  **Inicialización:** Se define la `palabraSecreta` y se genera una cadena de guiones (`-`) equivalente a su longitud.
2.  **Entrada de Datos:** El sistema solicita una letra mediante la clase `Scanner`.
3.  **Procesamiento:** Se recorre la palabra secreta. Si existe una coincidencia en el índice `i`, se actualiza la posición correspondiente en la cadena de progreso.
4.  **Estado de Victoria/Derrota:** * **Victoria ✅:** La cadena de progreso es igual a la palabra secreta.
    * **Derrota ❌:** El contador de intentos llega a cero.



---

## 💻 Ejemplo de Ejecución

```text
¡Bienvenido al Ahorcado!
Palabra a adivinar: -----
Intentos restantes: 6
Introduce una letra: a

¡Bien hecho! La palabra ahora es: a____a