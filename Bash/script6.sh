#!/bin/bash

mkdir -p result
> result/odd.dat
> result/even.dat

for i in {1..100}; do
	num=$(( RANDOM % 100 ))
	
	if (( num % 2 == 0 )); then
		echo $num >> result/even.dat
	else 
		echo $num >> result/odd.dat
	fi
done

pares=$(wc -l < result/even.dat)
impares=$(wc -l <result/odd.dat)

echo "Proceso finalizado"
echo "Numeros pares: $pares"
echo "Números impares: $impares"

if [ "$pares" -gt "$impares" ]; then
	echo "El archivo 'even.dat' contiene más números."
elif [ "$impares" -gt "$pares" ]; then
	echo "El archivo 'odd.dat' contiene más números."
else 
	echo "Ambos archivos tienen la misma cantidad de números."
fi
