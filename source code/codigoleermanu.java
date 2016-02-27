
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manum_000
 */
public class Main {

    public Main() {
       //declarar
       FileReader read;
       BufferedReader lec;
       String leyendo=null; //variable para leer por lineas
        try {
            read=new FileReader("src/newfile");
            lec=new BufferedReader(read);
            leyendo=lec.readLine();
            while(leyendo!=null){ //bucle que lee linea a linea hasta el final del fichero
                
                leyendo=lec.readLine();}
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
                
        
    
    
    
    }
    public static void main(String[] args) {
        new Main();
    }
}
