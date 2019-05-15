/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.pl.eshop.dto;



/**
 *
 * @author andres
 */
public class Categoria {
    private Integer id;
    private String nombre;
    private String descripcion;

    public Categoria() {
        this.nombre = "";
    }

    public Categoria(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        if (this.id == null) {
            throw new IllegalArgumentException("null id: " + id);
        }
        return id;
    }

    public void setId(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id less or equalts to : " + id);
        } 
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        // Manual validations
        
        if (nombre == "") {
            throw new IllegalArgumentException("empty nombre: " + nombre);
        }
        
        if (nombre == null) {
            throw new IllegalArgumentException("null nombre: " + nombre);
        }
        
        
        if (nombre.length() < 3) {
            throw new IllegalArgumentException("null nombre: " + nombre);
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }   
}
