/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author KEVIN MIZA
 */
public class Modelo {
    private int posicion;
    private String nombre;
    
    
    private String Red = "Red";
    private String Sneaker = "Sneaker";
    private String Hand = "Hand";
    private String Name = "Name";
    private String Voice = "Voice";
    private String Mouse = "Mouse";
    
    public int getPosicion(){
        return posicion;
    }
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getRed(){
        return Red;
    }
    
    public void setRed(String Red){
        this.Red = Red;
    }
    
    public String getSneaker(){
        return Sneaker;
    }
    
    public void setSneaker(String Sneaker){
        this.Sneaker = Sneaker;
    }
    
    public String getHand(){
        return Hand;
    }
    
    public void setHand(String Hand){
        this.Hand = Hand;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getVoice(){
        return Voice;
    }
    
    public void setVoice(){
        this.Voice = Voice;
    }
    
    public String getMouse(){
        return Mouse;
    }
    
    public void setMouse(){
        this.Mouse = Mouse;
    }
    
    public String Traductor (){
        switch(posicion){
            case 0 :
                this.nombre = this.Red;
                break;
            case 1:
                this.nombre = this.Sneaker;
                break;
            case 2:
                this.nombre = this.Hand;
                break;
            case 3:
                this.nombre = this.Name;
                break;
            case 4:
                this.nombre = this.Voice;
                break;
            case 5: 
                this.nombre = this.Mouse;
                break;
            default :
                break;
        }
        
        return this.nombre;
    }
    
}
