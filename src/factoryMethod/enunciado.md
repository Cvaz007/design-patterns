# Factory method

La empresa de videojuegos ÑOLA ha encomendado la creación de un módulo que permita la generación dinámica de unidades
militares en su juego. Este módulo debe ser capaz de crear diferentes tipos de unidades, como soldados, aviones y
tanques, cada uno con atributos específicos que los caracterizan. Sin embargo, la particularidad de este desafío radica
en que la creación de estas unidades militares puede variar según la zona o contexto del juego en el que se implementen (zona boscosa, zona urbana y zona costera).
Dado que el juego puede tener distintas zonas con características y requisitos diversos, es fundamental que el proceso
de creación de las unidades sea eficiente y adaptable a cada contexto sin necesidad de modificar el código base. Esto
implica la necesidad de un mecanismo que permita crear objetos sin especificar su clase concreta de antemano, sino que
se adapte dinámicamente a las condiciones del entorno de juego.

**Justificación:** El patron factory method da solución al problema ya que en situaciones donde una clase necesita crear
objetos, pero no conoce exactamente la clase concreta que debe instanciar, el patrón Factory Method puede ser útil. Este
patrón define una interfaz para crear un objeto, pero deja la implementación de la creación del objeto a las clases
derivadas. Esto permite a una clase delegar la responsabilidad de la creación de objetos a sus subclases, lo que
facilita la adición de nuevas clases de productos sin modificar el código existente.