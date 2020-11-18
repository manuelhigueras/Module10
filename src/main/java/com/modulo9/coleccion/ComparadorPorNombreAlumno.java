/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class ComparadorPorNombreAlumno implements Comparator<AlumnoCollection2>{

    @Override
    public int compare(AlumnoCollection2 o1, AlumnoCollection2 o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
