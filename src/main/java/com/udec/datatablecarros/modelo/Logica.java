/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.datatablecarros.modelo;


import com.udec.datatablecarros.controlador.Registro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *Clase de Logica
 * @author julian esteban vallejo galindo
 */


@Named(value = "logica")
@ViewScoped
public class Logica implements  Serializable{

    private String car;
    private List<String> marca;
    private String nombre;
    private Date modelo;
    private Registro carro;
    private static List<Registro> listarCarros;
    private List<Registro> filteredCars;

    /**
     * Metodo que inicia despues del contructor
     * LLena la lista de marcas
     */
    @PostConstruct
    public void init() {
        marca = new ArrayList<>();
        marca.add("Renault");
        marca.add("Mazda");
        marca.add("Chevrolet");
        marca.add("Bugatti");
        
        listarCarros = new ArrayList<>();
        
    }
    
    /**
     * Metodo que guarda los carros a la lista
     */
    public void crearCarros() {
        listarCarros.add(new Registro(getNombre(),getCar(), getModelo()));
    }

    /**
     * getters y setters
     * @return 
     */
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public List<String> getMarca() {
        return marca;
    }

    public void setMarca(List<String> marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getModelo() {
        return modelo;
    }

    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }

    public List<Registro> getListarCarros() {
        return listarCarros;
    }

    public void setListarCarros(List<Registro> listarCarros) {
        Logica.listarCarros = listarCarros;
    }

    public Registro getCarro() {
        return carro;
    }

    public void setCarro(Registro carro) {
        this.carro = carro;
    }

    public List<Registro> getFilteredCars() {
        return filteredCars;
    }

    public void setFilteredCars(List<Registro> filteredCars) {
        this.filteredCars = filteredCars;
    }
    
}
