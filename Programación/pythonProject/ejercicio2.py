Lista1 = [3, 14, 24, 15, 4, 5, 7, 8, 19]
Lista2= [5, 54, 12, 14, 7, 5, 2, 10, 1, 2, 19]

Lista1.sort()
Lista1.reverse()
Lista2.sort()
Lista2.reverse()
print("De mayor a menor: ")
print(Lista1)
print(Lista2)
i = 0
sumatoria1 = 0
sumatoria2 = 0
for i in Lista1:
    sumatoria1 += i
    i += 1

for i in Lista2:
    sumatoria2 += i
    i += 1
media1 = sumatoria1/len(Lista1)
media2 = sumatoria2/len(Lista2)

print(f"La suma de la lista 1 es de :{sumatoria1}")
print(f"La suma de la lista 1 es de :{sumatoria2}")
print(f"La media de la primera lista es de: {media1} ")
print(f"La media de la segunda lista es de: {round(media2,2)} ")
