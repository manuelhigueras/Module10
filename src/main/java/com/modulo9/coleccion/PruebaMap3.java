/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author user
 */
public class PruebaMap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MAP - ORGANIZA POR CLAVE / VALOR
        //HASHMAP - NO HAY NINGUN ORDEN 
        //LINKEDHASHMAP - POR ORDEN DE INSERCION
        //TREEMAP - POR ORDEN NATURAL
        //PARA IMPRIMIR TIENE QUE BUSCAR POR KEYS PARA ENTREGAR LOS VALORES
        System.out.println("------------------MAP/HASHMAP---------------------------------");
        Map<String,Double> notas = new HashMap<String,Double>();
        notas.put("Laura", 7.4);
        notas.put("Roberto", 5.9);
        notas.put("Roberto", 9.8);
        notas.put("Clara", 2.5);
        System.out.println("---------------------------------------------------");
        Set<String> keysM2 = notas.keySet();
//        for(int pos=0; pos < notas.size(); pos++){
//            System.out.println(notas.get(keysM2) + ", notas:"+keysM2);
//        }
        System.out.println("---------------------------------------------------");
        Set<String> keysM = notas.keySet(); //HASHSET
        for(String key: keysM){
            System.out.println(key + ", notas: " + notas.get(key));
        }
        System.out.println("------------------MAP/LINKEDHASHMAP---------------------------------");
        //CLAVE - VALOR
        Map<String,Double> notas2 = new HashMap<String,Double>();
        notas2.put("Laura", 7.4);
        notas2.put("Roberto", 5.9);
        notas2.put("Roberto", 9.8);
        notas2.put("Clara", 2.5);
        System.out.println("---------------------------------------------------");
        Set<String> keysM3 = notas2.keySet();
//        for(int pos=0; pos < notas2.size(); pos++){
//            System.out.println(notas.get(keysM3) + ", notas:"+keysM3);
//        }
        System.out.println("---------------------------------------------------");
        Set<String> keys4 = notas2.keySet();//notas2.keySet(); //HASHSET
        for(String key: keys4){
            System.out.println(key + ", notas: " + notas2.get(key));
        }
        System.out.println("---------------------------------------------------");
        Set<Entry<String,Double>> entrada = notas.entrySet();
        for(Entry e: entrada){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        
    }
    
}
