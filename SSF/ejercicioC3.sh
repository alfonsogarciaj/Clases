#!/bin/bash

nommbreServ=$1

if [ $# -eq "0" ]
then
	echo "Introduce un argumento"
	read nombreServ
fi

existe=(`systemctl list-unit-files --type service | grep $nomServ`)
echo "$existe"

if [ -n "$existe" ]
then

	echo -e "$(systemctl list-unit-files --type service $nomServ | grep $nomServ | cut -d " " -f 2 )"

else
	echo "Error, no existe el servicio"
fi


