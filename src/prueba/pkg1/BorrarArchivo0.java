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
public class BorrarArchivo0 {
   
    public static void BorrarArchivo(){
 File ruta = new File( "archivo.txt" );
if ( ruta.delete() ){
// Imprimir el mensaje de eliminación
}else{
// NOose puede eliminar el archivo
    }
 
      
      
    }
    
    public static void main(String[]args){
        BorrarArchivo();
    }
}


    


