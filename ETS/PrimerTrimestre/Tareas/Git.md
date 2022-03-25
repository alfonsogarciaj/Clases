<img src="https://0901.static.prezi.com/preview/v2/bnspo3k7juaoauzunuhknk6rux6jc3sachvcdoaizecfr3dnitcq_3_0.png" width="150" height="100"/>   

*Alfonso García Jorge* 

<div align="justify">

# Git en Linux
 
<img src="https://user-images.githubusercontent.com/91060831/138977266-d0c8333e-a7da-4146-ac41-a78a39f7a4ae.png" width="250" height="100"/> 
 

 Git es un sistema de control de versiones distribuido de código abierto desarrollado por Linus Torvalds, el creador de Linux. 
 El control de versiones distribuido permite a los desarrolladores descargar un software, realizar cambios y subir la versión que han modificado.
 Principal requisito tener un servidor Ubuntu 20.04.

## Pasos 
  
### Ver si tenemos Git
  
  Seguramente que Git ya esté instalado en el servidor Ubuntu 20.04. Puede confirmar que ese es el caso de su servidor con el siguiente comando:
```bash
git --version
```

Nos debe aparecer:

```bash
git version 2.25.1
```

Si es asi puede pasar a la configuración de Git, o bien si necesita una versión más actualizada, en la siguiente parte diremos 
sobre cómo instalar desde la fuente.
  
<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/1.png"/>

### Instalar y actualizar desde la fuente

Si busca un método más flexible para instalar Git, puede optar por compilar el software desde la fuente, lo cual explicaremos en esta sección. 
Esto toma más tiempo y no se mantendrá en su administrador de paquetes, pero le permitirá descargar la versión más reciente y le brindará mayor 
control sobre las opciones que incluya si quiere personalizarlo.
Obtendremos como antes con:
```bash
git --version
```
La versión de Git: Git version 2.25.1

Debemos actualizar nuestro índice local de paquetes y luego instalar los paquetes que necesitamos.

  ```bash
  sudo apt update
  ```
  <img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/2.png"/>
  
  ```bash
sudo apt install libz-dev libssl-dev libcurl4-gnutls-dev libexpat1-dev gettext cmake gcc
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/3.png"/>

Debemos ahora crear un directorio temporal e ir a éll. Aquí es donde descargaremos nuestro tarball de Git.
  
  ```bash
  mkdir tmp
  ```
    
  ```bash
cd /tmp
```

A continuación Utilizaremos curl para descargar la versión mas reciente:
Pero en mi caso no tenía curl y tuve que instalarlo:
  <img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/4.png"/>
<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/5.png"/>

Ya instalado curl nos iremos a descargar la versión mas reciente:

```bash
curl -o git.tar.gz https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.29.3.tar.gz
```
<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/6.png"/>

Descomprimimos el archivo tarball:

```bash
tar -zxf git.tar.gz
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/7.png"/>

Vamos al nuevo directorio de Git:

```bash
cd git-*
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/8.png"/>

Ahora crear el paquete e instalarlo escribiendo estos dos comandos:

```bash
make prefix=/usr/local all
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/9.png"/>

```bash
sudo make prefix=/usr/local install
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/10.png"/>


Sustituya el proceso de shell para que se utilice la versión de Git que acabamos de instalar:

```bash
 exec bash
```

Y luego debe estar seguro de que su instalación se realizó correctamente comprobando la versión:

```bash
git ---version
```
<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/11.png"/>

### Configuración

Esta configuración es posible si aplicamos el comando git config. Específicamente, debemos proporcionar nuestro nombre y nuestra dirección de correo 
electrónico debido a que Git inserta esta información en cada confirmación que hacemos. Podemos añadir esta información escribiendo lo siguiente:

```bash 
git config --global user.name "Your Name"
git config --global user.email "youremail@domain.com"

```

Lo confirmamos : 

```bash
git config --list
```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/12.png"/>

Tiene la opción de editarlo manualmente con el editor de texto que prefiera (en este tutorial utilizaremos nano) como se muestra a continuación:

```bash
nano ~/.gitconfig

```

<img src="https://github.com/alfonsogj14/ETS_LND/blob/58c226b8ad6227bb4010f4187f7f6a4c9d268d72/ETS/Tareas/Im%C3%A1genes/Git/13.png"/>

Para salir del editor de texto pulse CTRL y X, luego Y y, a continuación, ENTER.
  
### Último paso
  Aprender, no vas a poder aprender todos los comandos pero si debe practicar y tener claro que hace cada uno.

  Hay miles de páginas con listas o comandos y para que sirven
  
  https://gist.github.com/notdol/8298927
  



<di align="justify"/>
<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
