<img src="https://user-images.githubusercontent.com/91060831/136633965-7280c0c8-a144-4d55-838e-1ace7794c691.png" width="190" height="80"/>

*Alfonso García Jorge* 


# Ejercicios Git avanzados

Para hacer estos ejercicios es necesario haber hecho antes los ejercicios sobre historial de cambios o bien hacer un clon del repositorio remoto https://github.com/jpexposito/libro mediante la siguiente secuencia de comandos:

```bash
git clone https://github.com/jpexposito/libro.git
cd libro
```

## Ejercicio 1

    Mostrar el historial de cambios del repositorio.
    Crear la carpeta capítulos y crear dentro de ella el fichero capitulo1.txt con el siguiente texto.

    Git es un sistema de control de versiones ideado por Linus Torvalds.

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit de los cambios con el mensaje Añadido capítulo 1.
    Volver a mostrar el historial de cambios del repositorio.
    
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/1.png"/>

    
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/1-2.png"/>


<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/1-3.png"/>

## Ejercicio 2

    Crear el fichero capitulo2.txt en la carpeta capítulos con el siguiente texto.

    El flujo de trabajo básico con Git consiste en: 1- Hacer cambios en el repositorio. 
    2- Añadir los cambios a la zona de intercambio temporal. 3- Hacer un commit de los cambios.

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit de los cambios con el mensaje Añadido capítulo 2.
    Mostrar las diferencias entre la última versión y dos versiones anteriores.
 
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/2.png"/>


## Ejercicio 3

    Crear el fichero capitulo3.txt en la carpeta capítulos con el siguiente texto.
Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit de los cambios con el mensaje Añadido capítulo 3.
    Mostrar las diferencias entre la primera y la última versión del repositorio.
    
 <img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/3.png"/>
 
 <img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/3-1.png"/>

## Ejercicio 4

    Crea el fichero índice.txt la siguiente línea:

    Indice de los cápitulos, con conceptos avanzados de git

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit de los cambios con el mensaje "Indice de los cápitulos, con conceptos avanzados de git.
    Mostrar quién ha hecho cambios sobre el fichero indice.txt.

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/4.png"/>


## Ejercicio 5

Crear una nueva rama bibliografía y mostrar las ramas del repositorio.

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/5.png"/>

## Ejercicio 6

    Crear el fichero capitulos/capitulo4.txt y añadir el texto siguiente:

    En este capítulo veremos cómo usar GitHub para alojar repositorios en remoto.

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit con el mensaje “Añadido capítulo 4.”
    Mostrar la historia del repositorio incluyendo todas las ramas.
    
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/6.png"/>

## Ejercicio 7

    Cambiar a la rama bibliografía.
    Crear el fichero bibliografia.txt y añadir la siguiente referencia:

Chacon, S. and Straub, B. Pro Git. Apress.

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit con el mensaje “Añadida primera referencia bibliográfica.”
    Mostrar la historia del repositorio incluyendo todas las ramas.
    
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/7.png"/>

## Ejercicio 8

    Fusionar la rama bibliografía con la rama main.
    Mostrar la historia del repositorio incluyendo todas las ramas.
    Eliminar la rama bibliografía.
    Mostrar de nuevo la historia del repositorio incluyendo todas las ramas.
 
 <img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/8.png"/>
 
 <img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/8-2.png"/>
 
 
 <img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/8-3.png"/>
 

## Ejercicio 9

    Crear la rama bibliografía.
    Cambiar a la rama bibliografía.
    Cambiar el fichero bibliografia.txt para que contenga las siguientes referencias:

Scott Chacon and Ben Straub. Pro Git. Apress.
Ryan Hodson. Ry’s Git Tutorial. Smashwords (2014)

    Cambiar a la rama main.
    Cambiar el fichero bibliografia.txt para que - contenga las siguientes referencias:

Chacon, S. and Straub, B. Pro Git. Apress.
Loeliger, J. and McCullough, M. Version control with Git. O’Reilly.

    Añadir los cambios a la zona de intercambio temporal y hacer un commit con el mensaje 
    “Añadida nueva referencia bibliográfica.”
    Fusionar la rama bibliografía con la rama main.
    Resolver el conflicto dejando el fichero bibliografia.txt con las referencias:

Chacon, S. and Straub, B. Pro Git. Apress.
Loeliger, J. and McCullough, M. Version control with Git. O’Reilly.

Hodson, R. Ry’s Git Tutorial. Smashwords (2014)

    Añadir los cambios a la zona de intercambio temporal y hacer un commit con el mensaje 
    “Resuelto conflicto de bibliografía.”
    Mostrar la historia del repositorio incluyendo todas las ramas.
    
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/9-1.png"/>

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/9-2.png"/>

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/9-3.png"/>


### Final

Demostración de las carpetas y .txt creado en esta práctica.

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/fin.png"/>

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c914decd69bac5848fec617a8dcab696cd8ef3be/ETS/Tareas/Im%C3%A1genes/gitComandos2/fin2.png"/>
    
    
<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
