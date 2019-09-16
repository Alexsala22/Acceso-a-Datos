
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class DiezDirectorios {
 
    public static void main(String[]args){
        Scanner t=new Scanner(System.in);
        String nombre=t.nextLine();
        for(int i=0;i<11;i++){
        String ruta=nombre+String.valueOf(i);
        File directorio=new File(ruta);
        directorio.mkdir(); 
        }
    }
}
