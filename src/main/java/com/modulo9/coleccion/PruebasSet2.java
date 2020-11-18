/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class PruebasSet2 {
    public static void main(String[] args) {
        //NO PERMITE DUPLICADO 
        //1.HASHSET - LISTA NO ORDENADA
        System.out.println("----------------HASHSET-----------------");
        Set notas = new HashSet();
        notas.add(new Integer(5));
        notas.add(new String("BOCADILLO"));
        notas.add(new Date(14,04,1999));
        notas.add(new Boolean(true));
        //1.1 HASHSET - LISTA NO ORDENADA CON UN TIPO DE DATO ESPECIFICO
        //2.IMPRESION DE REGISTRO
        Set<String> registro = new HashSet<String>();
        registro.add("Pablo");
        registro.add("Pablo");
        registro.add("UBERSpecial");
        registro.add("PHP");
        registro.add("Luis");
        registro.add("Fontanero");
        registro.add("Revista");
        registro.add("C2B");
        
        for(String lista: registro){
            System.out.println(lista);
        }
        System.out.println("--------------LINKEDHASHSET-------------------");
        //1.LINKEDHASHSET - por orden de inserccion
        Set<String> nombre = new LinkedHashSet<String>();
        nombre.add("Pablo");
        nombre.add("Pablo");
        nombre.add("UBERSpecial");
        nombre.add("PHP");
        nombre.add("Luis");
        nombre.add("Luis");
        nombre.add("Fontanero");
        for(String lista: nombre){
            System.out.println(lista);
        }
        System.out.println("---------------TREESET------------------");
        //1.TREESET - LISTA ORDENADA
        Set<String> arbol = new TreeSet<String>();
        arbol.add("TOMATE");
        arbol.add("PATATA");
        arbol.add("BILLETE");
        arbol.add("RADIO");
        arbol.add("RADIO");
        arbol.add("PAIS");
        for(String lista: arbol){
            System.out.println(lista);
        }
        System.out.println("---------------------------------");
    }
}
