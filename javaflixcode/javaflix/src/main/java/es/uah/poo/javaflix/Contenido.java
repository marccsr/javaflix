/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.poo.javaflix;

import java.util.ArrayList;

/**
 *
 * @author MARCOSTUF
 */
public class Contenido {
    
    private String titulo;
    private String sinopsis;
    private String genero;
    private int anno;
    private ArrayList<String> actores;
    //imagen de portada

    public Contenido(String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anno = anno;
        this.actores = actores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }
}
