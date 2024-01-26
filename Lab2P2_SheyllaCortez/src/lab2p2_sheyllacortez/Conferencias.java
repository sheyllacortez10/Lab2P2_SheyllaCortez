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
    private Date fecha;
    private int duracion = 0;
    private String linkAcces = "";
    
    //Constructor
    public Conferencias(String titulo, String conferencista, Date fecha, int duracion, String li) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.linkAcces = linkAcces;
    }
    
}
