# Laboratorio 3 - Clase de Equivalencia - 2022-1
## Compilar y Ejecutar
* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase AppTest con resultado exitoso.

    * _mvn test_ : ejecuta los test en '/src/test/java'

## Clases de Equivalencia
* Clases de equivalencia para la clase REGISTRY

    * DEAD  : El atributo alive es FALSE.
    * UNDERAGE: El rango de edad esta entre 0 y 18 (0 <= age < 18) y la persona esta viva (alive = TRUE).
    * INVALID_AGE: La edad es un numero negativo (age < 0).
    * DUPLICATE: La persona ya realizo la votacion satisfactoriamente.
    * VALID: La persona esta en el rango de votacion (age >= 18), esta viva (alive = TRUE ) y no a realizado una votacion con anterioridad.