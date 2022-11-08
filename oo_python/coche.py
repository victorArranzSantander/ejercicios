class Coche:
    
    def __init__(self, color, marca, modelo, ano):
        self.color = color
        self.marca = marca
        self.modelo = modelo 
        self.ano = ano
        
    def getColor(self):
        return(self.color)
    
    def setColor(self, color):
        self.color = color
        
    def getMarca(self):
        return(self.marca)
    
    def setMarca(self, marca):
        self.marca = marca
        
    def getModelo(self):
        return(self.modelo)
    
    def setModelo(self, modelo):
        self.modelo = modelo
        
    def getAno(self):
        return(self.ano)
    
    def setAno(self, ano):
        self.ano = ano
        
        
        

coche1 = Coche("azul", "BMW", "abc", 2005)
print(coche1.getColor())
print(coche1.getModelo())
coche1.setColor("verde")
coche1.setModelo("123")
print(coche1.getColor())
print(coche1.getModelo())