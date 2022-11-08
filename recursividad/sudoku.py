def check_row(n, row):
    return (n in row)



def col_row(tablero, y):
    array = []
    for i in range(9):
        for j in range(9):
            if (j == y):
                array.append(tablero[i][j])
    return (array)



def check_col(tablero, y, n):
    row = col_row(tablero, y)
    return(check_row(n, row))
        
    

def check_3x3(tablero, n, x, y):
    encontrado = False
    x0 = (x//3) * 3
    y0 = (y//3) * 3
    for i in range(3):
        for j in range(3):
            if(tablero[i+x0][j+y0] == n):
                encontrado = True
                break
    return(encontrado)
                
    

def compruebaFin(tablero):
    resuelto = True
    for i in range(9):
        if (0 in tablero[i]):
            resuelto = False
            break
    return(resuelto)


        
def sudoku(tablero, fil, col):
    resuelto = compruebaFin(tablero)
    if(resuelto):
        return(tablero)
    else:
        candidatos = []
        for i in range(1, 10):
            if(tablero[fil][col] != 0 or check_row(i, tablero[fil]) or check_col(tablero, col, i) or check_3x3(tablero, i, fil, col)):
                pass
            else:
                candidatos.append(i)
        if(len(candidatos) == 1):
            tablero[fil][col] = candidatos[0]
        else:
            if(col == 8):
                col = 0
                if(fil == 8):
                    fil = 0
                else:
                    fil = fil + 1
            else:
                col = col + 1
                
        sudoku(tablero, fil, col)
        



tablero = [[5,3,0,0,7,0,0,0,0],
           [6,0,0,1,9,5,0,0,0],
           [0,9,8,0,0,0,0,6,0],
           [8,0,0,0,6,0,0,0,3],
           [4,0,0,8,0,3,0,0,1],
           [7,0,0,0,2,0,0,0,6],
           [0,6,0,0,0,0,2,8,0],
           [0,0,0,4,1,9,0,0,5],
           [0,0,0,0,8,0,0,7,9]]


for i in range(9):
    print(tablero[i])
    
sudoku(tablero, 0, 0)

print()
for i in range(9):
    print(tablero[i])





