def mostrarPrimerasPosciones(lista):
    print(lista[0:4])
def mostrarUltimasPosiciones(lista):
    print(lista[3:])
def mostrarPosicionesPares(lista):
    print(lista[1::2])
def mostrarPosicionesImpares(lista):
    print(lista[::2])

lista = []
for i in range(7):
    elemento = str(input("Introduce un elemento: "))
    lista.append(elemento)

opcion = ""

while opcion != "5":
    print("1-Mostras las primeras posiciones.")
    print("2-Mostrar las ultimas posiciones.")
    print("3-Mostrar las posiciones pares.")
    print("4-Mostras las posiciones impares.")
    print("5-Salir")
    opcion = str(input("Elige la operacion a realizar: "))
    if opcion == "1":
        mostrarPrimerasPosciones(lista)
    if opcion == "2":
        mostrarUltimasPosiciones(lista)
    if opcion == "3":
        mostrarPosicionesPares(lista)
    if opcion == "4":
        mostrarPosicionesImpares(lista)



