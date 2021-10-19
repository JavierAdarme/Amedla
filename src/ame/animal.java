/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Juan Camilo
 */
public class animal {

    /*
    *El estado del animal puede ser: OK, preñada, Enfermo, Vendido o Muerto.
    *El género puede ser M o F.
    *La edad se devuelve solo en años
    *El arreglo de enfermedades guarda un registro de los eventos en que el 
    animal ha estado enfermo.
    *El arreglo de vacuaciones guarda un registro de las vacunas que ha recibido
    el animal.
    *El arreglo de pesos registra todos los pesajes por los que ha pasado el
    animal.
    *El arreglo de actualizaciones registra a los usuarios que han realizado
    cambios a cualquier registro del animal.
     */
    private String identificacion, madre, estado;
    int edad, mes, ano, dia;
    String genero;
    private ArrayList<enfermedad> enfermedades = new ArrayList<enfermedad>();
    private ArrayList<vacuna> vacunaciones = new ArrayList<vacuna>();
    private ArrayList<peso> pesos = new ArrayList<peso>();
    private ArrayList<usuario> actualizaciones = new ArrayList<usuario>();
    private ArrayList<animal> animales = new ArrayList<animal>();
    private usuario usuario1 = new usuario();

    /**
     * Constructor for objects of class animal
     */
    public animal(String identificacion, String madre, String estado, int mes, int ano, int dia, String genero) {
        // initialise instance variables
        this.identificacion = identificacion;
        this.madre = madre;
        this.estado = estado;
        this.edad = 0;
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
        this.genero = genero;
    }

    public animal() {

    }

    public void llenaAnim() {
        animales.add(new animal("abc", "compra", "ok", 3, 1996, 22, "F"));
        animales.add(new animal("cde", "abc", "ok", 4, 2015, 22, "F"));
        animales.add(new animal("edf", "abc", "ok", 5, 2000, 23, "F"));
        animales.add(new animal("fgh", "compra", "ok", 6, 2001, 24, "M"));
        animales.add(new animal("fdw", "fgh", "ok", 7, 2002, 25, "F"));
        animales.add(new animal("dwf", "fgh", "ok", 8, 2010, 26, "F"));

    }

    public ArrayList<animal> getAnimales() {
        llenaAnim();
        return animales;
    }
    

    //Cálcular edad
    public int calculoEdad() {
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        edad = anoActual - ano;
        return (edad);
    }

    //Guarda registro de pesos
    public void addPeso(double pesoAnimal) {
        pesos.add(new peso(pesoAnimal));
    }

    //Mostrar registro de pesos
    public ArrayList getpeso() {
        return (pesos);
    }

    //Guarda registro de vacuna
    public void addVacuna(String nombre, double cantidadAdministrada) {
        vacunaciones.add(new vacuna(nombre, cantidadAdministrada));
    }

    //Mostrar registro de vacunas
    public ArrayList getVacuna() {
        return (vacunaciones);
    }

    //Guarda registro de enfermedad
    public void addEnfermedad(String nombreEnfermedad, String comentarios) {
        enfermedades.add(new enfermedad(nombreEnfermedad, comentarios));
    }

    //Mostrar registro de enfermedad
    public ArrayList getEnfermedad() {
        return (enfermedades);
    }

    //Obtener fechha de nacimiento a partir de los valores de dia, mes y ano.
    public String getFechaNacimiento() {
        return (String.valueOf(dia) + " de " + String.valueOf(mes) + " de " + String.valueOf(ano));
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getMadre() {
        return madre;
    }

    public String getEstado() {
        return estado;
    }

    //Graficar evolucion del peso
    public void evoPeso() {

    }

    public String getGenero() {
        return genero;
    }



    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }
}
