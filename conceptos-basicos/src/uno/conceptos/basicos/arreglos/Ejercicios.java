/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.conceptos.basicos.arreglos;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ejercicios {

    // Eliminación de duplicados
    public static void duplicados() {
        // Escriba  una  aplicación  que  reciba  como  entrada  cinco  números, 
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int numeros[] = new int[5];
        int auxNumeros[] = new int[0];
        int j = 0;

        do {
            System.out.println("Ingresa numero " + (j + 1));
            num = leer.nextInt();
            if (num >= 10 && num <= 100) {
                if (!(validarDuplicados(num, numeros))) {
                    numeros[j] = num;
                    j++;
                    auxNumeros = null;
                    auxNumeros = new int[j];
                    asignarValores(auxNumeros, numeros);
           
                }

            } else {
                System.out.println("Ingresa un numero entre 10 y 100");
            }

        } while (!(num >= 10 && num <= 100) || j < 5);

    }

    public static boolean validarDuplicados(int digito, int... numeros) {
        boolean existe = false;
        for (int numero : numeros) {
            if (numero == digito) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public static void asignarValores(int []auxNumeros,int []numeros){
        System.arraycopy(numeros, 0, auxNumeros, 0, auxNumeros.length);
        for (int auxNumero : auxNumeros) {
            System.out.print(auxNumero + " ");
        }
        System.out.println("");
    }

}
