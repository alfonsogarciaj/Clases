cadena = ["hola", "nose", "hola", "que"]
palabraEliminada = input("Palabra que desea eliminar: ")
for i in range(len(cadena)-1,-1,-1):
    if cadena[i] == palabraEliminada:
        cadena.remove(palabraEliminada)
print(cadena)


