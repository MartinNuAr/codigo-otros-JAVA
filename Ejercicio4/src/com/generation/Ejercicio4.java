package com.generation; // Se crea el paquete y se mueve el ejercicio a este.

import java.util.Scanner; // Se importa paquete para que funcione el scanner

public class Ejercicio4 { // Se añade el nombre correcto de la clase

	public static void main(String[] args) {

		
    
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		Scanner s = new Scanner(System.in); // Se añade la entrada y se cambia la posición para que pida el número después de imprimir
		String j1 = s.nextLine();
    
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se cambia a jugador 2
		Scanner s2 = new Scanner(System.in); // Se añade la entrada
		String j2 = s.nextLine();
    
		// Se cambian todos los == por .equals()
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
        case "tijeras": // Se cambia "tijera" por "tijeras"
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default: break;
      }
      System.out.println("Gana el jugador " + g);
    }
  s.close();
  s2.close(); // Se cierran ambos scanners
}
}
