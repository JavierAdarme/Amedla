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
public class enfermedad {

    private String nombreEnfermedad, comentarios;
    private LocalDateTime fechaRegistro;

    public enfermedad(String nombreEnfermedad, String comentarios) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.comentarios = comentarios;
        fechaRegistro = LocalDateTime.now();
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
