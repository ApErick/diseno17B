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
	public Usuario editaUser(String u);
        public void eliminaUser(String u);
        public boolean buscauser(String user);//Para verificar para registrarte el usuiario  exista o no
	public boolean buscacorreo(String correo);//Para verificar que cuando se registre el usuario y correo no sean iguales
	public boolean login(String user, String Pass);// Verificar que usuario y contrasela sean correctos
        public boolean bloqueado(String user);
}