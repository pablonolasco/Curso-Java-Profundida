/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.test;
import java.util.*;
/**
 *
 * @author Windows10
 */
public class UsoToArray {
    public static void main(String[] args) {
        String [] lenguajes={"c","c++","java"};
        // Arrays.asList convierte un arreglo en una lista
        LinkedList<String> enlaces= new LinkedList<>(Arrays.asList(lenguajes));
        enlaces.addLast("ruby");
        enlaces.add("phyton");
        enlaces.addFirst("crl");
        
        // obtiene los elementos de la lista y los convierte en arreglo
        lenguajes= enlaces.toArray(new String[enlaces.size()]);
        
        System.out.println("");
        
        for(String data: lenguajes){
            System.out.println(data);
        }
        
    }
}
