<img src="https://0901.static.prezi.com/preview/v2/bnspo3k7juaoauzunuhknk6rux6jc3sachvcdoaizecfr3dnitcq_3_0.png" width="170" height="100"/>

Alfonso García Jorge 

# *Tarea Sistema de Información*

## Se pide

Diseñar un documento XML válido que permita estructurar la información para permitir su gestión informática de los alumnos de un módulo del ciclo formativo DAW. Aplicarlo al módulo de Lenguajes de Marcas y Sistemas de Gestión de Información sabiendo que tiene asignadas 4 horas semanales y es de carácter obligatorio. El modulo se imparte entre el 15 de septiembre de 2010 y el 30 de junio de 2022. Hay matriculados dos alumnos:

- Ana Fernández Gutiérrez con nif 16965696L teléfono 789654321 email ana.fdezgtrrez@hotmail.com, su dirección es C/ El Percebe, 13 de Santander CP 39302 No hay información sobre las faltas de asistencia o sus notas hasta el momento.
- Pepito Grillo con nif 98765432H teléfono 656566555 email yhyh@yahoo.com, su dirección es Avd. El Pez, 5 de Suances CP 39401. Su nota es "apto" y no tiene faltas de asistencia.

### Resultado: 

```bash
<cicloformativo>
            
            <nombre>"DAW"/>
            <horario>"4 horas/semanales"/>
            <duracion>"15/09/2010 hasta 30/06/2022"

            <matriculados>

            	<alumnonombre>"Ana Fernández Gutiérrez"/>
            	      <identificacion>"16965696L"/>
            	      <telefono>"789654321"/>
            	      <correo>"ana.fdezgtrrez@hotmail.com"/>
            	          <domicilio>
            	          	  <calle>"C/ El Percebe, 13"/>
            	          	  <comunidad>"Santander"/>
            	          	  <cp>"39302"/>
            	          </domicilio>
            	      <faltas>"n/s"/>
            	      <nota>"n/s"/>

            	 <alumnonombre>"Pepito Grillo"/>
            	       <identificacion>"98765432H"/>
            	       <telefono>"656566555"/>
            	       <correo>"yhyh@yahoo.com"/>
            	            <domicilio>
            	            	<calle>"Avd. El Pez, 5"/>
            	            	<comunidad>"Suances"/>
            	            	<cp>"39401"/>
            	            </domicilio>
            	        <faltas>"0"/>
            	        <nota>"apto"/>
            	        
            </matriculados>

</cicloformativo>

```
### Proceso
Abrimos el ciclo formativo y a este le damos un nombre un horario y una duración. Dentro de este ciclo que en este caso es DAW abrimos los matriculados que en este caso son dos alumnos (Ana y Pepito). Dentro de estos dos alumnos ponemos su información mas relevante como el domicilio, DNI, correo, número de teléfono, también añadimos información de las falas que tiene y la nota. Finalmente cerramos los matriculados y el ciclo formativo.


<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
