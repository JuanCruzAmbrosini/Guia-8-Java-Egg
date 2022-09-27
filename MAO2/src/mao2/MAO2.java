/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Juan Cruz
 */
public class MAO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Integer> numerosA = new ArrayList();
        int x = 20;
        int a = 2;
        int b = 15;
        numerosA.add(x);
        numerosA.add(a);
        numerosA.add(b);
        
        System.out.println(numerosA.toString());
        
        numerosA.remove(1);
        
        System.out.println(numerosA.toString());
        

        
        
        
        HashSet <Integer> numerosB = new HashSet();
        Integer y = 20;
        int c = 1;
        int d = 25;
        numerosB.add(y);
        numerosB.add(c);
        numerosB.add(d);
        
        System.out.println(numerosB.toString());
        
        numerosB.remove(20);
        
        System.out.println(numerosB.toString());
        
        
        
        
        HashMap <Integer, String> alumnos = new HashMap();
        int dni = 321654897;
        String nombreAlumno = "Pepe";
        int dni1 = 5646876;
        String nombreAlumno1 = "Paco";
        int dni2 = 8664643;
        String nombreAlumno2 = "Juan";
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni1, nombreAlumno1);
        alumnos.put(dni2, nombreAlumno2);
        
        System.out.println(alumnos.toString());
        
        alumnos.remove(dni1);
        
        System.out.println(alumnos.toString());
    }
    
}
