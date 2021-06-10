/* 
   5. Mostrar por pantalla la cantidad de mujeres mayores de edad y la cantidad de hombres menores de edad de un total de N edades 
   y sexo leídos desde teclado.
*/

import java.util.*;

public class Ejercicio5 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int edad, N, numH=0, numM=0;
		String sexo;

		System.out.print("\nNumero de edades: ");
		N = Integer.parseInt(read.nextLine());

		for (int i=1; i<=N; i++) {

			System.out.println("\n-> Persona "+i);
			
			System.out.print("Sexo (M/F): ");
			sexo = read.nextLine();

			System.out.print("Edad: ");
			edad = Integer.parseInt(read.nextLine());

			if (edad<18 && (sexo.equals("M") || sexo.equals("m"))) {
				numH++;
			}
			if (edad>=18 && (sexo.equals("F") || sexo.equals("f"))) {
				numM++;
			}

		}

		System.out.println("\n   Hombres menores de edad: "+numH);
		System.out.println(  "   Mujeres mayores de edad: "+numM+"\n");
	}


}

