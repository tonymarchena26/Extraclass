/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4inrow;

import javax.swing.JOptionPane;

/**
 *
 * @author human
 */
public class GameLogic {
    
    char tablero [] [] = new char[6][7];
    char jugador_actual = 'A'; /*Rojo Amarillo*/

    public GameLogic() {
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                tablero[fila][columna] = '*';
            }
        }
    }
    
    
    
    public void turno (int columna) {
        
        tablero [posicionBaja(columna)][columna] = jugador_actual;

        revisar();
        
        cambiarJugador();
    }

    private void cambiarJugador() {
        
        if (jugador_actual=='A'){
            jugador_actual='R';
        } else {
            jugador_actual='A';
        }
    }
    
    private void revisar () {
   
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                System.out.print(tablero[fila][columna]);
            }
            System.out.println(); //Para que siga imprimendo en la otra fila "printline"
        }
        
        
        if (revisarHorizontal() || revisarVertical() || revisarDiagonalDown () || revisarDiagonalUp () ){
        JOptionPane.showMessageDialog(null,"Ganador: "+jugador_actual);
        }
        
//        System.out.println(revisarVertical());
//        System.out.println(revisarHorizontal());
        
        
    }

    private boolean revisarVertical() {
        boolean ganador = false;
        
        for (int columna = 0; columna < 7; columna++) { //Visita cada columa
            for (int fila = 0; fila <= 2; fila++) { /*Una columna completa de 4 vertical debe incluir filas 0,1 o 2*/
                if(tablero[fila][columna] ==jugador_actual &&
                   tablero[fila+1][columna] ==jugador_actual &&
                   tablero[fila+2][columna] ==jugador_actual &&
                   tablero[fila+3][columna] ==jugador_actual){
                ganador =true;
                return ganador;
                }
            }
        }
        return ganador;
    }
    
    public String getTablero () {
    
        String str_tablero = "";
        
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                str_tablero += tablero[fila][columna];
            }
                str_tablero+= '\n';
        }
        
        return str_tablero  ;
    }
    
    private int posicionBaja(int columna){
        for (int fila = 5; fila >= 0; fila--) {
            if (tablero [fila][columna] == '*' ){
                return fila;
            }
    }
        return -1;
    }

    private boolean revisarHorizontal() {
        boolean ganador = false;
        
        for (int fila = 0; fila < 6; fila++) { //Visita cada fila
            for (int columna = 0; columna <= 3; columna++) { /*Una fila completa de 4 horizontal debe incluir filas 0,1,2 o 3*/
                if(tablero[fila][columna] ==jugador_actual &&
                   tablero[fila][columna+1] ==jugador_actual &&
                   tablero[fila][columna+2] ==jugador_actual &&
                   tablero[fila][columna+3] ==jugador_actual){
                ganador =true;
                return ganador;
                }
            }
        }
        return ganador;
    }
    private boolean revisarDiagonalDown () {
        boolean ganador = false;
        int fila, columna;
        for (fila=0; fila<=2; fila++){
            for (columna=0; columna<=3; columna++){
                if (tablero[fila][columna] == jugador_actual &&    
	   tablero[fila+1][columna+1] == jugador_actual &&    
	   tablero[fila+2][columna+2] == jugador_actual && 
	   tablero[fila+3][columna+3] == jugador_actual) {  
                   ganador =true;
                return ganador; 
            } 
        }
    }
        return ganador;
    }
    private boolean revisarDiagonalUp () {
        boolean ganador = false;
        int fila, columna;
        
        for (fila=0; fila<=2; fila++) {	  
	    for (columna=3; columna<=6; columna++){
		if (tablero[fila][columna] == jugador_actual &&      
		    tablero[fila+1][columna-1] == jugador_actual &&  
		    tablero[fila+2][columna-2] == jugador_actual && 
		    tablero[fila+3][columna-3] == jugador_actual){ 
			ganador = true;	       
			return ganador;	
    }
      }
        }
        return ganador;
            
}
}
