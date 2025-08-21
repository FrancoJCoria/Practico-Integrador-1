/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointegrador.repaso;

/**
 *
 * @author FRANCO
 */
public class Castor {

    private int cola;
    private int velocidad;

    public Castor(int cola, int velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public void nadar() {
        System.out.println("Nadando a " + velocidad + " Km/h ");
    }

    public void tocarGuitarra() {
        int contador = 0;
        while (contador < 3) {
            int cuerda = (int) (Math.random() * 6) + 1;
            System.out.println("Tocando cuerda " + cuerda);
            contador++;
        }
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
