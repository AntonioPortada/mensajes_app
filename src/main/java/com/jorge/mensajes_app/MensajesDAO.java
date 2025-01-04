/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jorge.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author antonioportada
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensaje mensaje) {
        Conexion dbConn = new Conexion();
        try(Connection con = dbConn.getConexion()) {
            PreparedStatement ps = null;
            try {
                String query = "insert into mensajes (mensaje, autor_mensaje) values(?, ?)";
                ps = con.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado!");
            } catch(SQLException ex) {
                System.out.println(ex);
            }
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void leerMensajesDB() {
        Conexion dbConn = new Conexion();
        try(Connection con = dbConn.getConexion()) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "select * from mensajes";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("ID: " +rs.getInt("id_mensaje")+ " - Mensaje: " +rs.getString("mensaje")+ " - Autor: " +rs.getString("autor_mensaje"));
            }
        } catch(SQLException ex) {
            System.out.println("No se pudieron recibir los mensajes.");
            System.out.println(ex);
        }
    }
    
    public static void borrarMensajeDB(int idMensaje) {
        Conexion dbConn = new Conexion();
        try(Connection con = dbConn.getConexion()) {
            PreparedStatement ps = null;
            String query = "delete from mensajes where id_mensaje = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, idMensaje);
            ps.executeUpdate();
            System.out.println("Mensaje eliminado!");
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje) {
        Conexion dbConn = new Conexion();
        try(Connection con = dbConn.getConexion()) {
            PreparedStatement ps = null;
            String query = "update mensajes set mensaje = ? where id_mensaje = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setInt(2, mensaje.getIdMensaje());
            ps.executeUpdate();
            System.out.println("Mensaje actualizado!");
        } catch(SQLException ex) {
            System.out.println("No se pudo actualizar el mensaje.");
            System.out.println(ex);
        }
    }
}
