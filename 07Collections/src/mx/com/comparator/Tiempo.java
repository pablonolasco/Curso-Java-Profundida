/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.comparator;

/**
 *
 * @author Windows10
 */
public class Tiempo {

    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
        this(0, 0, 0);
    }

    public Tiempo(int hora) {
        this(hora, 0, 0);
    }

    public Tiempo(int hora, int minutos) {
        this(hora, minutos, 0);
    }

    public Tiempo(int hora, int minutos, int segundos) {
        if (hora <= 0 || hora >= 24) {
            throw new IllegalArgumentException("hora debe estar entre cero y 23");
        }
        if (minutos <= 0 || minutos >= 60) {
            throw new IllegalArgumentException("minutos debe estar entre cero y 59");

        }
        if (segundos <= 0 || segundos >= 60) {
            throw new IllegalArgumentException("segundos debe estar entre cero y 59");

        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHora(int hora) {
        if (hora <= 0 || hora >= 24) {
            throw new IllegalArgumentException("hora debe estar entre cero y 23");
        }
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        if (minutos <= 0 || minutos >= 60) {
            throw new IllegalArgumentException("minutos debe estar entre cero y 59");

        }
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        if (segundos <= 0 || segundos >= 60) {
            throw new IllegalArgumentException("segundos debe estar entre cero y 59");

        }
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }

}
