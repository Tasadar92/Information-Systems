# Information-Systems

En este repositorio se pueden encontrar proyectos de Spring Boot organizados desde Prueba hasta PruebaN mediante los cuales se realiza una introduccion a la tecnologia Spring Boot, Maven, JDBC, Spring Data, Spring Rest y creacion de clientes JavaScript en Spring Rest. A continuacion se realizara un desglose de cada proyecto:

#Prueba:
    - Las credenciales de la conexion se agregan en el archivo application-properties creado en src/main/resources
    - Se tiene una entidad usuario que se compone de diversos atributos: Nombre, Apellidos, Email, Fecha Nacimiento, Pais y Ciudad.
    - Se tiene una entidad juego que se compone un id (Primary Key), nombre, version, año, estudio, nacionalidad, edad recomendada y descripcion.
    - Se tiene una interface UsuarioRepository en la que añadiremos los metodos necesarios para realizar consultas por pais y apellido
    - Se tiene una interface JuegoRepository en la que añadiremos los metodos necesarios para realizar consultas con los datos del juego
    - Se tiene un DataLoader que se encargara de realizar las operaciones definidas en los Repository.
    
#Prueba1:
