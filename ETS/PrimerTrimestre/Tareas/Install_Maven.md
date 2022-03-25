<img src="https://0901.static.prezi.com/preview/v2/bnspo3k7juaoauzunuhknk6rux6jc3sachvcdoaizecfr3dnitcq_3_0.png" width="150" height="100"/>   


<div id='P5' />

*Alfonso García Jorge* 


# *Instalación de Maven en el SO*

1. [Actualizar el sistema e Instalar](#P1)
2. [Instalación de una versión concreta](#P2)
3. [Establecer variables de entorno](#P3)
4. [Verificamos Instalación](#P4)

## Introducción

Apache Maven es una herramienta que estandariza la configuración de un proyecto en todo su ciclo de vida, como por ejemplo en todas las fases de compilación y empaquetado y la instalación de mecanismos de distribución de librerías, para que puedan ser utilizadas por otros desarrolladores y equipos de desarrollo. Se utiliza principalmente para proyectos Java. Maven usa un modelo de objetos de proyecto (POM), que es esencialmente un archivo XML que contiene información del proyecto.

<div id='P1' />

### Comenzamos con la instalación.
La instalación la realizaremos en el SO Ubuntu. En el cual también en otro repositorio que tengo he puesto los pasos para instalar el OpenJDk, y unas pequeñas pautas a la hora de la creación de la máquina virtual.
Actualice el índice del paquete e instale Maven ingresando los siguientes comandos:

```bash
sudo apt update
```

```bash
sudo apt install maven
```

<img src= "Captura Maven/Captura 1.png">

<img src= "Captura Maven/Captura 2 .png">

Verificamos la instalación: 

```bash
mvn -version
```

Deberiamos ver esto:

<img src= "Captura Maven/Captura 3 .png">

Ya tenemos Maven instalado y ya podemos comenzar a usarlo.


<div id='P2' />

### 2.Instalar una versión concreta

Visitamos la página de descarga de Maven para ver si hay una versión más nueva disponible. Descargamos ahora Apache Maven en el directorio /tmp:

```bash
wget https://www.apache.org/dist/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.tar.gz -P /tmp
```

<img src= "Captura Maven/Captura 4 .png">

Cuando se complete la descarga extraiga el archivo en el directorio /otp. Y luego para tener más control sobre las versiones y actualizaciones de Maven, que a crear un maven enlace simbólico que apunte al directorio de instalación de Maven:

Primero:

```bash
sudo tar xf /tmp/apache-maven-*.tar.gz -C /opt
```

Segundo:

```bash
sudo ln -s /opt/apache-maven-3.8.2 /opt/maven
```

<img src= "Captura Maven/Captura 6.png">


<div id='P3' />

### 3.Establecer variables de entorno

Establecer variables de entorno A continuación, necesitaremos establecer las variables de entorno. Para hacer esto, abra su editor de texto y cree un nuevo archivo llamado mavenenv.sh en el directorio /etc/profile.d/

```bash
sudo nano /etc/profile.d/maven.sh
```

Y pegamos el siguiente cógido:

![Captura de pantalla 2021-09-24 124323](https://user-images.githubusercontent.com/91060831/134668976-b9636483-cd72-4d62-9694-e83faa055c3f.png)

<img src= "Captura Maven/Captura 7.png">

Guarde y cierre el archivo. Este script se utilizará al iniciar el shell. Haga que el script sea ejecutable con chmod. Y finalmente, cargue las variables de entorno usando el comando de source.

Primero:

```bash
sudo chmod +x /etc/profile.d/maven.sh
```

Segundo:

```bash
source /etc/profile.d/maven.sh
```

<img src= "Captura Maven/Captura 8.png">


<div id='P4' />

### 4. Verificamos instalación.

Para verificar que Maven está instalado, use el mvn -version que imprimirá la versión de Maven. Debería ver algo similar a lo siguiente:

<img src= "Captura Maven/version final.png">

Finalmente si seguimos todos los pasos deberíamos tener nuestro Apache Maven con la versión concreta que vayamos a trabajar.

<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
