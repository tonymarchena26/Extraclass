/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Game {
     Scanner scan = new Scanner(System.in);
    
    public void Start(String[][] matrix, int row, int column) {
        
        int fail = 0;
        Maze x = new Maze();
        int [] position = x.pstnX(matrix);
        
        while (fail < 4) {

            if (matrix[row][column] == matrix[position[0]][position[1]]){
                System.out.println("¡EXITO!");
                fail += 4;
            } else {
                showMatrix(matrix);
                System.out.println("Direcciones: Arriba (N) -  Abajo (S) -  Derecha (E) - Izquierda (O) ");
                System.out.println("¿EN QUE DIRECCIÓN SERÁ TU MOVIMIENTO?: ");
                String direction = scan.next();
                
               
                if (direction.equalsIgnoreCase("e")) {
                    if (!matrix[row][column + 1].equals("1")) {
                        matrix[row][column + 1] = "2";
                        matrix[row][column] = "0";
                        column++;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                    }
                }

               
                if (direction.equalsIgnoreCase("o")) {
                    if (!matrix[row][column - 1].equals("1")) {
                        matrix[row][column - 1] = "2";
                        matrix[row][column] = "0";
                        column--;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                    }
                }

               
                if (direction.equalsIgnoreCase("n")) {
                    if (!matrix[row - 1][column].equals("1")) {
                        matrix[row - 1][column] = "2";
                        matrix[row][column] = "0";
                        row--;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                    }
                }

                
                if (direction.equalsIgnoreCase("s")) {
                    if (!matrix[row + 1][column].equals("a")) {
                        matrix[row + 1][column] = "2";
                        matrix[row][column] = "0";
                        row++;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                    }
                }
            }
            
        }
        
        System.out.println("¡PERDIDO!");
        System.out.println(" ");
        
        
        
    }

    public void showMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
