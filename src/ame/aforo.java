/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Camilo
 */
public class aforo {

    //El tipo de aforo puede ser de entrada o salida
    //El nombre del protrero es el nombre del potrero completo
    //La fecha de registro es automatica
    //El tamaño de potrero es dado en hectareas
    //haLibres se calcula automaticamente
    //La eficiencia es por defecto del 50%. Esta puede ser cambiada respecto a los resultados obtenidos en la finca.
    //El número de muestras debe ser igual para los tres tipos de altura del pasto identificado
    //Los dias de uso y libre son definidos por el usuario
    //Los porcentajes de hoja ancha, angosta, otro tipo y suelo descuebierto son definidos por el usuario
    //haAngosta, Ancha, Otro y Descubierto se calcula automaticamente
    //Los comentarios son definidos por el usuario
    //Las representaciones, en porcentaje, son definidas por el usuario
    private String tipoAforo, nombrePotrero;
    private LocalDateTime fechaRegistroAforo;
    private double tamanoPotrero, haLibres, eficiencia, elemento;
    private int numeroMuestras, diasUso, diasLibre;
    private double porHojaAncha, porHojaAngosta, porOtrotipo, porDescubierto;
    private double haAngosta, haAncha, haOtro, haDescubierto;
    private String comentarios;
    private ArrayList<Double> pastoBajo;
    private ArrayList<Double> pastoMedio;
    private ArrayList<Double> pastoAlto;
    private double repreBajo, repreMedio, repreAlto;
    private double sumatoria, promedioB, promedioA, promedioM;
    private double haCreciBajo, haCreciMedio, haCreciAlto;
    private double prompondeBajo, prompondeMedio, prompondeAlto, prompondeAforo;
    private double kgForraje, produTotal, produDiaria, dispoTotal, ugg, ugm;
    private ArrayList<usuario> registroUsuario = new ArrayList<usuario>();
    private ArrayList<aforo> aforos = new ArrayList<aforo>();

    public aforo(String tipoAforo, String nombrePotrero, double tamanoPotrero, int numeroMuestras, int diasUso, int diasLibre) {
        fechaRegistroAforo = LocalDateTime.now();
        this.tipoAforo = tipoAforo;
        this.nombrePotrero = nombrePotrero;
        this.tamanoPotrero = tamanoPotrero;
        this.numeroMuestras = numeroMuestras;
        this.diasUso = diasUso;
        this.diasLibre = diasLibre;
        eficiencia = 0.5;
        pastoBajo = new ArrayList<Double>(numeroMuestras);
        pastoMedio = new ArrayList<Double>(numeroMuestras);
        pastoAlto = new ArrayList<Double>(numeroMuestras);
    }

    public aforo() {

    }

    public void llenaAfo() {
        aforos.add(new aforo("Entrada", "Vientos1", 15, 4, 10, 30));
        aforos.add(new aforo("Entrada", "Vientos2", 20, 4, 10, 30));
        aforos.add(new aforo("Entrada", "Marianas1", 30, 4, 7, 30));
        aforos.add(new aforo("Entrada", "Teleferico", 54, 4, 8, 30));
        aforos.add(new aforo("Entrada", "Diosa", 5, 4, 10, 30));
        aforos.add(new aforo("Entrada", "Alumbre", 7.5, 4, 11, 30));

    }

    public ArrayList<aforo> getAforos() {
        llenaAfo();
        return aforos;
    }

    public String getNombrePotrero() {
        return nombrePotrero;
    }
    
    
    

    //
    public void calculoHectaLibres(double hojaAncha, double hojaAngosta, double otro, double descubierto) {
        haAncha = (hojaAncha / 100) * tamanoPotrero;
        haAngosta = (hojaAngosta / 100) * tamanoPotrero;
        haOtro = (otro / 100) * tamanoPotrero;
        haDescubierto = (descubierto / 100) * tamanoPotrero;
        haLibres = tamanoPotrero - (haAncha + haAngosta + haOtro + haDescubierto);
    }

    //
    public void setDatosBajo() {
        for (int i = 0; i < numeroMuestras; i++) {
            elemento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso número " + (i + 1)));
            pastoBajo.add(elemento);
        }
    }

