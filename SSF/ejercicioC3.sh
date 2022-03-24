#!/bin/bash

nomServ=$1

if [ $# -eq "0" ]
then
	echo "Introduce el parametro"
	read nomServ
fi

existe=(`systemctl list-unit-files --type service | grep $nomServ`)
echo "$existe"

if [ -n "$existe" ]
then

	echo -e "$(systemctl list-unit-files --type service $nomServ | grep $nomServ | cut -d " " -f 2 )"

else
	echo "Se ha producido el error, el servicio no existe"
fi


