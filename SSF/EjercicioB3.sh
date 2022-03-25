#!/bin/bash
#
#
# NOMBRE: EjercercioB3.sh
# OBJETIVO:
# AUTOR: alfonsoGarcía
# FECHA: 22-03-2022
#
#
######################################

argumento=$1
info=()
trap "echo No puedes matarme" SIGKILL

if [ -z "$argumento" ]
then
	argumento="CPU"
elif [ "$#" -ne "1" ]
then
	argumento="CPU"
elif [ "$argumento" != "CPU" -a "$argumento" != "MEN" -a "$argumento" != "TIME"  ]
then
	argumento="CPU"
fi

if [ "$argumento" == "CPU" ]
then
	columna=3
elif [ "$argumento" == "MEN" ]
then
	columna=4
elif [ "$argumento" == "TIME" ]
then
	columna=10
fi

for (( c=1; c<=10; c++ ))
do
	info=(`ps aux | tr -s " " | tail -n +2 | sort -hrk  $columna | head -n 1`)
done

opcion=1

while [ $opcion -ne 9 ]
do

	echo "1) Parar el proceso                                    	"
	echo "2) Finalizar el proceso                                  	"
	echo "3) Matar el proceso                               	  	 "
	echo "4) Parar el proceso y pasarlo a segundo plano 		"
	echo "5) Reanudar el proceso en segundo plano 				"
	echo "6) Pasar el proceso a segundo plano                              "
	echo "7) Asignarle la menor prioridad posible"
	echo "8) Evitar que el proceso muera si se cierra la terminal donde se ejecuta"
	echo "9) Salir"
 

read -p "Opción: " opcion

	case $opcion in

		1)
			echo -e "$(kill -STOP ${info[1]})"
		;;
		2)
			echo -e "$(kill -15 ${info[1]})"
		;;
		3)
			echo -e "$(kill -9 ${info[1]})"
		;;
		4)
			echo -e "$(kill -STOP ${info[1]} | bg ${info[1]})"
		;;
		5)
			echo -e "$(bg ${info[1]})"
		;;
		6)
			echo -e "$()"
		;;
		7)
			echo -e "$(renice -n 19 ${info[11]})"
		;;
		8)
			echo -e "$(disown ${info[1]})"
		;;
		9)

		;;
	esac
done

echo "${info[1]}"




