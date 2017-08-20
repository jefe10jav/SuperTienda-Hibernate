package com.tienda.entities;
// Generated 19/08/2017 08:06:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private int usuarioId;
     private TiposUsuarios tiposUsuarios;
     private String nombreUsuario;
     private String contrasena;
     private String nombre;
     private String apellidoP;
     private String apellidoM;
     private Set ventases = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(int usuarioId, TiposUsuarios tiposUsuarios, String nombreUsuario, String contrasena, String nombre, String apellidoP) {
        this.usuarioId = usuarioId;
        this.tiposUsuarios = tiposUsuarios;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
    }
    public Usuarios(int usuarioId, TiposUsuarios tiposUsuarios, String nombreUsuario, String contrasena, String nombre, String apellidoP, String apellidoM, Set ventases) {
       this.usuarioId = usuarioId;
       this.tiposUsuarios = tiposUsuarios;
       this.nombreUsuario = nombreUsuario;
       this.contrasena = contrasena;
       this.nombre = nombre;
       this.apellidoP = apellidoP;
       this.apellidoM = apellidoM;
       this.ventases = ventases;
    }
   
    public int getUsuarioId() {
        return this.usuarioId;
    }
    
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    public TiposUsuarios getTiposUsuarios() {
        return this.tiposUsuarios;
    }
    
    public void setTiposUsuarios(TiposUsuarios tiposUsuarios) {
        this.tiposUsuarios = tiposUsuarios;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return this.apellidoP;
    }
    
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return this.apellidoM;
    }
    
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public Set getVentases() {
        return this.ventases;
    }
    
    public void setVentases(Set ventases) {
        this.ventases = ventases;
    }




}


