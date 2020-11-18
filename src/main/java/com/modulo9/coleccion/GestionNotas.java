/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class GestionNotas {
    public static void CrearListaAsistenciaAlumnos(Set<AlumnoCollection> alumnos){
        System.out.println("------------------------------------------------");
        System.out.println("LISTADO DE ASISTENCIA");
        for(AlumnoCollection a: alumnos){
            System.out.println(a.getDni() + "-" + a.getNombre());
        }
    }
    
    public static void CrearListaAsistenciaAlumnos2(TreeSet<AlumnoCollection2> alumnos){
        System.out.println("------------------------------------------------");
        System.out.println("LISTADO DE ASISTENCIA");
        for(AlumnoCollection2 a: alumnos){
            System.out.println(a.getDni() + "-" + a.getNombre());
        }
    }

}
