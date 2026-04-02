def suma(a,b):
    return int(a+b)

def resta(a,b):
    return int(a-b)

def multiplicacion(a,b):
    return int(a*b)

def division(a,b):
    return int(a/b)


def calculadora():
    while True:
        menu = """menu
        1: suma
        2: resta
        3: multiplicacion
        4: division
        0: salir
        """
        print(menu)

        eleccion = int(input("elige:"))
        if eleccion == 1:
            numero1 = int(input("introduce el valor 1 "))
            numero2 = int(input("introduce el valor 2 "))
            print(suma(numero1, numero2))

        elif eleccion == 2:
            numero1 = int(input("introduce el valor 1 "))
            numero2 = int(input("introduce el valor 2 "))
            print(resta(numero1, numero2))

        elif eleccion == 3:
            numero1 = int(input("introduce el valor 1 "))
            numero2 = int(input("introduce el valor 2 "))
            print(multiplicacion(numero1, numero2))

        elif eleccion == 4:
            numero1 = int(input("introduce el valor 1 "))
            numero2 = int(input("introduce el valor 2 "))
            print(division(numero1, numero2))

        else:
            print("fin")
            break


calculadora()