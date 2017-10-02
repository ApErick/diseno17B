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
public interface JuegoDao {
    
    public void creaJuego(String nj);
    public boolean validanomjue(String nj);
    public void eliminajuego(String nj);
    
}
