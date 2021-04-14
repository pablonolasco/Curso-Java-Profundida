/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.shuflle;

import java.util.*;

/**
 *
 * @author Windows10
 */
public class MazoCartas {

    private List<Carta> cartas;

    public MazoCartas() {
        Carta[] mazo = new Carta[52];
        int cuenta = 0; // numero de cartas

        for (Carta.Palo palo : Carta.Palo.values()) {
            for (Carta.Cara cara : Carta.Cara.values()) {
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            }
        }
        
        cartas=Arrays.asList(mazo);
        // revolver u ordenar de manera aleatoria
        Collections.shuffle(cartas);
    }
    
    public void imprimirCartas(){
        for (int i = 0; i < cartas.size(); i++) {
            System.out.printf("%-23s%s",cartas.get(i),((i+1)%4==0?"\n":""));
        }
    }
    
    public static void main(String[] args) {
        MazoCartas cartas= new MazoCartas();
        cartas.imprimirCartas();
    }

}
