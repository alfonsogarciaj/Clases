#!/bin/sh
cd Clases
git config --global user.name alfonsogj
git fetch
git add .
git commit -m "añado contenido no relevante pero que deseo guardar o alguna tarea"
git push --all
echo "La carpeta Clases ha hecho push correctamente"

cd ..

cd ETS
git fetch
git add .
git commit -m "añado contenido no relevante pero que deseo guardar o alguna tarea"
git push --all
echo "La carpeta ETS ha hecho push correctamente"

cd ..

cd alfonso_PRO
git fetch
git add .
git commit -m "añado contenido no relevante pero que deseo guardar o alguna tarea"
git push --all
echo "La carpeta alfonso_PRO ha hecho push correctamente"

cd ..

cd ProyectoETS
git fetch
git add .
git commit -m "añado contenido no relevante pero que deseo guardar o alguna tarea"
git push --all
echo "La carpeta ProyectoETS ha hecho push correctamente"

cd ..

cd LND
git fetch
git add .
git commit -m "añado contenido no relevante pero que deseo guardar o alguna tarea"
git push --all
echo "La carpeta LND ha hecho push correctamente"

echo "Está todo OK" "Lets's Go"
