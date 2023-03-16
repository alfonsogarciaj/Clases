
# Se ingresa por teclado un número entero positivo, mostrar
# un mensaje con el número de dígitos de los que está compuesto.

entrada = int(input("Introduce un número entero positivo "))

cadena = str(entrada)

print(f"El número de dígitos de {entrada} es {len(cadena)} ")



# Realizar un programa que solicite la carga por teclado de dos valores enteros.
# Si el primero es mayor al segundo, informar de la suma y la resta de ambos valores, .
# si por el contrario es inferior, calcular el producto y la división de estos números


num1 = int(input("Introduce el primer número "))
num2 = int(input("Introduce el segundo número "))

if num1 > num2:
    print(f"La suma es {num1 + num2} y la resta es {num1 - num2}")
else:
    print(f"La multiplicación es {num1 * num2} y la división es {num1 / num2}")



# Realizar un programa que pida cargar tres números enteros.
# Mostrar por pantalla el mayor de ellos.

num1 = int(input("Introduce el primer número "))
num2 = int(input("Introduce el segundo número "))
num3 = int(input("Introduce el tercer número "))

if num1 > num2:
    if num1 > num3:
        mayor = num1
    else:
        mayor = num3
else:
    if num2 > num3:
        mayor = num2
    else:
        mayor = num3

print(f"El número mayor de los tres es {mayor}")

if num1 > num2 and num1 > num3:
    mayor = num1
elif num2 > num1 and num2 > num3:
    mayor = num2
else:
    mayor = num3

print(f"El número mayor de los tres es {mayor}")



# Realizar un programa que pida cargar un número entero por teclado.
# Mostrar un mensaje si el número es positivo, negativo o nulo (es decir, 0)

num = int(input("Introduce un número entero "))

if num > 0:
    print(f"El número {num} es positivo")
elif num < 0:
    print(f"El número {num} es negativo")
else:
    print(f"El número {num} es nulo")



# Realizar un programa que permita cargar un número entero de 1, 2 o 3 dígitos.
# Mostrar un mensaje con el número de dígitos de que está compuesto o
# un mensaje de error si tiene más de 3 dígitos.


num = int(input("Introduce un número entero "))

cadena = str(num)

if len(cadena) < 4:
    print(f"El número {num} de dígitos es {len(cadena)}")
else:
    print(f"Error el número {num} tiene más de 3 dígitos")



# Un alumno realiza un examen. Se requiere la creación de un programa que solicite
# cargar la nota de 5 preguntas.
# Calcular el promedio y mostrar un mensaje en función de las respuestas correctas.
# Sobresaliente -> promedio mayor o igual al 90%
# Notable -> promedio mayor o igual al 70% y menor del 90%
# Aprobado -> promedio mayor o igual al 50% y menor del 70%
# Suspendido -> promedio menor del 50%

notas = []

nota1 = float(input("Escribe la nota 1 "))
notas.append(nota1)
nota2 = float(input("Escribe la nota 2 "))
notas.append(nota2)
nota3 = float(input("Escribe la nota 3 "))
notas.append(nota3)
nota4 = float(input("Escribe la nota 4 "))
notas.append(nota4)
nota5 = float(input("Escribe la nota 5 "))
notas.append(nota5)

media = sum(notas) / len(notas)

if media < 5:
    print("Suspendido")
elif 5 <= media < 7:
    print("Aprobado")
elif 7 <= media < 9:
    print("Notable")
elif 9 <= media <= 10:
    print("Sobresaliente")
else:
    print("Existe algunas notas que están mal introducidas")

print(f"La media es {media}")
