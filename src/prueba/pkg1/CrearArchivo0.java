/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class CrearArchivo0 {
    
   public static void CrearArchivo() throws IOException{
    String ruta="archivo.txt";
    File archivo=new File(ruta);
    BufferedWriter bw;
    
    if(archivo.exists()){
        bw=new BufferedWriter(new FileWriter(archivo));
        bw.write("Ya estaba creao");
    }else{
        bw=new BufferedWriter(new FileWriter(archivo));
        bw.write("Acabo de crear el archivo");
    }
    bw.close();
   }
    
    public static void main(String[]args) throws IOException{
      CrearArchivo();
              }
    
    }
   
   
    
    
    

