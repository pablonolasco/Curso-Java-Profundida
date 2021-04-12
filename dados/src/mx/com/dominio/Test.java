/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.dominio;

/**
 *
 * @author Windows10
 */
public class Test {

    public static void main(String[] args) {
        int dado1 = 0;
        int dado2 = 0;
        int b[][] = new int[6][6];
        int result = 0;
        for (int i = 0; i < b.length; i++) {
            System.out.println("-----Persona: " + (i + 1)+"-----");
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("lanzamiento " + (j + 1));
                dado1 = (int) Math.round(Math.random() * 6);
                System.out.println("Lanzamiento dado 1:" + dado1);
                dado2 = (int) Math.round(Math.random() * 6);
                System.out.println("Lanzamiento dado 2:" + dado2);
                result = dado1 + dado2;
                b[i][j] = result;
            }
            System.out.println("------------");
            System.out.println("");

        }
        System.out.println("Contenido");
        for (int[] fila : b) {
            for (int lanzamiento : fila) {
                System.out.print(lanzamiento + " ");
            }
            System.out.println("");
        }
    }
}
