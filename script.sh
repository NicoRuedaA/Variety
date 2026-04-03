#!/bin/bash

# Detener el script si ocurre algún error
set -e

echo "Iniciando la fusión de repositorios manteniendo el historial..."

# 1. Fusionar Java_Swing en la carpeta "Java Swing"
echo "=== Fusionando Java_Swing ==="
git subtree add --prefix="Java Swing" https://github.com/NicoRuedaA/Java_Swing.git main

# 2. Fusionar Java_Basic-Extra en la carpeta "Java extra"
echo "=== Fusionando Java_Basic-Extra ==="
git subtree add --prefix="Java extra" https://github.com/NicoRuedaA/Java_Basic-Extra.git main

# 3. Fusionar Java_Basic en la carpeta "Java"
echo "=== Fusionando Java_Basic ==="
git subtree add --prefix="Java" https://github.com/NicoRuedaA/Java_Basic.git main

echo "=== ¡Todos los repositorios se han fusionado con éxito! ==="