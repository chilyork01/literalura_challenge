# LiterAlura: Catálogo de Libros

**LiterAlura** es un proyecto que consume la API de Gutendex para construir un catálogo de libros accesible mediante una interfaz textual en la consola. Este proyecto permite realizar diversas funcionalidades como la búsqueda de libros por título, listar autores y filtrar libros por idioma.

## Funcionalidades

1. **Buscar libro por título**: Busca un libro específico a través de su título.
2. **Listar libros registrados**: Muestra todos los libros que han sido consultados o registrados previamente.
3. **Listar autores registrados**: Despliega una lista de todos los autores disponibles en el sistema.
4. **Listar autores vivos en una época**: Filtra autores que estuvieron activos en una época específica.
5. **Listar libros por idioma**: Filtra libros disponibles por un idioma específico.
6. **Salir**: Finaliza el programa.

## Estructura del Proyecto

El proyecto sigue una arquitectura basada en paquetes:

```
com.alurabook.book
|
├── model
│   ├── Libro.java
│   ├── listarAutoresRegistrados.java (record)
│   ├── listarAutoresVivos.java (record)
│   ├── listarLibro.java (record)
│   └── listarLibrosPorIdioma.java (enum)
|
├── Principal
│   └── Principal.java
|
├── Service
    ├── BookApplication.java
    ├── BookService.java
    ├── ConsumoAPI.java
    ├── ConvierteDatos.java
    └── IconvierteDatos.java
```

### Descripción de Clases Principales

- **`Libro`**: Representa un libro con atributos como título, autor, idioma, y año de publicación.
- **`BookApplication`**: Controla el flujo del programa y gestiona la interacción con el usuario.
- **`BookService`**: Contiene la lógica del negocio para manejar las funcionalidades ofrecidas.
- **`ConsumoAPI`**: Maneja las solicitudes HTTP para consumir la API de Gutendex.
- **`ConvierteDatos`**: Convierte los datos JSON obtenidos desde la API en objetos `Libro`.

## Tecnologías Utilizadas

- **Lenguaje**: Java 17
- **Frameworks**: Spring Boot (estructura de aplicación y organización del código)
- **Manejo de dependencias**: Maven
- **Conexión con API**: Gutendex
- **Base de Datos**: PostgreSQL (gestionada mediante pgAdmin 4)

## Requisitos

- **Java**: 17+
- **Maven**: 3.8+
- **PostgreSQL**: 14+
- **pgAdmin 4**: (para gestionar la base de datos)

## Configuración del Proyecto

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tuusuario/LiterAlura.git
   cd LiterAlura
   ```

2. **Configurar el archivo `application.properties`**:
   Configura la conexión a PostgreSQL en `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Compilar el proyecto**:
   ```bash
   mvn clean install
   ```

4. **Ejecutar la aplicación**:
   ```bash
   mvn spring-boot:run
   ```

## Uso

Al iniciar la aplicación, verás el siguiente menú:

```
1. Buscar libro por título
2. Listar libros registrados
3. Listar autores registrados
4. Listar autores vivos en una época
5. Listar libros por idioma
0. Salir
Seleccione una opción:
```

Sigue las instrucciones para interactuar con las diferentes funcionalidades.

## Contribuir

Si deseas contribuir a este proyecto:
1. Haz un fork del repositorio.
2. Crea una rama para tu función o corrección.
   ```bash
   git checkout -b nombre-de-la-rama
   ```
3. Realiza tus cambios y haz un commit.
   ```bash
   git commit -m "Descripción de tus cambios"
   ```
4. Sube tus cambios al repositorio remoto.
   ```bash
   git push origin nombre-de-la-rama
   ```
5. Crea un pull request.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

**Disfruta explorando el catálogo de libros con LiterAlura!**

