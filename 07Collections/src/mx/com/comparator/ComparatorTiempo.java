/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.comparator;

import java.util.Comparator;

/**
 *
 * @author Windows10
 */
public class ComparatorTiempo implements Comparator<Tiempo> {

    @Override
    public int compare(Tiempo tiempo1, Tiempo tiempo2) {
        int diferenciaHora = tiempo1.getHora() - tiempo2.getHora();
        if (diferenciaHora != 0) {
            return diferenciaHora;
        }

        int diferenciaMinutos = tiempo1.getMinutos() - tiempo2.getMinutos();
        if (diferenciaMinutos != 0) {
            return diferenciaMinutos;
        }
        int diferenciaSegundos = tiempo1.getSegundos() - tiempo2.getSegundos();

        return diferenciaSegundos;

    }

}
