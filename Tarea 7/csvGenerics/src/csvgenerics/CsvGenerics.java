/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvgenerics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author human
 */
public class CsvGenerics {

    
    static File file = new File("CsvGenerics.csv");
    static BufferedWriter out = null;
    
    public static <T extends Object> boolean writeObject (T objectToWrite){
    
        writeCSV(objectToWrite.toString());
        return true;
        
    }
    
    private static void writeCSV(String objectString){


    try {

      out = new BufferedWriter(new FileWriter(file, true));

      BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(objectString.getBytes())));
      String line;

      while ((line = reader.readLine()) != null) {
        out.write(line.trim());
        out.newLine();
      }
    }

    catch (IOException e) {
      // log something
      e.printStackTrace();
    }

    finally {
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          // ignored
        }
      }
    }
        
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    
        Persona p1 = new Persona("Tony","Marchena");
        Persona p2 = new Persona("Xavi","Marchena");
        
        writeObject(p1);
        writeObject(p2);
        
        
        
        
    }
    
}
