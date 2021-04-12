
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class SMetodosStaticChar {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un caracter:");
        String entrada=leer.next();
        // Obtiene el caracter de entrada
        char c= entrada.charAt(0);
        
        System.out.printf("esta definido %s%n",Character.isDefined(c));
        System.out.printf("esta definido %s%n",Character.isDigit(c));
        System.out.printf("esta en primero caracracter de un identificador de java %s%n",Character.isJavaIdentifierStart(c));
        System.out.printf("esta parte  identificador de java %s%n",Character.isJavaIdentifierPart(c));
        System.out.printf("esta definido letra %s%n",Character.isLetter(c));
        System.out.printf("esta definido letra o digito %s%n",Character.isLetterOrDigit(c));
        System.out.printf("esta definido minuscula %s%n",Character.isLowerCase(c));
        System.out.printf("esta definido  mayuscula %s%n",Character.isUpperCase(c));
        System.out.printf("conversion de digito a caracter %s%n",Character.forDigit(10,16));
        System.out.printf("conversion de caracter a digito %s%n",Character.digit('A',16));
    }
}
