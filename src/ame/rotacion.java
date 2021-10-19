/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame;

import java.util.ArrayList;

/**
 *
 * @author Juan Camilo
 */
public class rotacion {

    private String nombre;
    private int numeroPotreros;
    private double tamanoRotacion;
    private ArrayList<potrero> pot = new ArrayList<potrero>();
    private ArrayList<rotacion> rot = new ArrayList<rotacion>();
    private ArrayList<usuario> actualizaciones = new ArrayList<usuario>();

    public rotacion() {

    }
//Constructor for objects of class Rotacion

    public rotacion(String nombre, int numeroPotreros, double tamanoRotacion) {
        // initialise instance variables
        this.nombre = nombre;
        this.numeroPotreros = numeroPotreros;
        this.tamanoRotacion = tamanoRotacion;
    }

    
    public void llenaRot() {
        rot.add(new rotacion("Vientos", 5, 358));
        rot.add(new rotacion("Marianas", 2, 123));
        rot.add(new rotacion("Vientos", 5, 452));
        rot.add(new rotacion("Ojitos", 8, 643));
        rot.add(new rotacion("Teleferico", 4, 234));
        rot.add(new rotacion("Enfermería", 1, 17));

    }

    public ArrayList<rotacion> getRot() {
        llenaRot();
        return rot;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroPotreros() {
        return numeroPotreros;
    }

    public double getTamanoRotacion() {
        return tamanoRotacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroPotreros(int numeroPotreros) {
        this.numeroPotreros = numeroPotreros;
    }

    public void setTamanoRotacion(double tamanoRotacion) {
        this.tamanoRotacion = tamanoRotacion;
    }
}
