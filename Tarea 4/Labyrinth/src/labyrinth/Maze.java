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
public class Maze {
    Scanner scan = new Scanner(System.in);
    
     public String[][] mazeOne() {
        String[][] matrix = {
            
            {"1","1","1","1","1","3","1"},

            {"1","0","1","0","1","0","1"},

            {"1","1","0","1","0","0","1"},

            {"1","0","0","1","0","1","1"},      

            {"1","1","0","0","0","0","1"},

            {"1","0","0","1","1","0","1"},

            {"1","2","1","1","1","1","1"}};
       
        
    return matrix;
    }
     
     
     
     public String[][] mazeTwo() {
        String[][] matrix = {
            
            {"1","1","1","1","1","1","1","1","1"},

            {"1","0","0","0","1","0","1","0","3"},

            {"1","0","1","0","0","1","0","0","1"},

            {"1","0","0","1","0","0","1","0","1"},      

            {"1","1","0","1","1","0","1","0","1"},

            {"2","0","0","0","1","0","0","0","1"},
            
            {"1","1","0","1","1","0","1","1","1"},

            {"2","0","0","1","1","0","0","0","1"},

            {"1","1","1","1","1","1","1","1","1"}};
       
        
    return matrix;
    }
     
    
      public String[][] mazeThree() {
        String[][] matrix = {
            
            {"1","1","1","3","1","1"},

            {"1","1","0","0","1","1"},

            {"1","0","0","1","1","1"},

            {"1","1","0","0","0","1"},      

            {"1","0","1","1","0","1"},

            {"1","1","1","1","2","1"}};
       
        
    return matrix;
    }
      
      
     
      public int rowMove(String[][] matrix) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("2")) {
                    row = i;
                }
            }
        }
        return row;
    }
    public int columnMove(String[][] matrix) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("2")) {
                    row = j;
                }
            }
        }
        return row;
    }
    
     int [] position = new int[2];
     
     public int [] pstnX(String [][]matriz){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[0].length; j++) {
                 if (matriz[i][j].equals("3")) {
                     position[0]=i;
                     position[1]=j;
                 }
             }
         }
         return position;
     }
}
