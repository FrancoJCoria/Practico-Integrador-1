/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciointegrador.repaso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FRANCO
 */
public class EjercicioIntegradorRepaso {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {

            //Punto 1
            int velocidad;
            int cola;
            int propulsion;
            //GRUPO 7
            System.out.println("Ingrese la longitud de la cola (en Entero)");
            cola = consola.nextInt();
            do {
                System.out.println("Ingrese la velocidad (Hasta 8 Km/h)");
                velocidad = consola.nextInt();
            } while (velocidad < 1 || velocidad > 8);

            OrniVerde grupo7 = new OrniVerde(cola, velocidad);

            System.out.println("Ingrese la longitud de la cola (en Entero) de BLUE");
            cola = consola.nextInt();
            do {
                System.out.println("Ingrese la velocidad (Hasta 8 Km/h) de BLUE");
                velocidad = consola.nextInt();
            } while (velocidad < 1 || velocidad > 8);

            do {
                System.out.println("Ingrese la propulsion (de 5 a 10 Km/s) de BLUE");
                propulsion = consola.nextInt();
            } while (propulsion < 5 || propulsion > 10);

            //BLUE
            OrniAzul blue = new OrniAzul(cola, velocidad, propulsion);

            //BLUI
            System.out.println("Ingrese la longitud de la cola (en Entero) de BLUI");
            cola = consola.nextInt();
            do {
                System.out.println("Ingrese la velocidad (Hasta 8 Km/h) de BLUI");
                velocidad = consola.nextInt();
            } while (velocidad < 1 || velocidad > 8);

            do {
                System.out.println("Ingrese la propulsion (de 5 a 10 Km/s) de BLUI");
                propulsion = consola.nextInt();
            } while (propulsion < 5 || propulsion > 10);

            OrniAzul blui = new OrniAzul(cola, velocidad, propulsion);

            grupo7.tocarGuitorgan();
            grupo7.tocarOrgano();

            blue.nadar();
            blui.nadar();
            grupo7.nadar();

            //Punto 2 
            try {
                Castor hermanosOrni[] = new Castor[3];
                hermanosOrni[0] = grupo7;
                hermanosOrni[1] = blue;
                hermanosOrni[2] = blui;

                List<OrniAzul> lista_nadadores = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                    if (hermanosOrni[i] instanceof OrniAzul) {
                        lista_nadadores.add((OrniAzul) hermanosOrni[i]);
                    }
                }
                

                Iterator<OrniAzul> it = lista_nadadores.iterator();
                
                 //Punto3
        Comparator<OrniAzul> ordenarPorPropulsion= new Comparator<OrniAzul>() {
            @Override
            public int compare(OrniAzul o1, OrniAzul o2) {
                return Double.compare(o1.getPropulsion(), o2.getPropulsion());
            }
        };
        
               for(OrniAzul o : lista_nadadores){
                   System.out.println("Cola : "+o.getCola()+" - Velocidad: "+o.getVelocidad()+" - Propulsion: "+o.getPropulsion());
               }

            

                

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error! " + e.getMessage());
            } finally {
                System.out.println("Los ornitohermanos estan juntos al fin...");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error! " + e.getMessage());
        }

    }
}
