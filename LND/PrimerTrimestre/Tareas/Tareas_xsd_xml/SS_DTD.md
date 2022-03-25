<img src="https://0901.static.prezi.com/preview/v2/bnspo3k7juaoauzunuhknk6rux6jc3sachvcdoaizecfr3dnitcq_3_0.png" width="170" height="100"/>

Alfonso García Jorge 

# *Tarea Sistema de Información de la Seguridad Social*

<img src="https://user-images.githubusercontent.com/91060831/136838902-a0c0e2d8-7de7-4e52-b183-e0bd83a811d0.png" width="220" height="170"/>

## Se pide

La Seguridad Social necesita un formato de intercambio unificado para distribuir la información personal de los afiliados.
Todo archivo XML contiene un listado de uno o mas afiliados Todo afiliado tiene los siguientes elementos:
- DNI o NIE
- Nombre
- Apellidos
- Situación laboral: que tiene que ser una y solo una de entre estas posibilidades: «en_paro», en_activo, jubilado, edad_no_laboral
- Fecha de nacimiento: que se desglosa en los elementos obligatorios día, mes y anio.
- Listado de bajas: que indica las situaciones de baja laboral del empleado. Dicho listado consta de una repetición de 0 o más bajas:
        Una baja consta de tres elementos: causa (obligatoria), fecha de inicio (obligatorio) y fecha de final (optativa).
- Listado de prestaciones cobradas: consta de 0 o más elementos prestación, donde se indicará la cantidad percibida (obligatorio), la fecha de inicio (obligatorio) y la fecha de final (obligatorio).

## Resultado

```bash
<?xml version="1.0" encoding="iso-8859-15" standalone="yes"?>
<!DOCTYPE listado [	
<!ELEMENT lisado(afiliados)>
<!ELEMENT afiliados (DNI_NIE , nombre, apellido, situacionlaboral, listadobajas*, fechanacimiento,listadoprestaciones)>
<!ELEMENT DNI_NIE (#PCDATA)>
<!ELEMENT nombre (#PCDATA)>
<!ELEMENT apellido (#PCDATA)>
<!ELEMENT situacionlaboral (paro|activo|jubilidado|edad_no_laboral)>
<!ELEMENT fechanacimiento (dia, mes, anio)>
<!ELEMENT dia (#PCDATA)>
<!ELEMENT mes (#PCDATA)>
<!ELEMENT anio (#PCDATA)>
<!ELEMENT listadobajas (#PCDATA)>
<!ELEMENT causa (#PCDATA)>
<!ELEMENT inciobaja (#PCDATA)>
<!ELEMENT finbaja (#PCDATA)>
<!ELEMENT listadoprestaciones (#PCDATA)>
<!ELEMENT cantidadpercibida (#PCDATA)>
<!ELEMENT fechainicio (#PCDATA)>
<!ELEMENT fechafinal (#PCDATA)>
]>

<listado>
<afiliados>
	<DNI_NIE>5666666A</DNI_NIE>
	<nombre>Pedro</nombre>
	<apellido>Lorenzo</apellido>
	<situacionlaboral>activo</situacionlaboral>
	<fechanacimiento>23/05/1989</fechanacimiento>
	<listadobajas>
		<causa>operacion apendice</causa>
		<inciobaja>04/05/2000</inciobaja>
		<finbaja>06/11/2000</finbaja>
	</listadobajas>
	<listadoprestaciones>
		<cantidadpercibida>300</cantidadpercibida>
		<fechainicio>02/02/1998</fechainicio>
		<fechafinal>15/11/1999</fechafinal>
	</listadoprestaciones>
</afiliados>
</listado>
```
### Validación

A continuación validaciones en diferentes páginas:

<img src="https://github.com/alfonsogj14/ETS_LND/blob/9dc2d1020a415b92a58e7d27eec10754a1bd0069/LND/Tareas/Im%C3%A1genes/captura%20validacion.png"  width="700" height="450"/>

<img src="https://github.com/alfonsogj14/ETS_LND/blob/9dc2d1020a415b92a58e7d27eec10754a1bd0069/LND/Tareas/Im%C3%A1genes/ss%20no%20error.png" width="700" height="450"/>

<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
