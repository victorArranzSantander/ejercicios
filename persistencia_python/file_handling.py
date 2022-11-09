def readFile(filename):
    file = filename + ".txt"
    f = open(file, "r")
    str = f.read()
    f.close()
    #print(str)
    return (str)


def word_count(filename):
    file = readFile(filename)
    file_split = file.split(" ")
    return(len(file_split))


def line_count(filename):
    file = readFile(filename)
    file_split = file.split("\n")
    return(len(file_split))


def rep_word_line(filename, word):
    file = readFile(filename)
    file = file.lower()
    word = word.lower()
    lines = line_count(filename)
    file_split = file.split("\n")
    values = []
    for i in range(lines):
        aux = 0
        line = file_split[i].rstrip().split(" ")
        for j in line:
            if (j == word):
                aux += 1
        values.append(aux)
    dict = {}
    keys = range(lines)
    for i in keys:
        dict[i] = values[i]
    return(dict)


def text_to_binary(filename):
      file = readFile(filename)
      file_split = file.replace("\n", " ").split(" ")
      #file_split = ' '.join(file_split)
      arr = bytearray(file_split)
      f = open("fileBinary.bin", "wb")
      f.write(arr)
      f.close()
    
    


print(word_count("quijote"))
print(line_count("prueba"))
print(rep_word_line("quijote", "dulcinea"))
text_to_binary("quijote")       
    
    

