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
public interface UsuariosDao {
	public void crearUser(Usuario u);
	public void editaUser(Usuario u);
        public Usuario consultaUser(Usuario u); //Recuperamos todos los campos del usuario para despues mostarlos y sean modificados
        public void eliminaUser(Usuario u);
        
        
}