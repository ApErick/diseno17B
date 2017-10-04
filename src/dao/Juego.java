/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author wildc
 */
public class Juego {

    private String nJuego;
    
    public Juego(){
        this.setNJuego("");
    }
    
    public String getNJuego(){
        return nJuego;
    }

    public void setNJuego(String n) {
        this.nJuego = n;
    }
    
}
