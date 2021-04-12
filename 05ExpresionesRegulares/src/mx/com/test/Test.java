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
public class Test {
    public static void main(String[] args) {
        // https://www.regexplanet.com/advanced/java/index.html
        /*
            "\." escape punto
            "\w" para letras, equivalente "[a-zA-Z]"
            "\W" para no letras, equivalente "[^a-zA-Z]"
            "\d" para digitos, equivalente "[0-9]"
            "\D" para no digitos, equivalente "[^0-9]"
            "\s" para espacios en blanco(espacios, tabuladores, etc)"
            "\S" para no espacios en blanco(espacios, tabuladores, etc)"
            "hola" contiene "\w" pero no "\D" y "\S"
            "3 tigres" contiene "\d" y tambien "\w" y "\s" 
            "\d\d\d" = "[0-9][0-9][0-9]" = "123"
            "\d{3,5}" = "123" ok
            "\d{3,5}" = "12" no ok
            "a{3,5}" = "aaa" ok
            "a{3,5}" = "a" no ok
            "d{5}" = "12345" c.p
            "a{,5}" = "12345" debe de haber entre 0 y 5
            "a{5,}" = "12345" debe de haber entre 5 o mas
            "a{0,}" = "12345" debe de haber entre 0 o mas
            "a{0,1}" = "12345" debe de haber entre 0 y uno
            * equivale a 0 o mas veces {0,}
            + equivale a uno o mas veces {1,}
            ? equivale a una o ninguna vez {0,1}
            "123456" coincide con "\d+"
            "abc" coincide con "\d*" de 0 a mas digitos
            "abc" y "abc1" contiene "\d?" de 0 a mas digitos
            "[^@]+@[^@]+\.[a-zA-Z]{2,}"
            [^@]+=pablo
            @=@
            [^@]+=gmail
            \.=.
            [a-zA-Z]{2,}= .com tiene 3 digitos
        
        */
        String respuesta;
        respuesta=(ValidacionEntrada.validarPrimerNombre("pablo"))?
                "Nombre Valido":"Nombre Invalido";
        System.out.println(respuesta);
        
        respuesta=(ValidacionEntrada.validarApellido("Nolasco"))?
                "Apellido Valido":"Apellido Invalido";
        System.out.println(respuesta);
        
        respuesta=(ValidacionEntrada.validarDireccion("1 gam"))?
                "Direccion Valido":"Direccion Invalido";
        System.out.println(respuesta);
        
        respuesta=(ValidacionEntrada.validarCiudad("pablo"))?
                "Ciudad Valido":"Ciudad Invalido";
        System.out.println(respuesta);
        
        respuesta=(ValidacionEntrada.validarEstado("pablo"))?
                "Estado Valido":"Estado Invalido";
        System.out.println(respuesta);
        
        respuesta=(ValidacionEntrada.validarCP("pablo"))?
                "CP Valido":"CP Invalido";
        System.out.println(respuesta);
        
        respuesta=(ValidacionEntrada.validarTelefono("pablo"))?
                "Telefono Valido":"Telefono Invalido";
        System.out.println(respuesta);
        
    }
}
