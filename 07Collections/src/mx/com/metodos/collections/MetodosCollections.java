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
public class MetodosCollections {
    public static void main(String[] args) {
        Character[] character={'a','b','c'};
        List<Character> lista=Arrays.asList(character);
        System.out.println("Lista contiene");
        imprimir(lista);
        
        // invierte y muestra el objeto
        Collections.reverse(lista);
        System.out.println("Despues de llamar a reverse, lista contiene");
        imprimir(lista);
        
        Character [] copy= new Character[lista.size()];
        List<Character> copiaList= Arrays.asList(copy);
        
        // copia el contenido de la lista
        Collections.copy(copiaList, lista);
        System.out.println("Despues de copiar");
        imprimir(lista);
        
        // llena la lista con letras R
        Collections.fill(lista,'R');
        System.out.println("Despues de llenar");
        imprimir(lista);
    }

    private static void imprimir(List<Character> lista) {
       lista.forEach((elemento)->{
           System.out.println(elemento);
       });
       
        System.out.printf("%nMax: %s",Collections.max(lista));
        System.out.printf(" Min: %s",Collections.min(lista));
    }
}
