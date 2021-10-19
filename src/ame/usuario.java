/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Juan Camilo
 */
public class usuario {

    // instance variables - replace the example below with your own
    private String nombre, apellido, contrasena, tipoUsuario;
    private LocalDateTime fechaRegistroActividad;
    private ArrayList<usuario> usuarios = new ArrayList<usuario>();
    private ArrayList<tarea> tareas = new ArrayList<tarea>();

    public usuario() {

    }
    
    public void llenaUsers(){
        usuarios.add(new usuario("Clark", "Kent", "Super", "Jefe"));
        usuarios.add(new usuario("Natasha", "Romanoff", "Black", "Jefe"));
        usuarios.add(new usuario("Ghost", "Rider", "Sure", "Empleado"));
        usuarios.add(new usuario("Tránsito", "María", "cono123", "Empleado"));
    }

    public usuario(String nombre, String apellido, String contraseña, String tipoUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contraseña;
        this.tipoUsuario = tipoUsuario;
        fechaRegistroActividad = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contrasena;
    }

    public LocalDateTime getFechaRegistroActividad() {
        return fechaRegistroActividad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public void setFechaRegistroActividad(LocalDateTime fechaRegistroActividad) {
        this.fechaRegistroActividad = fechaRegistroActividad;
    }

    public ArrayList<usuario> getUsuarios() {
        llenaUsers();
        return usuarios;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    
}
