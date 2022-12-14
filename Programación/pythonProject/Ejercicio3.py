cuenta = 0
print("Bienvenido a tu cuenta bancaria. ")
print(f"Tu cuenta es de {cuenta} euros.")
opcion = ""
while opcion != "0":
    print("D-Ingresar.")
    print("W-Retirar.")
    print("0-Salir")
    opcion = str(input("Elige la operacion a realizar: "))
    if opcion == "D":
        cantidad = int(input("Cuanto desea ingresar: "))
        cuenta += cantidad
    if opcion == "W":
        cantidad = int(input("Cuanto desea retirar: "))
        cuenta -= cantidad

print(f"Adios. Tu cuenta se ha quedado en {cuenta}")

