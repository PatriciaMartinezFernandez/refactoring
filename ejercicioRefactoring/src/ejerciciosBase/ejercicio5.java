package ejerciciosBase;

import java.util.Scanner;

//Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de
//lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4,
//* * * *
//* * *
//* *
//*

public class ejercicio5 {
	
	
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int n;

    		
        System.out.println("Introduzca numero de filas: ");   
        n = sc.nextInt();
        
        
            for (int x = 0; x < n; x++) {
            	
            	for (int j = n - x; j > 0; j--) {
            		System.out.print("*");
            	    
            	}
            		System.out.println();
            }
            
    }
}