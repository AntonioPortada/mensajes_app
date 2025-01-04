/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jorge.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author antonioportada
 */
public class MensajesService {
    
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String mensaje = sc.nextLine();
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        Mensaje registro = new Mensaje(mensaje, nombre);
        MensajesDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué mensaje deseas borrar? (ingresa el id) ");
        int idEliminar = sc.nextInt();
        MensajesDAO.borrarMensajeDB(idEliminar);
    }
    
    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nuevo mensaje: ");
        String nuevo = sc.nextLine();
        System.out.println("Qué mensaje deseas actualizar? (ingresa el id) ");
        int idEdit = sc.nextInt();
        Mensaje actualizacion = new Mensaje();
        actualizacion.setIdMensaje(idEdit);
        actualizacion.setMensaje(nuevo);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
