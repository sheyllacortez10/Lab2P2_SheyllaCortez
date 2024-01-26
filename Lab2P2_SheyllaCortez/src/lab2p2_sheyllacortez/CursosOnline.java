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
public class CursosOnline {
    //Atributos
    private String titulo = "";
    private String instructor = "";
    private int duraWeek;
    private String platForm = "";
    
    //Constructor
    public CursosOnline(String titulo, String instructor, int duraWeek, String platForm) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duraWeek = duraWeek;
        this.platForm = platForm;
    }
    
    //Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuraWeek() {
        return duraWeek;
    }

    public void setDuraWeek(int duraWeek) {
        this.duraWeek = duraWeek;
    }

    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }
    
    //toString

    @Override
    public String toString() {
        return "CursosOnline{" + "titulo=" + titulo + ", instructor=" + instructor + ", duraWeek=" + duraWeek + ", platForm=" + platForm + '}';
    }
    
    
}
