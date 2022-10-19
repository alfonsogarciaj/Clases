a = 4
b = 7

aBotellasPrecio = 100.23
bBotellasPrecio = 60.25
aBotellasPrecioTotal = a * aBotellasPrecio
bBotellasPrecioTotal = b * bBotellasPrecio
botellasPrecioTotal = aBotellasPrecioTotal + bBotellasPrecioTotal
mediaPrecioBotella = round(botellasPrecioTotal / (a + b),2)

print(f"El promedio por botella es de: {mediaPrecioBotella}")
