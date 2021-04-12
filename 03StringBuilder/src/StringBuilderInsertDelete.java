/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class StringBuilderInsertDelete {

    public static void main(String[] args) {
        Object object = "hola";
        String cadena = "adios";
        char[] character = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBolean = true;
        char c = 'Z';
        int valorInt = 7;
        long valorLong = 10000000000000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.33;

        StringBuilder sb1 = new StringBuilder("ultimo buffer");
        StringBuilder sb2 = new StringBuilder();

        // insert; permite agregar elementos en la posicion que indiques StringBuilder
        sb2.insert(0, "%n")
                .insert(0, cadena)
                .insert(0, "%n")
                .insert(0, character)
                .insert(0, "%n")
                // No inlcuye el caracter 3
                .insert(0, character, 0, 3)
                .insert(0, "%n")
                .insert(0, c);
        // imprime del ultimo dato al primero porque reemplaza los datos en la posicion 0
        System.out.printf("%n buffer= %s%n", sb2.toString());

        sb2.deleteCharAt(9);
        System.out.printf("%n buffer= %s%n", sb2.toString());
        // Elimina en posiciones
        sb2.delete(2,9);
        System.out.printf("%n buffer= %s%n", sb2.toString());

    }
}
