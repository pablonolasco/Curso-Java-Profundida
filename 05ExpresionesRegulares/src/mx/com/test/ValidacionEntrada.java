/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.test;

/**
 *
 * @author Windows10
 */
public class ValidacionEntrada {
    
    // Valida el primer nombre
    public static boolean validarPrimerNombre(String primerNombre){
        // Letra inicial en mayuscula, despues 0 o mas de una letra 
        return primerNombre.matches("[A-Z][a-zA-Z]*");
        
    }
    // Valida apellido
    public static boolean validarApellido(String apellido){
        // Letra en mayuscula o minuscula 1 o mas veces del primer conjunto
        // (['-][a-zA-Z]+) Puede tener ' o - y despues 1 o mas digitos del primero conjunto
        // * 0 o mas
        return apellido.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
        
    }
    // Valida direccion
    public static boolean validarDireccion(String direccion){
        // Un digito o mas
        // Un espacio o tabulador
        // | indicia una operacion or 
        // ([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]) se puede cumplir el de lado izq o der
        // 1 calle  o 1 baker street
        return direccion.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z])");
        
    }
    // Valida ciudad
    public static boolean validarCiudad(String ciudad){
        // Se cumple con lo de un lado u otro
        // cdmx o los angeles
        return ciudad.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
        
    }
    // Valida estado
    public static boolean validarEstado(String estado){
        return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
        
    }
    // Valida codigo postal
    public static boolean validarCP(String postal){
        return postal.matches("\\d{5}");
        
    }
       // Valida telefono
    public static boolean validarTelefono(String telefono){
        // 1 al 9 
        // 800- 998-0123
        return telefono.matches("\\[1-9]d{2}-[1-9]\\d{2}-\\d{4}");
        
    }
}
