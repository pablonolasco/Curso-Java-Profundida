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
public class PruebaCollections {

    public static void main(String[] args) {
        String colores[] = {"verde", "amarillo", "rojo", "azul"};

        List<String> lista = new ArrayList<>();

        for (String color : colores) {
            // add aggrega elementos a la lista
            lista.add(color);
        }

        // Arreglo de eliminicacion
        String coloresElim[] = {"verde", "amarillo"};
        // Objeto para eliminacion
        List<String> listaElim = new ArrayList<>();
        for (String color : coloresElim) {
            listaElim.add(color);
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("color:" + lista.get(i));
        }
        eliminarColores(lista, listaElim);
        System.out.println("Array nuevo:");
        lista.forEach((element)->{
            System.out.println("Color:"+element);
        });
    }

    private static void eliminarColores(Collection<String> lista, Collection<String> listaElim) {
        // obtiene el iterator de la colecion de la que esta asociado
        Iterator iterator = lista.iterator();
        // itera elementos mendiante hasnext y regresa true si tiene elementos a leer
        while (iterator.hasNext()) {
            // next obtener la referencia al siguiente elemento
            // contains metodo que contiene
            if (listaElim.contains(iterator.next())) {
                // Se llama al metodo remove iterator para eliminar el elemento del objeto
                iterator.remove();
            }
        }
    }
}
