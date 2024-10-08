### Descripción de Capas:

- **Core (Núcleo)**: Contiene los **modelos** del dominio y las **interfaces** (**puertos**) que definen cómo la lógica de negocio interactúa con el exterior. No tiene ninguna dependencia de infraestructura o tecnología externa.
  
  - **model**: Aquí se definen las clases de dominio, como `UserModel` y `FlightModel`, que representan los conceptos clave de la lógica de negocio.
  - **port**: Interfaces que definen las operaciones que puede realizar el núcleo (por ejemplo, guardar un usuario, obtener un vuelo). Son los "puertos" que conectan la lógica del negocio con los adaptadores externos.

- **Application**: Implementación de los **casos de uso** de la aplicación. Aquí es donde se coordina la lógica de negocio, utilizando las interfaces del núcleo y llamando a los puertos de salida cuando es necesario interactuar con el exterior.

- **Adapters**: Contiene los adaptadores que permiten que la aplicación interactúe con tecnologías externas, como bases de datos o APIs REST.

  - **persistence**: Aquí se manejan las interacciones con la base de datos. Las clases de este paquete implementan las interfaces de persistencia definidas en el núcleo.
    - **entity**: Entidades de la base de datos que mapean tablas en el sistema relacional (por ejemplo, `UserEntity`, `FlightEntity`).
  
  - **rest**: Contiene los **controladores REST** que exponen las funcionalidades de la aplicación a través de HTTP.
    - **controller**: Controladores que reciben solicitudes HTTP y llaman a los casos de uso.
    - **dto**: Objetos de transferencia de datos que se usan para comunicar datos entre la API y el dominio.
    - **advice**: Manejadores globales de excepciones que permiten gestionar los errores de manera centralizada con `@ControllerAdvice`.
