#!/bin/bash

dir_name=$(date +"%d-%m-%y")
mkdir -p "$dir_name"

echo "Configuracion"
for i in {1..4}
do
	read -p "Ruta absoluta #$i " ruta
	if [ -e "$ruta" ]; then
		cp -r "$ruta" "$dir_name"
		echo "Copiando: $ruta"
	else
		echo "Error: ruta no existe"
	fi
done

echo "Backup finalizado"
