# Introducción al Test-Driven Development

1. Estructura del workshop:
   * Introducción al TDD.
   * Estrategias en TDD, cómo aplicar en diferentes tipos de tests y proyectos.
   * Escuela de Chicago, TDD orientado a clases o Inside Out.
   * Escuela de Londres, TDD orientado a integración u Outside In.
2. Qué es TDD:
   * El TDD fue desarrollado por **Kent Beck** a finales de la década de los 90 y forma parte de la metodología *Extreme Programming*, y publicado en su libro *Test-Driven Development by Example*. Es la unión de las metodologías **Test First** y **Refactoring**.
   * Es una práctica de programación que consiste en escribir primero las pruebas, después escribir el código fuente que pase la prueba satisfactoriamente y, por último, refactorizar el código para mejorarlo. 
   * Es una estrategia de desarrollo y diseño que se da la mano con las *metodologías ágiles* como **Scrum**, metodología **BDD** y principios como **SOLID** y **KISS**.
   * **NO** es una estrategia de testing, su objetivo no es crear más tests o un tipo concreto de tests.
3. El ciclo Red-Green-Refactor:
   * **Red**: Escribir un test que falle, es decir, tenemos que realizar el test antes de escribir la implementación. 
   * **Green**: Una vez creado el test que falla, implementaremos el mínimo código necesario para que el test pase.
   * **Refactor**: Por último, tras conseguir que nuestro código pase el test, debemos examinarlo para ver si hay alguna mejora que podamos realizar.
4. **Robert C. Martin** describe la esencia del TDD como un proceso que atiende a las siguientes *tres reglas*:
   * No escribirás código de producción sin antes escribir un test que falle.
   * No escribirás más de un test unitario suficiente para fallar (y no compilar es fallar).
   * No escribirás más código del necesario para hacer pasar el test.
5. Estrategias de implementación, de rojo a verde
   * **Implementación falsa**: devolver un valor fijo (hardcoded). 
   * **Implementación obvia**: solución más sencilla y fácil de implementar.
   * **Triangular**: usar varios tests para asegurar que cubrimos todos los casos de uso (corner cases).
6. Ventajas
   * Ayuda a desarrollar de forma ordenada e iterativa, haciendo fácil controlar cuanto se ha desarrollado y cuanto queda por desarrollar.
   * Nos ayuda a diseñar componentes con responsabilidades bien definidas (S en SOLID).
   * Solo se desarrolla el código estrictamente necesario.
   * Código con una buena cobertura de test.
   * Código más fácilmente mantenible.
   * Documenta el código de una forma fidedigna.
   * Mayor velocidad en el desarrollo.
7. Desventajas.
   * Aplicar TDD no encaja bien en todos los contextos, por ejemplo no encaja con interfaces visuales.
   * No es una varita mágica: hay que tener buenas bases de diseño y patrones para refactorizar bien.
