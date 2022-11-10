import wikipediaapi

def getWikiInfo(p_wiki):
    return(p_wiki.fullurl + "\n\n" + p_wiki.title + "\n\n" + p_wiki.text)
    
def storeFile(text, articulo):
    file = open(articulo + ".txt", "w")
    file.write(text)
    file.close()

wiki_wiki = wikipediaapi.Wikipedia(
        language='en',
        extract_format=wikipediaapi.ExtractFormat.WIKI
)

print("Introduce un artículo para buscar en Wikipedia: ")
articulo = input()

p_wiki = wiki_wiki.page(articulo)

if(p_wiki.exists()):
    text = getWikiInfo(p_wiki)
    storeFile(text, articulo)
else:
    wiki_wiki = wikipediaapi.Wikipedia(
        language='en',
        extract_format=wikipediaapi.ExtractFormat.WIKI
    )
    p_wiki = wiki_wiki.page(articulo)
    if(p_wiki.exists()):
        text = getWikiInfo(p_wiki)
        storeFile(text, articulo)
    
    


    





