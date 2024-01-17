package ejerciciosBase;

import java.util.Scanner;

public class ejercicio3 {
	
	/*
	 * Escribe un programa que muestre por pantalla todos los números enteros positivos
		menores a uno leído por teclado que no sean divisibles entre otro también leído de
		igual forma
	 * */

	public static void main(String[] args) {
			
		introducirNumero_Divisor();
	}
	
	public static void introducirNumero_Divisor() {
		
		Scanner sc = new Scanner(System.in);	
		
		int numero, divisor;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		System.out.println("Introduce el divisor: ");		
		divisor = sc.nextInt();
		
		comprobador(numero , divisor);
		
		sc.close();
	}
	
	
	public static void comprobador(int numero , int divisor) {
		
		for (int i = 1; i <= numero; i++) { 
			
			if (i % divisor != 0) {
				System.out.println(i);
			}
		}
	}
}