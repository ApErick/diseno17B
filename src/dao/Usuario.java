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
    
    private void setNombre(String n) {
        this.nombre=n;
    }

    private void setApm(String am) {
        this.ApMat=am;
    }

    private void setApp(String ap) {
        this.ApPat=ap;
    }

    private void setCorreo(String c) {
        this.Correo=c;
    }

    private void setEdad(int e) {
        this.edad=e;
    }

    private void setFace(String f) {
        this.Face=f;
    }

    private void setUser(String us) {
        this.User=us;
    }

    private void setPass(String pas) {
        this.pass=pas;
    }
    

}
