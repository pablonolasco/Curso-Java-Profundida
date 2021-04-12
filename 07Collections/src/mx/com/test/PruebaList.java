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
        String [] colores={"verde","amarillo","rojo","blanco","azul"};
        List<String>lista= new LinkedList<>();
        for(String color: colores){
            lista.add(color);
        }
        // Array de colores elim
        String [] coloresElim={"blanco","azul"};
        List<String>listaElim= new LinkedList<>();
        for(String color: coloresElim){
            listaElim.add(color);
        }
        
        lista.forEach((color)->{
            System.out.println("color:"+color);
        });
        
        
        
    }
}
