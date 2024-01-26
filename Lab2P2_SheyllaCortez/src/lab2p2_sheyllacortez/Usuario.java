/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_sheyllacortez;

/**
 *
 * @author DELL
 */
public class Usuario {
    //Atributos
    private String nameUsu = "";
    private String contrasena = "";
    private String tipoUsu = "";
    
    //Contructor
    public Usuario(String nameUsu, String contrasena, String tipoUsu ) {
        this.nameUsu = nameUsu;
        this.contrasena = contrasena;
        this.tipoUsu =tipoUsu;
    }
    
    //Setters y getters

    public String getNameUsu() {
        return nameUsu;
    }

    public void setNameUsu(String nameUsu) {
        this.nameUsu = nameUsu;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(String tipoUsu) {
        this.tipoUsu = tipoUsu;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Usuario{" + "nameUsu=" + nameUsu + ", contrasena=" + contrasena + ", tipoUsu=" + tipoUsu + '}';
    }
    

    
    
}
