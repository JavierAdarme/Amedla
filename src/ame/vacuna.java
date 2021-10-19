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
public class vacuna {

    // instance variables - replace the example below with your own
    private String nombre;
    private double cantidadAdministrada;
    private LocalDateTime fechaRegistro;

    public vacuna(String nombre, double cantidadAdministrada) {
        fechaRegistro = LocalDateTime.now();
        this.nombre = nombre;
        this.cantidadAdministrada = cantidadAdministrada;
    }

    public LocalDateTime getfechaRegistro() {
        return fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidadAdministrada() {
        return cantidadAdministrada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadAdministrada(double cantidadAdministrada) {
        this.cantidadAdministrada = cantidadAdministrada;
    }
}
