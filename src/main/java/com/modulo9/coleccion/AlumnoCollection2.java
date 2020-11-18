/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo9.coleccion;

/**
 *
 * @author user
 */
public class AlumnoCollection2 implements Comparable<AlumnoCollection2>{

    private int dni;
    private String nombre;

    public AlumnoCollection2(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "AlumnoCollection{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }    

    //HASHCODE
    //P1 (X =0, Y=1)
    //P2 (X =0, Y=2)
    //P3 (X =0, Y=1)
    //P4 (X =0, Y=1)
    //1. se agrega con un add
    //2. se compara con un squals
    //3. lo asigna en una pos especifica
    //4. en caso de que esta lleno y tiene el mismo valor se compara con el squals si es igual valor y se agrega en esa misma posicion
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlumnoCollection2 other = (AlumnoCollection2) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    //HASH = HashCode/equals
    //TREESET/TREEMAP = compareTo
    
    @Override
    public int compareTo(AlumnoCollection2 alumno){
        //Negativo menor 
        //cero igual
        //positivo mayor
        if(alumno == null)
            return 0;
        
        return this.dni - alumno.dni;
    }
    
}
