def factorial(n):
    if (n == 1):
        return 1
    else:
        return n * factorial(n - 1)
    
print("Introduce el número: ")
numero = int(input())
print(str(numero) + "! =  " + str(factorial(numero)))