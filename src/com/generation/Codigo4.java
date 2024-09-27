package com.generation;

import java.util.Scanner; //Se pone importa librería

//  Este programa permite jugar al clásico juego de piedra, papel o tijeras
//  entre dos jugadores. Solicita la entrada de cada jugador y determina
//  quién gana, mostrando el resultado en consola.
 
public class Codigo4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Se pone System.in
		
		  System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	      String j1 = s.nextLine().toLowerCase(); // Convertir a minúsculas para uniformidad
	       //se elimina s2
	       System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	       String j2 = s.nextLine().toLowerCase(); // Convertir a minúsculas para uniformidad
	       
	       if (j1 == j2) {
	    	      System.out.println("Empate");
	    	    } else {
	    	    	 int g = 2;
		    	      switch (j1) {
					case "piedra": {
						
						break;
					}
					case "papel": {
						
						break;
					}
					case "tijera": {
						
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + j1);
					}
		    	       
				}//else     
	}//main
}//class Codigo4
