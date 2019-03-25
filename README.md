# PROYECTO: FORMATEADOR DE DATOS
Suponga que los datos de la tabla ALUMNOS de una base de datos ESCOLAR son los siguientes:

•	No. De Control
•	Nombre
•	Apellido Paterno
•	Apellido Materno
•	Edad
•	Sexo
•	Carrera
•	Semestre

El Gestor de Base de datos tiene la capacidad de exportar las tuplas de la tabla a un archivo .TXT cuyos registros tiene el siguiente formato:

No. De Control|Nombre|Apellido Paterno|Apellido Materno|Edad|Sexo|Carrera|Semestre

Se desea construir un framework que permita transformar los datos a diferentes maneras. En principio los requisitos planteados demandan los siguientes formatos:
1.	(.TXT) donde cada campo pueda ser separado mediante un carácter de tabulación (ASCII 009). Este formato puede ser leído en Excel.
2.	(.CSV) donde cada campo pueda ser separado mediante una coma (,). Este formato puede ser leído en Excel.
3.	(XML) donde a partir de una estructura XML establecida, los datos puedan ser procesados.
4.	(JSON) donde los datos puedan ser procesados de forma ligera con esta notación.

La solución debería estar preparada para posibles extensiones a formatos futuros que en la actualidad no se requieren, pero que pudieran necesitarse después.

ENTREGABLES:

a)	El proyecto se realizará de forma individual.

b)	El Diagrama de Clases mostrando la vista estructural del diseño (En documento Word). Debe mostrarse claramente el uso del patrón Factory correspondiente como herramienta clave para la implementación de este convertidor.

c)	Las ramas que se crearon para su construcción y control de cambios.

d)	Las pruebas unitarias que prueban el correcto funcionamiento del programa. (En documento Word). Considere como casos de prueba todos los alumnos actuales de nuestro curso de maestría.

e)	La ejecución de las pruebas unitarias demostrando los diversos formatos de salida para el mismos archivo.

f)	La URL del repositorio GIT del proyecto.

