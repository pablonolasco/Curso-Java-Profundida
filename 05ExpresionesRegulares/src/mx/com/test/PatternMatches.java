/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Windows10
 */
public class PatternMatches {

    public static void main(String[] args) {
        String texto = "this is the text to matches"
                + "for ocurences of the pattern";

        // patron a buscar
        String pattern = ".*is.*";

        boolean matches = Pattern.matches(pattern, texto);

        System.out.println("matches=" + matches);

        // split 
        // Patron o expresion regular
        String pString = "for";
        // compila la expresion
        Pattern pattern1 = Pattern.compile(pString);
        // con base al compilado le pasas el texto para que busque
        String[] split = pattern1.split(texto);
        
        System.out.println("split.length="+split.length);
        
        for(String palabra: split){
            System.out.println(palabra);
        }
        
        // Obtiene el patron
        String pString1=pattern1.pattern();
        System.out.println("patron:"+pString);
        
        // Realiza operaciones de coincidencia
        // Creamos la expresion regular;
        Pattern pattern2=Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        // Comparamos la expresion regular
        Matcher matcher=pattern2.matcher("Jane nacio el 05-12-75 \n"+
                "Dave nacio el 10-12-94 \n");
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
