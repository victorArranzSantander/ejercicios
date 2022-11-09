
import firebase_admin
from firebase_admin import credentials, firestore

cred = credentials.Certificate("private_key.json")
firebase_admin.initialize_app(cred)

db = firestore.client()

print("Título: ")
titulo = input()
print("Iban: ")
iban = input()
print("Páginas: ")
paginas = int(input())
print("Autor: ")
autor = input()

datos = {
    'titulo': titulo,
    'iban': iban,
    'paginas': paginas,
    'autor': autor,
}


doc = db.collection('libreria').document()
doc.set(datos)
doc.id # random id para la entrada de la db

# Get data from db
libros = db.collection('libreria').stream()
for lib in libros:
    print('{} : {}'.format(lib.id, lib.to_dict()))



