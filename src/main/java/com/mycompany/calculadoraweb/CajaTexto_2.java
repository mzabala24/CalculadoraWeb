/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraweb;

import javax.faces.bean.ManagedBean;


/**
 *
 * @author f212
 */
@ManagedBean
public class CajaTexto_2 {

    /**
     * Creates a new instance of CajaTexto_2
     */
    String nombre="pablo";
    public CajaTexto_2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void enviar(){}
    
}
