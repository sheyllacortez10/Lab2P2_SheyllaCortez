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
public class Libro {
    //Atributos
    private String titulo = "";
    private String autor = "";
    private String genero = "";
    private String anoPublic = "";
    private String disponible = "";
    
    //Contructor
    public Libro(String titulo, String autor, String genero, String anoPublic, String disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;        
        this.anoPublic = anoPublic;
        this.disponible = disponible;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(String anoPublic) {
        this.anoPublic = anoPublic;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anoPublic=" + anoPublic + ", disponible=" + disponible + '}';
    }
    
}
