/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.conceptos.basicos;

import uno.conceptos.basicos.arreglos.LibroCalificaciones;

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
       int [][]arregloCal={
           {10,8,9},
           {7,8,9},
           {10,8,9},
           {8,8,9},
           {7,8,9},
           {5,8,9},
           {8,8,9},
           {9,8,9},
           {7,8,9},
           {10,8,9},
       };
       
        LibroCalificaciones libroCalificaciones= new LibroCalificaciones("Español", arregloCal);
        System.out.printf("Bienmvenido al libro de calificaciones de español"
                + " %n%s%n%n",libroCalificaciones.getNombreCurso());
        libroCalificaciones.procesarInformacion();
    }
    
    public void repaso(){
         int []c={1,2,3,4,5,6,7,8,9,10};
        int [][]bidimensional={
            {0,1,2},
            {3,4},
            {5,6},
            {7,8},
            {9,10}};
        int [] d= new int[6];
        int a=1,b=3;
        System.out.println("valor:"+c[a+b]);
        for (int e : d) {
            System.out.println(e);
        }
        
        //bidimensional[0][1];
        
        for (int fila = 0; fila < bidimensional.length; fila++) {
            for (int columna = 0; columna < bidimensional[fila].length; columna++) {
                System.out.println(fila+"-"+columna+"="+bidimensional[fila][columna]);
            }
        }
    }
}
