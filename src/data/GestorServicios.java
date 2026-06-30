/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;
import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {
    
    private List<ServicioTuristico> servicios;
    
    public GestorServicios() {
        servicios = new ArrayList <>();
        cargarServicios();
    }
    
private void cargarServicios(){
    servicios.add(new RutaGastronomica("Sabores de Puerto Varas", 4, 5));
    servicios.add(new RutaGastronomica("Ruta del Kuchen Llanquihue", 3, 4));
    servicios.add(new PaseoLacustre("Navegacion por el Lago Llanquihue", 2, "Catamaran"));
    servicios.add(new PaseoLacustre("Paseo al atardecer", 2, "Lancha turistica"));
    servicios.add(new ExcursionCultural("Historia y patrimonio de Frutillar", 5, "Museo y teatro"));
    servicios.add(new ExcursionCultural("Patrimonio Aleman", 3, "Museo Colonial Aleman"));
}

    public void mostrarServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println("------------------------------");
        }
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }
}
