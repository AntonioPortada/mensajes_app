/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jorge.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author antonioportada
 */
public class Mensajes_app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conexion con = new Conexion();
        int opc = 0;
        
        do {
            System.out.println("---------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1.- Crear mensajes");
            System.out.println("2.- Listar mensajes");
            System.out.println("3.- Editar mensaje");
            System.out.println("4.- Eliminar mensaje");
            System.out.println("5.- Salir");
            opc = sc.nextInt();
            
            switch(opc) {
                case 1 -> MensajesService.crearMensaje();
                case 2 -> MensajesService.listarMensajes();
                case 3 -> MensajesService.editarMensaje();
                case 4 -> MensajesService.borrarMensaje();
            }
            
        } while(opc != 5);
        
        try (Connection cnx = con.getConexion()) {
            
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
}
