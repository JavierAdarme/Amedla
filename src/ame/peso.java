/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame;

import java.time.LocalDateTime;

/**
 *
 * @author Juan Camilo
 */
public class peso {

    // instance variables - replace the example below with your own
    private double pesoAnimal;
    private LocalDateTime now;

    /**
     * Constructor for objects of class peso
     */
    public peso(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
        now = LocalDateTime.now();
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }
}
