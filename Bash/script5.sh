#!/bin/bash

archivo="info.dat"

echo "Info del sistema" > "$archivo"
echo "Nombre del equipo: $(hostname)" >> "$archivo"
echo "Nombre del usuario: $(whoami)" >> "$archivo"
echo "IP del equipo: $(hostname -I | awk '{print$1}')" >> "$archivo"
echo "Fecha y hora:  $(date)" >> "$archivo"

cat "$archivo"
