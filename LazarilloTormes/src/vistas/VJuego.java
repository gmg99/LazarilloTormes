/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.ContrJuego;
import trabajodi.Logica;

/**
 *
 * @author Guille
 */
public class VJuego {
    private ContrJuego controlador;

    public VJuego(Logica logica) {
        controlador=new ContrJuego(this, logica);
    }
    
}
