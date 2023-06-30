package semanaSwitchDiecinueve;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		
		
		
		
			System.out.println("Bienvenido. Digite una opcion del 1 al 8: ");
			System.out.println("1- Lunes ");
			System.out.println("2- Martes ");
		    System.out.println("3- Miercoles  ");
		    System.out.println("4- Jueves ");
		    System.out.println("5- Viernes ");
		    System.out.println("6- Sabado ");
		    System.out.println("7- Domingo ");
		    System.out.println("8- Terminar ");
		    int menu = valor.nextInt();
		    
		    
		    switch (menu) {
		    
		    
		    case 1:
			System.out.println("Es Lunes");
			break;
		    case 2:
			System.out.println("Es Martes");
			break;
		    case 3:
			System.out.println("Es Miercoles");
			break;
		    case 4:
			System.out.println("Es Jueves");
			break;
		    case 5:
			System.out.println("Es Viernes");
			break;
		    case 6:
			System.out.println("Es Sabado");
			break;
		    case 7:
			System.out.println("Es Domingo");
			break;
		    case 8:
			System.out.println("Finalizado");
			break;
			default:
			System.out.println("Opcion invalida");
			break;
			}
		}
	}
		 

	
	


