/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class StringBuilderCapacidadLen {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hola, como estas?");
        
        // El metodo length proporciona el tamaño de la cadena de caracteres contenida en ese momento
        // en el objeto StringBuilder
        // Capacity; proporciona la capacidad de almacenamiento del StringBuilder declarado
        System.out.printf("Buffer = %s%nlongitud = %d%ncapacidad = %d%n", sb1.toString(), sb1.length(), sb1.capacity());
        // 17+16=33
        // asignar nueva capacidad
        sb1.ensureCapacity(75);
        System.out.printf("Nueva capacidad =%d%n%n", sb1.capacity());

        // asignar nueva longitud
        sb1.setLength(10);
        System.out.printf("Nueva longitud =%d%nbuffer =%s%n", sb1.length(), sb1.toString());

    }
}
