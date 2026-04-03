#!/bin/bash

opcion=0
while [ "$opcion" -ne 4 ]; do
	echo -e "\n --- Menu ---"
	echo "1. Mostrar nombre del equipo"
	echo "2. Mostrar usuario actual"
	echo "3. Mostrar IP"
	echo "4. Salir"
	read -p "Selecciona una opcion: " opcion
	
	case $opcion in 
		1) echo "$HOSTNAME";;
		2) echo "$USER";;
		3) echo "$(hostname -I)";;
		4) echo "Saliendo"; sleep 1;;
		*) echo "Opción no válida";;
	esac
done
