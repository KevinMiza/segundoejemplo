/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.Vista;
import Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author KEVIN MIZA
 */
public class Controlador implements ActionListener{
    Vista vis = new Vista();
    Modelo model = new Modelo();
    
    //Reservamos espacios para las clases
    
    public Controlador(Vista v, Modelo m){
        this.vis = v;
        this.model = m;
       
        this.vis.btnTradu.addActionListener(this);
        this.vis.comboBox.addActionListener(this);
        this.vis.txtRes.addActionListener(this);
    }
    
    private void Traduccion (){
        
        model.setPosicion(vis.comboBox.getSelectedIndex());
        vis.txtRes.setText(model.Traductor());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == this.vis.btnTradu){
          this.Traduccion();
      }
    }
    
}
