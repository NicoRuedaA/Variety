from pokemon import Pokemon, pokemon_agua, equipo_pokemon

equipo = equipo_pokemon()

while True:
    menu = """Elige:
    1. Introduce nuevo Pokemon
    2. Ver equipo
    0. Salir"""


    print(menu)
    eleccion = int(input())
    if eleccion == 1:
        nombre = input("nombre del pokemon: ")
        ataque = input("ataque del pokemon: ")
        defensa = input("defensa del pokemon: ")
        equipo.agregar(pokemon_agua(nombre, ataque, defensa))
    elif eleccion == 2:
        equipo.imprimir()
    else:
        print("fin")
        break

