/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jorge.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author antonioportada
 */
public class Mensajes_app {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        
        try (Connection cnx = con.getConexion()) {
            
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
}
