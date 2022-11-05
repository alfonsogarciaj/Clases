listaAlumnos = []
alumnos = int(input("¿Cuantos alumnos son? "))
for i in range(alumnos):
    nombre = str(input("Dame un nombre: "))
    nota = int(input("Dame una nota: "))
    listaAlumnos.append([nombre,nota])
opcion = int(input("Desea borrar un alumno? (1-Si / 0-No) "))
if opcion == 1:
    nombre = str(input("Nombre del alumno que desea borrar: "))
    nota = int(input("Nota que tenia el alumno: "))
    listaAlumnos.remove([nombre,nota])
    print(listaAlumnos)
print("La lista es: ", listaAlumnos)

