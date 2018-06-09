/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palíndromos;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Palíndromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
 
      System.out.println("Ingresa una palabra para saber si es palíndromo");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("La palabra ingresada es un palíndromo.");
      else
         System.out.println("La palabra ingresada no es un palíndromo.");
    }
    
}
