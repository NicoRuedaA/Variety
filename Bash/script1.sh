#!/bin/bash

read -p "Introduce el primer nombre: " num1
read -p "Introduce el segundo nombre: " num2

echo "+ Suma"
echo "- Resta"
echo "* Multiplicación"
echo "/ División"

read -p  "Introduce un carácter para elegir la operación: " operacion
if [ "$operacion" = "+" ]; then echo $(($num1 + $num2))
elif [ "$operacion" = "-" ]; then echo $(($num1 - $num2))
elif [ "$operacion" = "*" ]; then echo $(($num1 * $num2))
else echo $(($num1 * $num2))
fi

if [ $num1 -gt $num2 ]; then echo "$num1 es mayor que $num2"
elif [ $num1 -lt $num2 ]; then echo "$num2 es mayor que $num1"
else echo "Los números son iguales"
fi
