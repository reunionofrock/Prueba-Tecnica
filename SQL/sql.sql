
CREATE DATABASE PRUEBA_TECNICA_CLARO;
USE PRUEBA_TECNICA_CLARO;

CREATE TABLE USERS(
id INT IDENTITY PRIMARY KEY,
nombre VARCHAR(100)NOT NULL,
usuario VARCHAR(20) NOT NULL,
email VARCHAR(100) NOT NULL,
contrasena VARCHAR(100) NOT NULL,
sesion BIT NOT NULL
);



update users set sesion = 0 