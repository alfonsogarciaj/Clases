#!/bin/bash

-Syyu() {

pacman -Syyu;

if [ $? -ne 0 ]; then
    echo "Manjaro no pudo actualizarse"
else
    pacman -Syyu;
    echo "Manjaro se actualizo correctamente"
fi
}

pacman -Syyu



