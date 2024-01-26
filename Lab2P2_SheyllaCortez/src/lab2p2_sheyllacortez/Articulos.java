package lab2p2_sheyllacortez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author DELL
 */
public class Articulos {
    //Atributos
    private String titulo = "";
    private String autor = "";
    private String tema = "";
    private String fechaPublic = "";
    private String onlineAccess = "";
    
    //Contructor
    public Articulos(String titulo, String autor, String tema, String fechaPublic, String onlineAccess ) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechaPublic = fechaPublic;
        this.onlineAccess = onlineAccess;
    }
    
    //Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFechaPublic() {
        return fechaPublic;
    }

    public void setFechaPublic(String fechaPublic) {
        this.fechaPublic = fechaPublic;
    }

    public String getOnlineAccess() {
        return onlineAccess;
    }

    public void setOnlineAccess(String onlineAccess) {
        this.onlineAccess = onlineAccess;
    }
    
    //toString
    @Override
    public String toString() {
        return "Articulos{" + "titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + ", fechaPublic=" + fechaPublic + ", onlineAccess=" + onlineAccess + '}';
    }
    
    
}
