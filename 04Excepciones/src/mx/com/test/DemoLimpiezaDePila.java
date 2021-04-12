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
public class DemoLimpiezaDePila {
    public static void main(String[] args) {
        new DemoLimpiezaDePila().metodo1();
    }
    
    public void metodo1(){
        try {
            metodo5();
        } catch (Exception e) {
            System.err.println(e.getMessage()+" pero tratada en metodo1");
        }
    }
    
    public void metodo2() throws Exception{
        try {
             metodo3();
        } catch (Exception e) {
             System.err.println(e.getMessage()+" pero tratada en metodo2");
        }
       
    }
    
    public void metodo3() throws Exception{
        try {
            throw new Exception("Exception generada en metodo3");
        } catch (Exception e) {
             System.err.println(e.getMessage()+" pero tratada en metodo2");
             throw e;
        }
       
    }
    
    public void metodo4() throws Exception{
        metodo2();
    }
    
     public void metodo5() throws Exception{
        metodo4();
    }
}
