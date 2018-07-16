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
public class Labyrinth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maze ma = new Maze();
        Game gam = new Game();

        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("            ¡BIENVENIDO!             ");
            System.out.println("Tienes que salir del laberinto, ");
            System.out.println("tu jugador virtual esta representado por el 2, ");
            System.out.println("si te topas con un 1 significa que tienes una vida menos,");
            System.out.println("el lugar seguro para caminar es el 0");
            System.out.println("y recuerda, SOLO TIENES 4 VIDAS ");
            System.out.println("");
            System.out.println("1.Laberinto 7x7 ");
            System.out.println("2.Laberinto 9x9 ");
            System.out.println("3.Laberinto 6x6 ");
            System.out.println("4.Salir");
            System.out.println("");
            System.out.println("Selecciona un laberinto: ");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    gam.Start(ma.mazeOne(), ma.rowMove(ma.mazeOne()), ma.columnMove(ma.mazeOne()));

                    break;
                case 2:
                    gam.Start(ma.mazeTwo(), ma.rowMove(ma.mazeTwo()), ma.columnMove(ma.mazeTwo()));

                    break;
                case 3:
                    gam.Start(ma.mazeThree(), ma.rowMove(ma.mazeThree()), ma.columnMove(ma.mazeThree()));

                    break;
                case 4:
                    System.out.println("Saliste del juego");
                    
                    break;
                default:
                    System.out.println("Selecciona un laberinto de la lista :)");
            }

        } while (option != 4);
    }
    
}
