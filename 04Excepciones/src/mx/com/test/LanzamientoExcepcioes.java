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
public class LanzamientoExcepcioes {
    public static void main(String [] args){
        try {
            lanzarExcepcion(0);
        } catch (Exception e) {
            System.err.println("La exepcion se manejo en el main");
            System.err.println(e);
        }
        noLanzaExcepcion();
    }

    private static void lanzarExcepcion(int numero) throws Exception{
        if (numero<=0) {
            throw new Exception("El numero debe de ser mayor a 0");
        }
        
//        try {
//            System.out.println("Metodo lanzaExcepcion");
//            // Lanza execpcion
//            throw new  Exception();
//        } catch (Exception e) {
//            System.err.println("La excepcion se manejo en el metodo lanzarExcepcion");
//            throw e;// Vuelve a lanzar la excepcion
//        }
        
    }

    private static void noLanzaExcepcion() {
        try {
            System.out.println("Metodo nolanzaExcepcion");
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            System.out.println("Se ejecuto finally nolanzaExcepcion");
    
        }
        
        System.out.println("Fin metodo nolanzaExcepcion");
    }
}
