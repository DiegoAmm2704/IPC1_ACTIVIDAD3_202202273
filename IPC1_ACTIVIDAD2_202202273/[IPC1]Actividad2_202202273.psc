Algoritmo Actividad2
	Definir n Como Entero
	Definir r Como Entero
	Definir t Como Caracter
	Definir i Como Entero
	Definir esPrimo Como Logico	
	t = "Y"
	Mientras t == "Y" Hacer
		Escribir "Por favor, ingresa el numero con el que vamos a trabajar"
		Leer n
		r = trunc(n^0.5)   //Trunca el numero para que solo tenga la parte entera, sin decimales
		
		esPrimo = Verdadero
		
		//Valida que no sea 0 o 1
		Si n<=1 Entonces
			esPrimo = Falso
		Fin Si
		
		//Valida que desde 2 hasta la raiz de n no haya ningun numero que sea divisor, si hay divisor no es primo, si no hay divisor es primo
		Si esPrimo Entonces
			
			Para i<-2 Hasta r Con Paso 1 Hacer
				Si (n % i = 0) Entonces
					esPrimo = Falso
					
				Fin Si
				
			Fin Para
		FinSi
		
		//Despliega el mensaje si es primo o no
		Si esPrimo == Falso Entonces
			Escribir "El numero no es primo"
		SiNo
			Escribir "El numero es primo"
		Fin Si
		
		
		Escribir "Desea repetir? Y/N"
		Leer t
	Fin Mientras
	
FinAlgoritmo
