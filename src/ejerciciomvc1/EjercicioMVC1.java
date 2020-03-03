/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc1;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class EjercicioMVC1 {

    public static void main(String[] args) {
       
        Vista v = new Vista();
        Modelo m = new Modelo();
        Controlador c = new Controlador(v,m);
        
        v.setVisible(true);
    }
    
}
