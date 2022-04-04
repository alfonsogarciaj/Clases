#!/bin/bash
#
#
# NOMBRE: EjercercioC3.sh
# OBJETIVO:
# AUTOR: alfonsoGarcía
# FECHA: 22-03-2022
#
#
######################################

nombrepaqt=$1

if [[ -z $nombrepaqt ]];
then
        echo "No existe" 
        exit 1
fi

if [ $? -ne 0 ]; then 
	echo "No dispones del paquete"
	echo "¿Desea instalarlo: y or n?"
	read SioNO
	if [ $SioNO -eq "y" ]; then
		echo "se procede a la instalacion"
		apt-get update
		apt-get install $nombrepaqt
	fi
else
	echo "Ya dispones del paquete"
	echo -e "La version de paquete es ${$nombrepaqt --version}" $(kill -STOP ${info[1]})
	echo "1)Actualizar el paquete"
	echo "2)Reinstalar el paquete"
	echo "3)Eliminar el paquete y configuracion"
	echo "4)salir" 
	read -p "Introduzca un numero: " switch
	case $switch in
		1)
			apt upgrade $nombrepaqt
			;;
		2)
			apt-get remove $nombrepaqt
			apt-get update 
			apt install $nombrepaqt
			;;
		3)
			apt-get purge $nombrepaqt
			;;
		4)
			exit 1
			;;
		*)
			echo "Seleccione una opcion"
			;;
	esac
fi
