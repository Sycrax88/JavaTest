-----Sebastian Ospina García-----

Este programa fue creado con Spring Boot y la base de datos y el servidor se crearon con PostgreSQL.
Entre los archivos se encontrará una imagen y un archivo de MySQL para que se pueda visualizar la forma en la que estaba construida la base de datos.

La clase es Program, el cual contiene todos los atributos y métodos de los Programas
Dentro de la clase ProgramConfig, se hizo la configuración y se agregaron 2 programas como prueba de ello.
Dentro de la clase ProgramService encontrarán todas las funcionalidades de CRUD.
Dentro de la clase ProgramController las funcionalidades creadas en ProgramService son llamadas y se le dan los valores a las funciones.
Dentro de la clase ProgramRepository hace uso del JpaRepository, que trae consigo muchas funciones que se utilizan en otras clases.

