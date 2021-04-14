/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.queue;

import java.util.PriorityQueue;

/**
 *
 * @author Windows10
 */
public class PruebaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Double> cola= new PriorityQueue<>();
        
        // inserta elementos en la cola
        
        cola.offer(3.4);
        cola.offer(4.9);
        cola.offer(3.8);
        cola.offer(3.2);
        
        while (cola.size()>0) {            
            
            System.out.println("elemento:"+cola);
            
            // obtienes el elemento que esta al inicio de la fila
            System.out.println("peek:"+cola.peek());
            
            // elimina elemento
            System.out.println("poll:"+cola.poll());
        }
        
        System.out.println("");
    }
}
