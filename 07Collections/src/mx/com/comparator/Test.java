/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.comparator;
import java.util.*;
/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        List<Tiempo> lista= new ArrayList<>();
        lista.add(new Tiempo(4, 24, 34));
        lista.add(new Tiempo(18, 24, 58));
        lista.add(new Tiempo(4, 28, 38));
        
        System.out.println(lista);
        
        // Ordena usando un comparator
        Collections.sort(lista, new ComparatorTiempo());
         
        System.out.println(lista);
        
    }
}
