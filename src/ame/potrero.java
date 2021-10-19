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
public class potrero {

    String nombrepo;
    double tamano;
    private ArrayList<aforo> registroAforo = new ArrayList<aforo>();
    private ArrayList<animal> registroAnimal = new ArrayList<animal>();
    private ArrayList<usuario> registroUsuario = new ArrayList<usuario>();
    private ArrayList<potrero> pot = new ArrayList<potrero>();

    public potrero(String nombrepo, double tamano) {
        this.nombrepo = nombrepo;
        this.tamano = tamano;
    }

    public potrero(){
        
    }
    
     public void llenaPotre() {
        pot.add(new potrero("Vientos1", 15));
        pot.add(new potrero("Vientos2", 20));
        pot.add(new potrero("Marianas1", 30));
        pot.add(new potrero("Teleferico", 54));
        pot.add(new potrero("Diosa", 5));
        pot.add(new potrero("Alumbre", 7.5));

    }
     
    public ArrayList<potrero> getPot() {
        llenaPotre();
        return pot;
    }

    
    public String getNombrepo() {
        return nombrepo;
    }

    public double getTamano() {
        return tamano;
    }

    public void setNombrepo(String nombrepo) {
        this.nombrepo = nombrepo;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
}
