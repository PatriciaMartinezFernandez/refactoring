package ejerciciosBase;

import java.util.Scanner;

/*
 * Escribe un programa que muestre por pantalla todos los números enteros positivos
	menores a uno leído por teclado que no sean divisibles entre otro también leído de
	igual forma
 * */

public class ejercicio3 {

	public static void main(String[] args) {

		int numero=IntroNum();
		int divisor=IntroDiv();
		MostrarLista(numero,divisor);

	}
	public static int IntroNum() {
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		
		
		return numero;
		
	}
	public static int IntroDiv() {
		Scanner sc = new Scanner(System.in);
		int divisor;
		System.out.println("Introduce el divisor:");
		do {
			divisor = sc.nextInt();
			if(divisor==0) {
				System.out.println("Error al introducir divisor,introduzca otro");
			}
		}while(divisor==0);
		
		return divisor;
		
		
	}
	public static void MostrarLista(int numero,int divisor) {
		
		for (int i = 1; i <= numero; i++) {
			// de ese listado de números comprueba cuales NO son divisbles entre la variable
			// divisor
			if (i % divisor != 0) {
				// solo printea en caso de que no sean divisibles
				System.out.println(i);
			}
		}
	}

}