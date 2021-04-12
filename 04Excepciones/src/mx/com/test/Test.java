/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Test {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean condicion=true;
        
        do{
        try {
      
            int numerador, denominador;
            System.out.println("Ingresa numerador:");
            numerador = leer.nextInt();
            System.out.println("Ingresa denominador:");
            denominador = leer.nextInt();
            int resultado = cociente(numerador, denominador);
            System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
            condicion=false;
        } catch (InputMismatchException e) {
            System.err.printf("%nExcepcion: %s%n",e);
            leer.nextLine();
        }catch(ArithmeticException e){
            System.err.printf("%nExcecpcion: %s%n",e);
            System.out.printf("%nCero es un denominador invalido. Intenta de nuevo %n%n");
            
        }finally{
            
        }
        }while (true);

    }

    private static int cociente(int numerador, int denominador) {
        return cociente2(numerador, denominador);
    }

    private static int cociente2(int numerador, int denominador) {
        return cociente3(numerador, denominador);
    }

    private static int cociente3(int numerador, int denominador) {
        return numerador / denominador;
    }
}
