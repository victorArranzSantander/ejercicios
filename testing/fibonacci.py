def fibonacci(a):
    if(a == 0):
        return 1
    if(a == 1):
        return 1
    else:
        return fibonacci(a - 1) + fibonacci(a - 2)