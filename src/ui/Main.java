/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import data.GestorServicios;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        System.out.println("SERVICIOS TURISTICOS DISPONIBLES");
        System.out.println("================================");

        gestor.mostrarServicios();
    }
}
    

        
