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
public class tarea {

    // instance variables - replace the example below with your own
    private String nombreTarea, descripcionTarea;
    private LocalDateTime fechaAsignacion;
    private String usuarioJefe, usuarioEmpleado;
    private String estadoTarea = "incompleta";
    private Boolean finalizada = false;
    private usuario jefe;
    private usuario empleado;

    
    //Constructor for objects of class Tarea
    
    public tarea(String nombreTarea, String descripcionTarea, LocalDateTime fechaAsignacion) {
        // initialise instance variables
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.fechaAsignacion = LocalDateTime.now();
    }

    //Cambiar estado de tarea, por empleado
    public String cambioEstado() {
        // put your code here
        return estadoTarea;
    }

    //Cambiar estado de finalizacion, por jefe
    public Boolean cambioFinal() {
        // put your code here
        return finalizada;
    }

    //Conocer jefe
    public usuario recibirUsuarioJefe() {
        // put your code here
        return jefe;
    }

    //Conocer empleado
    public usuario recibirUsuarioEmpleado() {
        // put your code here
        return empleado;
    }

}
