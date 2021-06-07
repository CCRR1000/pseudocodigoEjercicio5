Algoritmo Ejercicio5
	
	Definir N, numH, numM, edad como Entero
	Definir sexo como Caracter
	
	Escribir "Número de edades: "
	Leer N
	
	Para i<-1 Hasta N Con Paso 1 Hacer
		
		Escribir "Persona " , i
		
		Escribir "Edad:"
		Leer edad
		Escribir "Sexo: (M/F)"
		Leer sexo
		
		Si edad<18 Y (sexo="M" O sexo="m") Entonces
			numH <- numH+1
		Fin Si
		
		Si edad>=18 Y (sexo="F" O sexo="f") Entonces
			numM <- numM+1
		Fin Si
		
	Fin Para
	
	Escribir "Hombres menores de edad: " , numH
	Escribir "Mujeres mayores de edad: " , numM
	
FinAlgoritmo
