<img src="https://0901.static.prezi.com/preview/v2/bnspo3k7juaoauzunuhknk6rux6jc3sachvcdoaizecfr3dnitcq_3_0.png" width="170" height="100"/>

*Alfonso García Jorge*

# Tareas

## Tarea: Configuración

Configurar Git definiendo el nombre del usuario, el correo electrónico y activar el coloreado de la salida. Mostrar la configuración final.

```bash
git config --global user.name "Your-Full-Name"
git config --global user.email "your-email-address"
git config --global color.ui auto
git config --list
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c3d38958a21cdeeb4619434a2b8a591d4533651d/ETS/Tareas/Im%C3%A1genes/git%20comando%20basicos/1.png"/>

## Tarea: Creación de un repositorio

Crear un repositorio nuevo con el nombre dpl y mostrar su contenido.

```bash
mkdir dpl
cd dpl
git init
ls -la
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c3d38958a21cdeeb4619434a2b8a591d4533651d/ETS/Tareas/Im%C3%A1genes/git%20comando%20basicos/2.png"/>

## Tarea: Comprobar el estado del repositorio

- Comprobar el estado del repositorio.

- Crear un fichero indice.txt con el siguiente contenido:
        Capítulo 1: Instalación de Git por el alumno XXX (donde XXX es el nombre del alumno)
        Capítulo 2: Flujo de trabajo básico

- Comprobar de nuevo el estado del repositorio.

- Añadir el fichero a la zona de intercambio temporal.

- Volver a comprobar una vez más el estado del repositorio.

```bash
git status
cat > indice.txt
Capítulo 1: Instalación de Git por el alumno XXX
Capítulo 2: Flujo de trabajo básico
Ctrl+D
git status
git add indice.txt
git status
```
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c3d38958a21cdeeb4619434a2b8a591d4533651d/ETS/Tareas/Im%C3%A1genes/git%20comando%20basicos/3.png"/>

## Tarea: Realizando Commit´s

Realizar un commit de los últimos cambios con el mensaje Añadido índice de la asignatura DPL. y ver el estado del repositorio.

```bash
git commit -m "Añadido índice de la asignatura DPL."
git status
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/c3d38958a21cdeeb4619434a2b8a591d4533651d/ETS/Tareas/Im%C3%A1genes/git%20comando%20basicos/4.png"/>

## Tarea: Modificación de ficheros

    Cambiar el fichero indice.txt para que contenga lo siguiente:
    
        Capítulo 1: Instalación de Git por el alumno XXX (donde XXX es el nombre del alumno)
        Capítulo 2: Flujo de trabajo básico
        Capítulo 3: Gestión de ramas
        Capítulo 4: Repositorios remotos
    Mostrar los cambios con respecto a la última versión guardada en el repositorio.
    Hacer un commit de los cambios con el mensaje Añadido los capitulos 3 y 4.

```bash
cat > indice.txt
Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
Capítulo 2: Flujo de trabajo básico
Capítulo 3: Gestión de ramas
Capítulo 4: Repositorios remotos
Ctrl+D
git diff
git add indice.txt
git commit -m "Añadido los capitulos 3"
```
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c3d38958a21cdeeb4619434a2b8a591d4533651d/ETS/Tareas/Im%C3%A1genes/git%20comando%20basicos/5.png"/>

## Tarea: Historial

    Mostrar los cambios de la última versión del repositorio con respecto a la anterior.
    Cambiar el mensaje del último commit por Añadido el capitulo sobre gestión de ramas al índice.
    Volver a mostrar los últimos cambios del repositorio.

```bash
git show
git commit --amend -m "Añadido el capitulo sobre gestión de ramas al índice."
git show
```
<img src="https://github.com/alfonsogj14/ETS_LND/blob/c3d38958a21cdeeb4619434a2b8a591d4533651d/ETS/Tareas/Im%C3%A1genes/git%20comando%20basicos/6.png"/>

![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
