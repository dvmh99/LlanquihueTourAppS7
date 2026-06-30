/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ExcursionCultural extends ServicioTuristico {
    
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getlugarHistorico() {
        return lugarHistorico;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Excursion Cultural" +
               "\n" + super.toString()
                + "\nLugar historico: " + lugarHistorico;
    }
    
    
}
