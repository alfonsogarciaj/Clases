listaAlumnos = []
alumnoEliminado =[]

alumnos = int(input("¿Cuantos alumnos son? "))
for i in range(0,alumnos):
    nombre = input("Dame un nombre: ")
    nota = int(input("Dame una nota: "))
    listaAlumnos.append([nombre,nota])

for i in listaAlumnos:
    nombreBorrado = input("dame un nombre")
    if nombreBorrado == listaAlumnos[[i]]:
        alumnoEliminado.append()
listaAlumnos.remove(alumnoEliminado)
print(f"La lista es: {listaAlumnos}")
