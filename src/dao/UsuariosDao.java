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
	public boolean editaUser(Usuario u);
        public String[] consultaUser(String us); //Recuperamos todos los campos del usuario para despues mostarlos y sean modificados
        public void eliminaUser(Usuario u);
        public boolean buscauser(Usuario u);//Para verificar para registrarte el usuiario  exista o no
	public boolean buscacorreo(Usuario u);//Para verificar que cuando se registre el usuario y correo no sean iguales
	public boolean login(String us, String pass);// Recibir el userName y el pass para validar y entrar
        public boolean bloqueado(Usuario u);
}