/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointegrador.repaso;

/**
 *
 * @author FRANCO
 */
public class OrniAzul extends Castor {
    private int propulsion;

    public OrniAzul(int cola, int velocidad,int propulsion) {
        super(cola, velocidad);
        this.propulsion=propulsion;
    }

    
    @Override
    public void nadar(){
        System.out.println("Nadando a "+(super.getVelocidad()*propulsion)+" Km/h con propulsion");
    }

    public int getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(int propulsion) {
        this.propulsion = propulsion;
    }
    
    
        
}
