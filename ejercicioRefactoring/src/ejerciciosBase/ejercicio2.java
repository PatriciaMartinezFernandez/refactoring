package ejerciciosBase;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Escribe un programa que genere la nómina (bien desglosada) de un empleado
		//según las siguientes condiciones:
			//● Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
			//de proyecto), los días que ha estado de viaje visitando clientes durante el
			//mes y su estado civil (1 - Soltero, 2 - Casado).
			//● El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se
			//trata de un prog. junior, un prog. senior o un jefe de proyecto
			//respectivamente.
			//● Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto
			//de dietas. Al sueldo neto hay que restarle el IRPF, que será de un 25% en
			//caso de estar soltero y un 20% en caso de estar casado.
		
		int cargo;
		int dias = 0;
		int pdia = 30;
		int estadoCivil;
		int sueldo = 0;
		double irpf = 0;
		int dieta = 0;
		double nomina;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu cargo? Prog. Junior (1), Prog. Senior(2), Jefe de proyecto(3)");
		cargo = sc.nextInt();
		
		System.out.println("¿Incluye dieta? Si(1), No(2)");
		dieta = sc.nextInt();
		
		
		if (dieta == 1) 
			System.out.println("¿Cuántos días has estado de viaje visitanto clientes en este mes?");
			dias = sc.nextInt();
		System.out.println("¿Cuál es tu estado civil? Soltero(1), Casado(2)");
		estadoCivil = sc.nextInt();
		sc.close();
		switch (cargo) {
	case 1: 
			sueldo = 950;
				break;
			case 2: 
		sueldo = 1200;
				break;
			case 3: 
						sueldo = 1600;
	break;
		}
		switch (estadoCivil) {
			case 1: 
			irpf = 0.25;
			break;
			case 2: 
			irpf = 0.20;
			break;
	}

		int eurosExtra = dias * pdia;
		System.out.println("==========================================");
		System.out.println("Como eres " + cargo + " tu base imponible es de " + sueldo + "€");
		System.out.println("Como tu estado civil es " + estadoCivil + " tu IRPF es de " + irpf);
		if (dieta == 1) {
			System.out.println("Si has necesitado una dieta se te habrá abonado 30€ por día trabajado:");
		System.out.println("Como has trabajado " + dias + " dias , tienes " + eurosExtra + "€ euros extra");
		double sueldoDieta = (sueldo + eurosExtra);
			nomina = sueldoDieta - (sueldoDieta * irpf);
			System.out.println("Sueldo: " + nomina + "€");
			System.out.println("==========================================");
		}
		else  
			System.out.println("No has necesitado una dieta");
		nomina = sueldo - (sueldo * irpf);
			System.out.println("Sueldo: " + nomina + "€");
			System.out.println("==========================================");
		
	}
}