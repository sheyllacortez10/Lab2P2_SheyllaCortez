package lab2p2_sheyllacortez;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author DELL
 */
public class Conferencias {
    //Atributos
    private String titulo = "";
    private String conferencista = "";
    private String fecha = "";
    private int duracion = 0;
    private String linkAcces = "";
    
    //Constructor
    public Conferencias(String titulo, String conferencista, String fecha, int duracion, String li) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.linkAcces = linkAcces;
    }
    
    //Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLinkAcces() {
        return linkAcces;
    }

    public void setLinkAcces(String linkAcces) {
        this.linkAcces = linkAcces;
    }
    
    //toString

    @Override
    public String toString() {
        return "Conferencias{" + "titulo=" + titulo + ", conferencista=" + conferencista + ", fecha=" + fecha + ", duracion=" + duracion + ", linkAcces=" + linkAcces + '}';
    }
    
}
