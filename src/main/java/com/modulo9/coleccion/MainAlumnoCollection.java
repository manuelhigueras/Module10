/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class MainAlumnoCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.LISTA HASHSET DE TIPO (CLASE=ALUMNOCOLLECTION)
        //2.SE AGREGA CON SUS METODOS (HASHSET)
        //3.CLASE ESTATICA PARA CREAR LISTA DE ALUMNOS DE TIPO SET ALUMNO
        HashSet<AlumnoCollection> lista = new HashSet<AlumnoCollection>();
        TreeSet<AlumnoCollection2> lista2 = new TreeSet<AlumnoCollection2>(new ComparadorPorNombreAlumno());
        System.out.println("-----------------------------HASHSET/ALUMNOCOLLECTION---------------------------------");
          //NECESITA UN TREESET UN java.lang.Comparable
        lista.add(new AlumnoCollection(111,"Luis"));
        lista.add(new AlumnoCollection(222,"Luis"));
        lista.add(new AlumnoCollection(333,"Maria"));
        lista.add(new AlumnoCollection(444,"Alberto"));
        lista.add(new AlumnoCollection(555,"Mario"));
        lista.add(new AlumnoCollection(666,"GGG"));
        GestionNotas.CrearListaAsistenciaAlumnos(lista);
        System.out.println("------------------------TREESET/ALUMNOCOLLECTION2 CON COMPARADORPORNOMBRE(TERMINATOR)--------------------------------------");
        lista2.add(new AlumnoCollection2(1,"Luis"));
        lista2.add(new AlumnoCollection2(1,"Luis"));
        lista2.add(new AlumnoCollection2(4,"Maria"));
        lista2.add(new AlumnoCollection2(3,"Alberto"));
        lista2.add(new AlumnoCollection2(2,"Mario"));
        lista2.add(new AlumnoCollection2(2,"GGG"));
        lista2.add(new AlumnoCollection2(2,"qqq"));
        GestionNotas.CrearListaAsistenciaAlumnos2(lista2);
        
    }
    
}
