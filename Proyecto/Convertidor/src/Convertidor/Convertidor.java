/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Enmanuelle Acuña
 */

package Convertidor;

public class Convertidor {
    public double convertir_km_m (double km) {
        return km * 1000;
    }

    public double convertir_m_km (double mt) {
        return mt / 1000;
    }
 
    public double convertir_cm_pulgadas (double cm) {
        return cm / 2.54;
    }
    
    public double convertir_pulgadas_cm (double pul) {
        return pul * 2.54;
    }
    
    public double convertir_far_kelvin (double far) {
        return ((5 * far - 5 * 32) / 9 + 273.15);
    }
 
    public double convertir_kelvin_far (double kel) {
        return ((9 * kel - 9 * 273.15) / 5 + 32);
    }
 
    public double convertir_minutos_dias (double minutos) {
        return minutos / (60 * 24);
    }
    
    public double convertir_dias_minutos (double dias) {
        return dias * 24 * 60;
    }
    
    public double convertir_libras_gramos (double libras) {
        return libras / 453.59;
    }
    
    public double convertir_gramos_libras (double gramos) {
        return gramos * 453.59;
    }    
}
