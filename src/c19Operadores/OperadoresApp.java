package c19Operadores;

import java.util.Scanner;

public class OperadoresApp {

	public static void main(String[] args) {
		
		int x = 20;
		int y = 3;
		String palabra = "saludos";
		
		int dia = 0;
		int mes = 0;
		char cRepetir = ' ';
		
		/*Funcion Scanner, se crea un objeto de la clase Scanner, se importa la libreria (utilidad) llamada util*/
		Scanner sc = new Scanner(System.in); //Con la variable "sc" podemos obtener informacion del usario.
		
		/*
		System.out.println(x + y + palabra ); //Ejecuta y encuentra primero un int por ende lo suma.
		System.out.println(palabra + x + y); //Ejecuta y encuentra un string por ende no hace la suma.
		System.out.println(palabra + (x + y)); //X y Y se encuentran concatendados.
		*/
		
		do {
			//preguntar un dia
			System.out.print("Dime un numero del dia:");
			dia = sc.nextInt();
			
			//preguntar un mes
			System.out.print("Dime un numero de mes:");
			mes = sc.nextInt();
			
			//hacer seleccion
			System.out.println("dia seleccionado -->" + dia);
			System.out.println("mes seleccionado -->" + mes);
			
			//hacer operacion
			switch(mes) {
			case 01: //ENERO
				if(dia <= 20) {
					System.out.print("Tu signo es capricornio");
				}
				else {
					System.out.print("Tu signo es acuario");
				}
				break;
			case 02: //FEBRERO
				if(dia <= 19) {
					System.out.print("Tu signo es acuario");
				}
				else {
					System.out.print("Tu signo es piscis");
				}
				break;
			case 03: //MARZO
				if(dia <= 20) {
					System.out.print("Tu signo es piscis");
				}
				else {
					System.out.print("Tu signo es aries");
				}
				break;
			case 04: //ABRIL
				if(dia <= 20) {
					System.out.print("Tu signo es aries");
				}
				else {
					System.out.print("Tu signo es tauro");
				}
				break;
			case 05: //MAYO
				if(dia <= 20) {
					System.out.print("Tu signo es tauro");
				}
				else {
					System.out.print("Tu signo es Geminis");
				}
				break;
			case 06: //JUNIO
				if(dia <= 21) {
					System.out.print("Tu signo es Geminis");
				}
				else {
					System.out.print("Tu signo es Cancer");
				}
				break;
			case 07: //JULIO
				if(dia <= 23) {
					System.out.print("Tu signo es Cancer");
				}
				else {
					System.out.print("Tu signo es Leo");
				}
				break;
			case 8: //AGOSTO
				if(dia <= 23) {
					System.out.print("Tu signo es Leo");
				}
				else {
					System.out.print("Tu signo es Virgo");
				}
				break;
			case 9: //SEPTIEMBRE
				if(dia <= 23) {
					System.out.print("Tu signo es Virgo");
				}
				else {
					System.out.print("Tu signo es Libra");
				}
				break;			
			case 10: //OCTUBRE
				if(dia <= 23) {
					System.out.print("Tu signo es Libra");
				}
				else {
					System.out.print("Tu signo es Escorpion");
				}
				break;
			case 11: //NOVIEMBRE
				if(dia <= 23) {
					System.out.print("Tu signo es Escorpion");
				}
				else {
					System.out.print("Tu signo es Sagitario");
				}
				break;
			case 12: //DICIEMBRE
				if(dia <= 25) {
					System.out.print("Tu signo es Sagitario");
				}
				else {
					System.out.println("Tu signo es Capricornio");
				}
				break;
			default:
			System.out.println("No se encuentra el mes");
			}
			
			//preguntar si quiere repetir el programa
			System.out.println("Quieres repetir el programa? responde S -->");
			cRepetir = sc.next().charAt(0);
		}while ( cRepetir == 'S' || cRepetir == 's');//Se siga repitiendo segun el usuario
		
	}

}
