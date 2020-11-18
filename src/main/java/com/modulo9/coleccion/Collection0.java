/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Collection0 {
    public static void main(String[] args) {
        //ARRAY
        //1. ADMITEN TIPOS DE PRIMITIVOS Y OBJETOS
        //2. AL CREARLO DEBO INDICAR EL TAMAÑO Y NO CAMBIA NUNCA
        //3. AÑADIR UN ENTERO EN UNA POSICION VALIDA
        //4. SE IMPRIME LOS VALORES
        int[] notas;//DECLARACION
        boolean cod=false;
        notas = new int[5];
        notas[0] = 24;
        for(int array: notas){
            System.out.println(array);
        }
        notas[1] = 45;
        notas[2] = 55;
        System.out.println("Tamaño de lista="+notas.length);
        for(int array: notas){
            if(array == 42){
                cod = true;
            }
            else{
                cod = false;
            }
        }
        System.out.println("Esta el 42 en la lista="+cod);
         //COLECCION ARRAYLIST
        //1.SOLO ADMITE OBJETOS
        //2.CREA UNA COLECCION QUE ADMITE TODOS LOS ELEMENTOS3.
        //3.SE COMPRUEBA SI ESTA VACIO
        //4.SE AGREGA EN UNO DE LOS METODOS INTERNOS, SIN PREOCUPARSE DE LA POSICION
        //5.SE IMPRIME LOS VALORES
        //6.TAMAÑO DE LISTA
        //7.SE ENCUENTRA UN NUMERO ESPECIFICO
        ArrayList<Integer> notasList;//DECLARACION
        notasList = new ArrayList<Integer>();
        
        System.out.println("¿vacio? = " + notasList.isEmpty());
        notasList.add(24);
        for(int lista: notasList){
            System.out.println(lista);
        }
        notasList.add(45);
        notasList.add(55);
        System.out.println("Tamaño de lista="+notasList.size());
        System.out.println("Esta el 42 en la lista="+notasList.contains(42));
        System.out.println("Eliminando el 45 = " + notasList.remove(new Integer(45)));
    }
}
