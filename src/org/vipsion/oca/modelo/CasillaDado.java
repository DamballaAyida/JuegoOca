/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vipsion.oca.modelo;


public class CasillaDado extends Casilla{
    
    private final int turnosExtra;
    
    public CasillaDado(int posicion) {
        super(posicion);
        this.turnosExtra = 1;
    }
    
    @Override
    public void posaFicha(Ficha ficha) {

    }
    
}
