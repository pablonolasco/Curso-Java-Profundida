/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class StringBuilderChar {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hola todos");

        System.out.printf("Buffer = %s%n", sb1.toString());

        System.out.printf("Caracter en 0 = %s%nCaracter en 3 = %s%n%n", sb1.charAt(0), sb1.charAt(3));
        
        char [] character= new char[sb1.length()];
        
        // Copia el StringBuilder en un arreglo de caracteres
        sb1.getChars(0, sb1.length(), character, 0);
        
        System.out.println("Los caracteres son:");
        for(char caracter: character){
            System.out.print(caracter);
        }
        
        sb1.setCharAt(0, 'L');
        sb1.setCharAt(7, 'L');
        
        System.out.printf("%nbuffer= %s",sb1.toString());
        
        sb1.reverse();
        System.out.printf("%nbuffer= %s%n",sb1.toString());
       
    }
}
