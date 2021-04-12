/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class Test {
    public static void main(String[] args) {
        // Se utilizan solo si va a cambiar constantemente su valor
        
        // El constrcutor sin argumentos tiene una capacidad de 16 caracteres(predeterminado)
        StringBuilder sb1= new StringBuilder();
        
        // Crea un StringBuilder que no contiene caracteres
        // Capacidad inicial de 10, sin embargo si sobrepasas esos 10 caracteres, por 12 ejemplo
        // lo que hace es que te genera el doble de espacio mas 2 mas, es decir 12+12=24+2=26
        StringBuilder sb2= new StringBuilder(10);
        // La capacidad inicial es el numero de caracteres del argumento String, mas 16
        // Si inicialmente tiene 10, da el doble mas 2, es decir 10+10+2=22
        StringBuilder sb3= new StringBuilder("hola");
        
        // Se llama implicitamente el metodo toString de los objetos StringBuilder
        System.out.printf(" buffer %s %n",sb1);
        System.out.printf(" buffer %s %n",sb2);
        System.out.printf(" buffer %s %n",sb3);
        
    }
    
}
