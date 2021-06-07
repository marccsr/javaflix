/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.vsnvmgr.javaflix.app;

import java.util.ArrayList;

/**
 *
 * @author MARCOSPC
 */
public class Pelicula extends Plantilla{
        private int duracion;
    private String director;
    
    /**
     *Constructor de Pelicula
     * @param titulo String
     * @param sinopsis String
     * @param genero String
     * @param anno int
     * @param actores ArrayList[String]
     * @param imagenportada String
     * @param duracion int
     * @param director String
     */
    public Pelicula(String titulo, String sinopsis, String genero, int anno,ArrayList<String> actores, String imagenportada, int duracion, String director){
    
        super(titulo, sinopsis, genero, anno, actores, imagenportada);
        this.duracion=duracion;
        this.director=director;
    }
    
    /**
     *Devuelve duración en mins.
     * @return int duracion
     */
    public int getDuracion(){
        return duracion;
    }

    /**
     *Permite settear duración en mins.
     * @param duracion int
     */
    public void setDuracion(int duracion){
        this.duracion=duracion;
                }

    /**
     *Devuelve el nombre del director.
     * @return String director
     */
    public String getDirector(){
        return director;
    }

    /**
     *Permite settear el nombre del director.
     * @param director String
     */
    public void setDirector(String director){
        this.director=director;
                }
    public String toString(){
    return "pelicula-"+getTitulo()+"-"+getGenero()+"-"+getAnno()+"-"+getActores().toString()+"-"+getDuracion()+"-"+getDirector()+"-"+getImagenportada()+"-"+getSinopsis();
    }
}

