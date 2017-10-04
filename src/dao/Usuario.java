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
public class Usuario {
  
    private String nombre;
    private String ApMat;
    private String ApPat;
    private String Correo;
    private int edad;
    private String Face;
    private String User;
    private String pass;
    private int bloqueado;
    
    
    
    public Usuario(){
        this.setNombre("");
        this.setApm("");
        this.setApp("");
        this.setCorreo("");
        this.setEdad(10);
        this.setFace("");
        this.setUser("");
        this.setPass("");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApm(){
        return ApMat;
    }
    
    public String getApp(){
        return ApPat;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getFace(){
        return Face;
    }
    
    public String getUsuario(){
        return User;
    }
    
    public String getPass(){
        return pass;
    }
    
    public int getBloqueado(){
        return bloqueado;
    }
    
    public void setNombre(String n) {
        this.nombre=n;
    }

    public void setApm(String am) {
        this.ApMat=am;
    }

    public void setApp(String ap) {
        this.ApPat=ap;
    }

    public void setCorreo(String c) {
        this.Correo=c;
    }

    public void setEdad(int e) {
        this.edad=e;
    }

    public void setFace(String f) {
        this.Face=f;
    }

    public void setUser(String us) {
        this.User=us;
    }

    public void setPass(String pas) {
        this.pass=pas;
    }

    public void setBloqueado(int bloq) {
        this.bloqueado=bloq;
    }
    
}
