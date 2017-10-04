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
    
    public void creaJuego(Juego nj);
    public boolean buscanomjue(Juego nj);
    public void eliminajuego(Juego nj);
    
}
