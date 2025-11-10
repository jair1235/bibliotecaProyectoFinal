<img width="1050" height="868" alt="image" src="https://github.com/user-attachments/assets/56c3e8f9-7279-4d07-9fcd-ac728c8fb33f" /># bibliotecaProyectoFinal
Proyecto Biblioteca — API REST con Spring Boot y MySQL
<img width="1919" height="992" alt="image" src="https://github.com/user-attachments/assets/eeacb401-a99a-49a4-a72f-9e407a96f30c" />
Casos de peticiones
<img width="1041" height="507" alt="image" src="https://github.com/user-attachments/assets/051ae147-d5b5-4b82-b456-8b1eed41ff1e" />
<img width="1026" height="473" alt="image" src="https://github.com/user-attachments/assets/312b6487-7e56-474c-9547-0862ca03ef93" />
Creacion de libro nuevo en bd
<img width="1843" height="789" alt="image" src="https://github.com/user-attachments/assets/15846818-f423-48fd-944f-be1a33855b2d" />
Aparicion de nuevo libro 
<img width="1050" height="868" alt="image" src="https://github.com/user-attachments/assets/f1190c05-a3f9-41d8-a2f0-1f2d22a7e261" />
verificacion con mysql
<img width="909" height="260" alt="image" src="https://github.com/user-attachments/assets/c917c590-7582-4373-b525-ac007d0b8115" />
verificacion con postman 
<img width="1284" height="864" alt="image" src="https://github.com/user-attachments/assets/48705aa8-1117-41cf-944c-84c1bc2ad4cf" />

Descripción
Este proyecto es la entrega final de la clase de LENGUAJES DE PROGRAMACION PARA APLICACIONES DE NUBE.

---
Estructura del proyecto

src/
├── main/
│ ├── java/co/edu/politecnicointernacional/biblioteca/
│ │ ├── BibliotecaApplication.java
│ │ ├── controller/LibroController.java
│ │ ├── entity/Libro.java
│ │ ├── repository/LibroRepository.java
│ │ └── service/LibroService.java
│ └── resources/
│ ├── static/
│ │ ├── index.html
│ │ ├── styles.css
│ │ └── app.js
│ ├── templates/ (vacío, no se usa Thymeleaf)
│ └── application.properties
├── database/
│ └── biblioteca.sql
├── pom.xml
└── README.md


spring.application.name=biblioteca
server.port=8082

spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=biblioteca_user
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql=true


Endpoints disponibles (API REST)
Método	Endpoint	Descripción
GET	/libros	Retorna todos los libros
GET	/libros/{id}	Busca un libro por su ID
GET	/libros/autor/{nombre}	Retorna todos los libros de un autor
POST	/libros	Crea un nuevo libro

El frontend se encuentra en /src/main/resources/static.
Autor

Jair Neuta
Proyecto académico
Politécnico Internacional — 2025
