/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.test;

import java.util.Arrays;

/**
 *
 * @author Windows10
 */
public class SustitucionRegex {
    public static void main(String[] args) {
        String primerCadena="Este enunciado termina con 5 estrellas *****";
        String segundaCadena="1, 2, 3, 4, 5";
        
        // Sustituye '*' con '/'
        primerCadena=primerCadena.replaceAll("\\*", "+");
        
        System.out.println("sustitucion:"+primerCadena);
        
        // Sustituye estrellas con ok
        primerCadena=primerCadena.replaceAll("estrellas", "ok");
        
        System.out.println("sustitucion:"+primerCadena);
        
        // Sustituye
        primerCadena=primerCadena.replaceAll("\\w", "ok");
        
        System.out.println("sustitucion:"+primerCadena);
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            segundaCadena=segundaCadena.replaceFirst("\\d", "digito");
        }
        System.out.println("sustitucion segunda cadena:"+segundaCadena);
        System.out.println("Cadena");
        String [] resuStrings=segundaCadena.split(",\\s");// se divide en comas
        System.out.println(Arrays.toString(resuStrings));
        
        
        
    }
}
