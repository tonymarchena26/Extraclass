/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.and.even;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class OddAndEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
      System.out.println("Ingresa un número para ver si es par o impar ");
      Scanner in = new Scanner(System.in);
      number = in.nextInt();
 
     
      if ( number % 2 == 0 )
         System.out.println("El número que ingreaste es par.");
      else
         System.out.println("El número que ingreaste es impar.");
    }
    }
    

