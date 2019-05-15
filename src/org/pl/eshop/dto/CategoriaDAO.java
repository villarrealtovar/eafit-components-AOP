/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.pl.eshop.dto;

import java.util.List;

/**
 *
 * @author andres
 */
public interface CategoriaDAO {
    public void agregar(Categoria c) throws Exception;

    public void modificar(Categoria c) throws Exception;

    public void eliminar(Categoria c) throws Exception;

    public List<Categoria> obtenerTodas() throws Exception;

    public Categoria obtenerPorId(Integer id) throws Exception; 
}
