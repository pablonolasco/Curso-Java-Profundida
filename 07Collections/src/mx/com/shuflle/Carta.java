/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.shuflle;

/**
 *
 * @author Windows10
 */
public class Carta {

    public static enum Cara {

        AS, Dos, Tres, Cuatro, XXX
    };

    public static enum Palo {

        Bastos, Diamantes, Corazones, Espadas
    };

    private final Cara cara;
    private final Palo palo;

    public Carta(Cara cara, Palo palo) {
        this.cara = cara;
        this.palo = palo;
    }

    public Cara getCara() {
        return cara;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", cara,palo);
    }
    
    
}