    //
    public void setDatosMedio() {
        for (int i = 0; i < numeroMuestras; i++) {
            elemento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso número " + (i + 1)));
            pastoMedio.add(elemento);
        }
    }

    //
    public void promPondeAforo() {
        prompondeAforo = prompondeBajo + prompondeMedio + prompondeAlto;
    }

    //
    public void setDatosAlto() {
        for (int i = 0; i < numeroMuestras; i++) {
            elemento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso número " + (i + 1)));
            pastoAlto.add(elemento);
        }
    }

    //
    public void calcularPromedioBajo() {
        for (int i = 0; i < numeroMuestras; i++) {
            sumatoria += pastoBajo.get(i);
        }

        promedioB = sumatoria / numeroMuestras;

        sumatoria = 0;
    }

    //
    public void calcularPromedioMedio() {
        for (int i = 0; i < numeroMuestras; i++) {
            sumatoria += pastoMedio.get(i);
        }

        promedioM = sumatoria / numeroMuestras;

        sumatoria = 0;
    }

    //
    public void calcularPromedioAlto() {
        for (int i = 0; i < numeroMuestras; i++) {
            sumatoria += pastoAlto.get(i);
        }

        promedioA = sumatoria / numeroMuestras;

        sumatoria = 0;
    }

    //
    public void setRepresentaciones(double bajo, double medio, double alto) {
        repreBajo = bajo / 100;
        repreMedio = medio / 100;
        repreAlto = alto / 100;
    }

    //
    public void haNiveles() {
        haCreciBajo = repreBajo * haLibres;
        haCreciMedio = repreMedio * haLibres;
        haCreciAlto = repreAlto * haLibres;
    }

    //
    public void promPondeBajo() {
        prompondeBajo = promedioB * repreBajo;
    }

    //
    public void promPondeMedio() {
        prompondeMedio = promedioM * repreMedio;
    }

    //
    public void promPondeAlto() {
        prompondeAlto = promedioA * repreAlto;
    }

    public double getPromedioA() {
        return promedioA;
    }

    public double getPromedioM() {
        return promedioM;
    }

    public double getPromedioB() {
        return promedioB;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<Double> getPastoBajo() {
        return pastoBajo;
    }

    public ArrayList<Double> getPastoMedio() {
        return pastoMedio;
    }

    public ArrayList<Double> getPastoAlto() {
        return pastoAlto;
    }

    public double getRepreBajo() {
        return repreBajo;
    }

    public double getRepreMedio() {
        return repreMedio;
    }

    public double getRepreAlto() {
        return repreAlto;
    }

    public double getHaLibres() {
        return haLibres;
    }

    public double getNivelBajo() {
        return haCreciBajo;
    }

    public double getNivelMedio() {
        return haCreciMedio;
    }

    public double getNivelAlto() {
        return haCreciAlto;
    }

    public double getPrompondeBajo() {
        return prompondeBajo;
    }

    public double getPrompondeMedio() {
        return prompondeMedio;
    }

    public double getPrompondeAlto() {
        return prompondeAlto;
    }

    public double getPrompondeAforo() {
        return prompondeAforo;
    }

    //
    public void calcularKgForraje() {
        kgForraje = prompondeAforo / 1000;
    }

    public double getKgForraje() {
        return kgForraje;
    }

    public void calcularProduTotal() {
        produTotal = kgForraje * haLibres;
    }

    public double getProduTotal() {
        return produTotal;
    }

    public void calcularProduDiaria() {
        produDiaria = (produTotal * 10000) / diasLibre;
    }

    public double getProduDiaria() {
        return produDiaria;
    }

    public void calcularDispoTotal() {
        dispoTotal = produTotal * eficiencia;
    }

    public double getDispoTotal() {
        return dispoTotal;
    }

    public void calcularUgg() {
        ugg = (dispoTotal * 10000) / ((diasLibre + diasUso) * 54);
    }

    public void calcularUgm() {
        ugm = (dispoTotal * 10000) / ((diasLibre + diasUso) * 60);
    }

    public double getUgg() {
        return ugg;
    }

    public double getUgm() {
        return ugm;
    }

    public double getHaCreciBajo() {
        return haCreciBajo;
    }

    public double getHaCreciMedio() {
        return haCreciMedio;
    }

    public double getHaCreciAlto() {
        return haCreciAlto;
    }
}
