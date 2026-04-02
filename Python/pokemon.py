class Pokemon:
    def __init__(self, ataque, defensa):
        self.ataque = ataque
        self.defensa = defensa

class pokemon_agua(Pokemon):
    tipo = "agua"
    def __init__(self, nombre, ataque, defensa):
        super().__init__(ataque, defensa)
        self.nombre = nombre

    def __str__(self):
        return (f"[Nombre: {self.nombre}, Ataque: {self.ataque}, Defensa {self.defensa}]")
    
class equipo_pokemon:
    def __init__(self):
        self.miEquipo = []

    def agregar(self, pokemon):
        self.miEquipo.append(pokemon)

    def imprimir(self):
        for i,Pokemon in enumerate(self.miEquipo, start=1):
            print(f"{i}: {Pokemon}")



        
        
