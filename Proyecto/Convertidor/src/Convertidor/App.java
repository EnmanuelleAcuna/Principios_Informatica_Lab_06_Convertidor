/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author Enmanuelle Acuña
 */

package Convertidor;

import Convertidor.Convertidor;
import javax.swing.JOptionPane;

public class App {
    public App() {
        super();
    }
    
    public static void main(String[] args) {
        App Aplicacion = new App();
        Aplicacion.Convertir();
    }
    
    public void Convertir() {
        Convertidor ObjConvertidor = new Convertidor();
        int numero;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("¿Que conversion quiere hacer?\n\n" +
                    "1. Pasar de kil�metros a metros.\n" +
                    "2. Pasar de metros a kil�metros.\n" +
                    "3. Pasar de centimetros a pulgadas.\n" +
                    "4. Pasar de pulgadas a centimetros.\n" +
                    "5. Pasar de grados fahrenheit a grados kelvin.\n" +
                    "6. Pasar de grados kelvin a grados fahrenheit.\n" +
                    "7. Pasar de minutos a d�as.\n" +
                    "8. Pasar de d�s a minutos.\n" +
                    "9. Pasar de libras a gramos.\n" +
                    "10. Pasar de gramos a libras.\n" +
                    "0. Salir.\n\n"));
        
            if (numero == 1) {
                double km = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilómetros:"));
                JOptionPane.showMessageDialog(null, km + " kilómetros son " + ObjConvertidor.convertir_km_m(km) + " metros");
            }
   
            if (numero == 2) {
                double m = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los metros:"));
                JOptionPane.showMessageDialog(null, m + " metros son " + ObjConvertidor.convertir_m_km(m) + " kilómetros.");
            }
  
            if (numero == 3) {
                double cm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los centimetros:"));
                JOptionPane.showMessageDialog(null, cm + " centimetros son " + ObjConvertidor.convertir_cm_pulgadas(cm) + " pulgadas.");
            }
   
            if (numero == 4) {
                double p = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las pulgadas:"));
                JOptionPane.showMessageDialog(null, p + " pulgadas son " + ObjConvertidor.convertir_pulgadas_cm(p) + " centimetros.");
            }
   
            if (numero == 5) {
                double f = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados farenheit °F:"));
                JOptionPane.showMessageDialog(null, f + " grados farenheit °F son " + ObjConvertidor.convertir_far_kelvin(f) + " grados kelvin.");
            }
   
            if (numero == 6) {
                double k = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en kelvin"));
                JOptionPane.showMessageDialog(null, k + " grados kelvin son " + ObjConvertidor.convertir_kelvin_far(k) + " grados farenheit °F.");
            }
   
            if (numero == 7) {
                double minutos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los minutos"));
                JOptionPane.showMessageDialog(null, minutos + " minutos son " + ObjConvertidor.convertir_minutos_dias(minutos) + " días.");
            }
   
            if (numero == 8) {
                double dias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los días"));
                JOptionPane.showMessageDialog(null, dias + " días son " + ObjConvertidor.convertir_dias_minutos(dias) + " minutos.");
            }
   
            if (numero == 9) {
                double libras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las libras"));
                JOptionPane.showMessageDialog(null, libras + " libras son " + ObjConvertidor.convertir_libras_gramos(libras) + " gramos.");
            }
   
            if (numero == 10) {
                double gra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los gramos"));
                JOptionPane.showMessageDialog(null, gra + " gramos son " + ObjConvertidor.convertir_gramos_libras(gra) + " libras");
            }
        } while (numero != 0);   
    }
}
