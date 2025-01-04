/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jorge.mensajes_app;

/**
 *
 * @author antonioportada
 */
public class Mensaje {
    
    private int idMensaje;
    private String mensaje;
    private String autorMensaje;
    private String fecha;

    public Mensaje() { }

    public Mensaje(String mensaje, String autorMensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
    }
    
    public Mensaje(int idMensaje, String mensaje, String autorMensaje, String fecha) {
        this.idMensaje = idMensaje;
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fecha = fecha;
    }
    
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
