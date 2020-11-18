/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PruebaColeccionesList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //LIST - PERMITE DUPLICADOS GGP
        System.out.println("----------LIST-----------------");
        List<String> nombreList = new ArrayList<String>();
        nombreList.add("JULIA");
        nombreList.add("MARGARITA");
        nombreList.add("LAURA");
        nombreList.add("Clemencia");
        for(int pos = 0; pos < nombreList.size(); pos++){
            System.out.println(nombreList.get(pos));
        }
        System.out.println("----------------------------------");
        for(String lista: nombreList){
            System.out.println(lista);
        }
        System.out.println("----------------------------------");
//        System.out.println("Añadiendo otro en la posicion 7 (EXAMPLE TMCL0) ");
//        nombreList.add(7, "Rosa");
//        for(String lista: nombreList){
//            System.out.println(lista);
//        }
        System.out.println("Añadir en el medio");
        nombreList.add(1,"Belen");
        for(String lista: nombreList){
            System.out.println(lista);
        }
        
        //key no ordenado - HASHMAP
        //KEY ordenado por insercion - LinkedHashSet
        //Key ordenado - TREESET
    }
    
}
