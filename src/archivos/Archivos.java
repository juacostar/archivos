/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        
     
        Scanner x= new Scanner(new File("Directorio/xx.txt"));
        int c=0;
        while(x.hasNext()){
            String word=x.next();
            c++;
        }
    
        
        System.out.println("total words: "+c);
        // TODO code application logic here
        File archivo=new File("Directorio");
        System.out.println("existe:" + archivo.exists());
        System.out.println("longitud:"+archivo.length());
        System.out.println("Directorio: "+archivo.isDirectory());
        if(archivo.exists() && archivo.isDirectory()){
            for(int i=0;i<archivo.list().length;i++){
             File hijo=new File("Directorio/" + archivo.list()[i]);
             if(hijo.exists()&& hijo.isDirectory()){
                 for(String nombre:hijo.list()){
                     System.out.println(nombre);
                 }
             }else{
                 System.out.println(archivo.list()[i]);
             }
            }
        }
    
        
    
   }
}
