/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class StringBuilderAppend {

    public static void main(String[] args) {
      Object object="hola";
      String cadena="adios";
      char [] character={'a','b','c','d','e','f'};
      boolean valorBolean=true;
      char c='Z';
      int valorInt=7;
      long valorLong=10000000000000000L;
      float valorFloat=2.5f;
      double valorDouble=33.33;
      
      StringBuilder sb1= new StringBuilder("ultimo buffer");
      StringBuilder sb2= new StringBuilder();
      
      // append; permite agregar elementos al final del StringBuilder
      sb2.append(object)
              .append("%n")
              .append(cadena)
              .append("%n")
              .append(character)
              .append("%n")
              // No inlcuye el caracter 3
              .append(character,0,3)
              .append("%n")
              .append(c)
              .append("%n")
              .append(valorBolean)
              .append("%n")
              .append(valorInt)
              .append("%n")
              .append(valorLong)
              .append("%n")
              .append(valorFloat)
              .append("%n")
              .append(valorDouble)
              .append("%n")
              .append(sb1)
              ;
      
      System.out.printf("%n buffer= %s%n",sb2.toString());
      
      String cadena1="hola1";
      String cadena2="hola2";
      
      // Concatenacion
      StringBuilder s= new StringBuilder().append(cadena1).append(" ").append(cadena2);
      
      StringBuilder s3= new StringBuilder().append(s).append("!");
      System.out.printf("%n buffer= %s%n",s3.toString());
      
      

    }
}
