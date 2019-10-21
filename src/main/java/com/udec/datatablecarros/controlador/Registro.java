/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.datatablecarros.controlador;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *Clase Registro
 * @author julian esteban vallejo galindo
 */

public class Registro {

    private String nombre;
    private String marca;
    private Date modelo;
    private int fecha;

    /**
     * constructor clase Registro
     * @param nombre
     * @param marca
     * @param modelo 
     */
    public Registro(String nombre, String marca, Date modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = obtenerAnioModelo(modelo);
    }    
    
    /**
     * Metodo que obtiene el año de la fecha completa
     * @param modelo
     * @return año
     */
    public int obtenerAnioModelo(Date modelo) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        return Integer.parseInt(format.format(modelo));       
    }
    
    /**
     * getters y setters
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getModelo() {
        return modelo;
    }

    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }  
    
}
