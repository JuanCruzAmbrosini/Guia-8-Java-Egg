/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Juan Cruz
 */
public class MAO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <String> libros = new ArrayList();
        String l1 = "Don Quijote";
        String l2 = "El principito";
        
        libros.add(l1);
        libros.add(l2);
        
        Iterator <String> it = libros.iterator();
        
        while ( it.hasNext() ){
            
            System.out.println(it.next());
            
        }
        
    }
    
}
