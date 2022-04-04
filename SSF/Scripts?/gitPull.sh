#!/bin/sh
cd Clases
git fetch
git pull --all
echo "La carpeta Clases está actualizada"
cd ..

cd ETS
git fetch
git pull --all
echo "La carpeta ETS está actualizada"

cd ..

cd alfonso_PRO
git fetch
git pull --all
echo "La carpeta alfonso_PRO está actualizada"

cd ..

cd ProyectoETS
git fetch
git pull --all
echo "La carpeta ProyectoETS está actualizada"

cd ..

cd LND
git fetch
git pull --all
echo "La carpeta LND está actualizada"

echo "Está todo OK" "Lets's Go"
