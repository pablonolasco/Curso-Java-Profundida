/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.metodos.collections;
import java.util.*;
/**
 *
 * @author Windows10
 */
public class MetodosCollections2 {
    public static void main(String[] args) {
        String [] colores= {"verde","amarillo","rojo","azul","rojo"};
        List<String>lista1=Arrays.asList(colores);
        ArrayList<String>lista2=new ArrayList<>();
        lista2.add("verde");
        lista2.add("rojo");
        lista2.add("amarillo");
        
        System.out.println("Lista 2");
        for (String lista21 : lista2) {
            System.out.println(lista21);
        }
        
        // copia los colores de arreglo colores a lista2
        Collections.addAll(lista2, colores);
        
        System.out.println("");
        System.out.println("Lista 2 despues de addAll");
        for (String lista21 : lista2) {
            System.out.println(lista21);
        }
        
        int frecuencia= Collections.frequency(lista2, "rojo");
        System.out.println("frecuencia:"+frecuencia);
        
        // comprueba si lista1 y lista 2 elementos en comun
        boolean exist=Collections.disjoint(lista1, lista2);
        System.out.println("tienen elementos en comun:"+exist);
        
    }
    
}
