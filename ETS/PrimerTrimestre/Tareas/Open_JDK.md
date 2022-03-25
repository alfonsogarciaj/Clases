
<img src="https://user-images.githubusercontent.com/91060831/136633965-7280c0c8-a144-4d55-838e-1ace7794c691.png" width="190" height="80"/>

*Alfonso García Jorge* 

<div id='P5' />


# *Instalación de Open JDK en el SO*

1. [Actualizar el sistema](#P1)
2. [Instalar Java](#P2)
3. [Instalar una versión específica](#P3)
4. [Configuración de las variables de entorno](#P4)
5. [Versión Java 8 instalada](#P5)



## Introducción

Vamos a ver paso a paso la instalación de OpenJDK en nuestra máquina virtual con el SO Ubuntu 20.4. LTS.   

Comenzamos instalando la herramienta VirtualBox y en esta creamos nuestra máquina virtual.  Los pasos para seguir son: descargar el VirtualBox desde la Web y este ejecutarlo para proceder a la instalación; creamos en VirtualBox una nueva máquina con la versión Linux Ubuntu 64 bits (requerimientos mínimos: 2GHz de procesador, 2 GB RAM, 10 GB de espacio de disco); ya tenemos la máquina virtual creada ahora tenemos que descargar nuestro SO desde su página web (Ubuntu); al tenerlo descargado abrimos la máquina virtual y nos pide que elijamos un disco de arranque (la versión Ubuntu que descargamos); finalmente inicia la instalación del SO en nuestra máquina virtual. 
Ya dentro de nuestra máquina virtual abrimos el terminal y comenzamos la instalación:

<div id='P1' />

### 1.Lo primero que realizaremos es actualizar el sistema.

```bash
sudo apt-get update
```

<img src= "Captura Java/Captura 1.png">
 
<div id='P2' />

### 2.Ahora debemos instalar Java.

```bash
sudo apt-get install default-jdk
```

<img src= "Captura Java/Captura 2.png">

<img src= "Captura Java/Captura 2-2.png">

### Ahora mismo tenemos que tener Java instalado en nuestra máquina virtual, comprobamos qué versión tenemos.

```bash
java --version
```

<img src= "Captura Java/Captura 3.png">

<div id='P3' />

### 3.¿Cómo instalar una versión específica?

 Queremos una versión específica que es la versión 8 con la cual trabajaremos en 1º de DAM.

```bash
sudo apt install openjdk-8-jdk
```


<img src= "Captura Java/Captura 4.png">

<img src= "Captura Java/Captura 4-2.png">

### Verficación

Comprobamos si la versión 8 con la cual trabajaremos se instaló correctamente  y si es la que ejecutará.

```bash
java --version
```

<img src= "Captura Java/Captura 5.png">

Vemos que la versión que ejecutará es la versión 11. Y no es con la que queremos trabajar, por ello vamos a comprobar que versiones hay instaladas en nuestro S0.

```bash
ls /usr/lib/jvm
```

<img src= "Captura Java/Captura versiones instaladas.png">

<div id='P4' />

### 4.Configuración de las variables de entorno

Nuestro SO necesita saber dónde está ubicado el programa para ejecutarlo con la versión predeterminada. Para modificar esto, usaremos el editor de texto nano.

```bash
nano /etc/profile
```

Realiza los siguientes cambios y selecciona la versión 8.

![Captura de pantalla nano](https://user-images.githubusercontent.com/91060831/134426105-b1fc0b60-83cb-4e69-a679-2e5d72127ef3.png)

<img src= "Captura Java/Captura 8 WHAT_.png">

### Alternativa

En mi caso no sabría si se trata de un error, desconozco trabajar en esta situación, pero no me guarda el fichero "nano /etc/profile". Por ello busco otra alternativa para poder arrancar la versión de Java que queremos. “sudo update-alternatives –-config java”. Con este comando nos saldrá las versiones que tenemos instaladas y elegimos exactamente con la  que queremos trabajar. En este caso es la opción 2.

<img src= "Captura Java/Captura 9 alternativa arranque.png">


<div id='P5' />


### 5.Version Java 8 instalada.

Finalmente comprobamos de nuevo si la versión predeterminada, la versión 8. "java --version"

<img src= "Captura Java/Captura 11 Java 8 fin.png">

<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
