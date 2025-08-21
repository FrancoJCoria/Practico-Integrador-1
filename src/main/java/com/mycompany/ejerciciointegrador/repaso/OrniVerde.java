/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointegrador.repaso;

import java.util.Scanner;

/**
 *
 * @author FRANCO
 */
public class OrniVerde extends Castor implements Pata {
    
    Scanner consola=new Scanner(System.in);
    public OrniVerde(int cola, int velocidad) {
        super(cola, velocidad);
    }
    
    
    
    
    

    @Override
    public void tocarOrgano() {
        System.out.println("Tocando Organo...");
        System.out.println("DO-RE-MI");
        System.out.println("Ingrese una tecla...");
        consola.nextLine();
        System.out.println("FA-SOL-LA-SI");
    }
    
    public void tocarGuitorgan(){
        System.out.println("Tocando guitorgan...");
        super.tocarGuitarra();
        tocarOrgano();
        System.out.println("cuac cuaac ...!");
    
    }
    
    
    
}
