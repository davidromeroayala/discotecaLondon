/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Datos {

    public static ArrayList<String> leerarchivo(){
    
    ArrayList<String> vgent=new ArrayList<>();
    File f=new File("archivo.txt");
        
    try {
            
            FileReader fr=new FileReader(f);
            Scanner leer=new Scanner(fr);
            while(leer.hasNext()){
             vgent.add(leer.nextLine());
            }
                
        } catch (FileNotFoundException ex) {
            System.out.println("no se puede conectar con el fichero");
        }
    return vgent;    
    }
    
      
}
