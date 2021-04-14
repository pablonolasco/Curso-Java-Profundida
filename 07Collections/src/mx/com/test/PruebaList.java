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
public class PruebaList {

    public static void main(String[] args) {
        // Array de colores
        String[] colores = {"verde", "amarillo", "rojo", "blanco", "azul"};
        List<String> lista = new LinkedList<>();
        for (String color : colores) {
            lista.add(color);
        }
        // Array de colores elim
        String[] coloresElim = {"blanco", "azul"};
        List<String> listaElim = new LinkedList<>();
        for (String color : coloresElim) {
            listaElim.add(color);
        }

        // Concatena las listas
        lista.addAll(listaElim);
        listaElim = null;

        lista.forEach((color) -> {
            System.out.println("color:" + color);
        });

        System.out.println("");

        convertirAMayuscula(lista);

        eliminarColor(lista, 1, 4);

        lista.forEach((color) -> {
            System.out.println("color:" + color);
        });
        System.out.println("");
        imprimirListaInversa(lista);

    }

    private static void eliminarColor(List<String> lista, int inicial, int tope) {

        if (inicial >= 0 && tope <= lista.size()) {
            // sublist toma porcion de la lista
            // Elimina elementos entre el indice inicio y final y este no lo elimina
            lista.subList(inicial, tope).clear();
        }

    }

    private static void convertirAMayuscula(List<String> lista) {
        ListIterator<String> listIterator = lista.listIterator();
        while (listIterator.hasNext()) {
            // obtiene el elemento
            String color = listIterator.next();
            // convierte en mayuscula
            listIterator.set(color.toUpperCase());
        }
    }

    private static void imprimirListaInversa(List<String> lista) {
        // indica posicion a iterar
        ListIterator<String> listIterator = lista.listIterator(lista.size());

        while (listIterator.hasPrevious()) {
            String color = listIterator.previous();
            System.out.println("color:" + color);
        }
    }
}
