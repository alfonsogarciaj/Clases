clase = {}
notasAlumno = []
for i in range(3):
    clave = input("Introduce el nombre del alumno: ")
    contador = int(input("¿Cuantas notas son? "))
    while contador > 0:
        valor = int(input("Introduce la nota: "))
        if valor >= 0 and valor <= 10:
            notasAlumno.append(valor)
            contador -= 1
            clase[clave] = notasAlumno
        else:
            print("Tiene que ser entre 0 y 10")
print(clase)