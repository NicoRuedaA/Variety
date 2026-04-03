#!/bin/bash

read -p "Introduce tu nombre: " nombre

if [ -d "$nombre" ]; then
	echo "La carpeta '$nombre' ya existe."
else
	mkdir "$nombre"
	echo "Carpeta '$nombre' creada con éxito."
fi

for i in {0..9}; do
	touch "$nombre/${nombre}${i}.txt"
done

echo "se han generado 10 archivos en la carpeta '$nombre'."
