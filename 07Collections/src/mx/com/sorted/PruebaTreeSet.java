/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sorted;

import java.util.SortedSet;
import java.util.*;

/**
 *
 * @author Windows10
 */
public class PruebaTreeSet {

    public static void main(String[] args) {
        String[] colores = {"verde", "amarillo", "rojo", "azul", "naranja"};
        SortedSet<String> arbol = new TreeSet<>(Arrays.asList(colores));// treeSet ordena
        
        System.out.println("Conjunto ordenado");
        imprimirConjuntoArbol(arbol);
        System.out.println("");
        // obtiene subconjunto menor a inicial de naranja medante hedSet con base a naranja
        System.out.print("headSet (naranja)");
        imprimirConjuntoArbol(arbol.headSet("naranja"));
        // obtiene subconjunto mayor a inicial de naranja medante hedSet con base a naranja
        System.out.print("headSet (naranja)");
        imprimirConjuntoArbol(arbol.tailSet("naranja"));
        
        System.out.println("primero:"+arbol.first());
        System.out.println("ultimo:"+arbol.last());
    }

    private static void imprimirConjuntoArbol(SortedSet<String> arbol) {
       arbol.forEach((element)->{
           System.out.println(element);
       });
    }
}
