/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.dao;

import com.tienda.entities.CategoriasProductos;
import com.tienda.entities.Productos;
import com.tienda.entities.Proveedores;
import com.tienda.entities.TiposUsuarios;
import com.tienda.entities.Usuarios;
import com.tienda.entities.Ventas;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author MBN USER
 */
public interface GenericDAO<T> {

    boolean guardar(Object T);

    boolean actualizar(Object T);

    boolean eliminar(int id, String nombreTabla, String nombreCampo);
    
    boolean eliminar(String id, String nombreTabla, String nombreCampo);

    //Usuarios
    Usuarios login(String nombre_usuario, String contrasena);

    List<Usuarios> buscarUsuarios(String parametros);

    Usuarios buscarUsuarioPorId(int usuarioId);

    //Tipos usuarios
    List<TiposUsuarios> buscarTodosTiposUsuarios();

    //Proveedores
    List<Proveedores> buscarTodosProveedores();

    List<Proveedores> buscarProveedores(String parametros);

    Proveedores buscarProveedorPorid(int proveedorId);

    //categorias productos
    List<CategoriasProductos> buscarTodasCategoriasProductos();

    List<CategoriasProductos> buscarCategoriasProductos(String parametros);

    CategoriasProductos buscarCategoriaProductoPorId(int categoriaProdId);

    //Productos
    Productos buscarProductoPorCodigo(String codigo);

    List<Productos> buscarTodosProductos();

    void actualizarExistenciaProducto(String productoId, int numProductos);

    List<Productos> buscarProductos(String parametros);

    //Ventas
    List<Ventas> buscarVentasEntreFechas(String fechaInicio, String fechaFin);

    List<Object[]> buscarVentasPorAnio(String anio);

    List<Object[]> buscarVentasPorUsuario(String fechaInicio, String fechaFin);

    Session getSesion();
}
