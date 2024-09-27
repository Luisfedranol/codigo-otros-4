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
	       
	       if (j1.equals(j2)) {
	    	      System.out.println("Empate");
	    	    } else {
	    	    	 int g = 2;
		    	      switch (j1) {
					case "piedra": {
						if (j2 == "tijera") {
				            g = 1;
				          }
						 System.out.println("Gana el jugador " + g);
						break;
					}
					case "papel": {
						if (j2 == "piedra") {
				            g = 1;
				          }
						 System.out.println("Gana el jugador " + g);
						break;
					}
					case "tijera": {
						if (j2 == "papel") {
				            g = 1;
				          }
						 System.out.println("Gana el jugador " + g);
						break;
					}
					default:
						 System.out.println("Entrada inválida");
					}//switch       
				}//else     
	       s.close(); //Se cierra el Scanner
	}//main
}//class Codigo4
