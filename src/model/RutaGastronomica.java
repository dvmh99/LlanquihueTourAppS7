/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class RutaGastronomica extends ServicioTuristico {
    
    private int numeroDeParadas;

    public RutaGastronomica (String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ruta Gastronomica"
                + "\n" + super.toString()
                + "\nNumero de paradas: " + numeroDeParadas;
    }  
}
