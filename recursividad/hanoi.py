def hanoi(n, origen, auxiliar, destino):
    if(n == 1):
        print("disco " + str(n) + ": " + origen + " --> " + destino)
    else:
        hanoi(n - 1, origen, destino, auxiliar)
        print("disco " + str(n) + ": " + origen + " --> " + destino)
        hanoi(n - 1, auxiliar, origen, destino)
    
    
    
print("Introduce el número de discos: ")
numero = int(input())
hanoi(numero, "palo 1", "palo 2", "palo 3")