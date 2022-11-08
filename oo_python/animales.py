class Animal:
    def __init__(self, edad, nombre):
        self.edad = edad
        self.nombre = nombre 
        
    def getEdad(self):
        return(self.edad)
    
    def setEdad(self, edad):
        self.edad = edad
    
    def getNombre(self):
        return(self.nombre)
    
    def setNombre(self, nombre):
        self.nombre = nombre
        
        
class Gato(Animal):
    def __init__(self, edad, nombre, especie, pelo):
        super().__init__(edad, nombre)
        self.especie = especie
        self.pelo = pelo
        
    def getEspecie(self):
        return(self.especie)
    
    def setEspecie(self, especie):
        self.especie = especie
    
    def getPelo(self):
        return(self.pelo)
    
    def setPelo(self, pelo):
        self.pelo = pelo
    
    def maullar(self):
        print("Miau")

    
    
class Perro(Animal):
    def __init__(self, edad, nombre, especie, duermeEnCasa):
        super().__init__(edad, nombre)
        self.especie = especie
        self.duermeEnCasa = duermeEnCasa
        
    def getEspecie(self):
        return(self.especie)
    
    def setEspecie(self, especie):
        self.especie = especie
        
    def getDuermeEnCasa(self):
        return(self.duermeEnCasa)
    
    def setDuermeEnCasa(self, duermeEnCasa):
        self.duermeEnCasa = duermeEnCasa
        
    def ladrar(self):
        print("Guau")
    
    
class Vaca(Animal):
    def __init__(self, edad, nombre, esspecie, terreno):
        super().__init__(edad, nombre)
        self.especie = esspecie
        self.terreno = terreno
        
    def getEspecie(self):
        return(self.especie)
    
    def setEspecie(self, especie):
        self.especie = especie
        
    def getTerreno(self):
        return(self.terreno)
    
    def setTerrreno(self, terreno):
        self.terreno = terreno
        
    def mugir(self):
        print("Muuuu")
        
        
vaca = Vaca(20, "Ramona", "lechera", "granja")
vaca.mugir()
print(vaca.getEdad())