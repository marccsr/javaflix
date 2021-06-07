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
public class Serie extends Plantilla{
    
    private int temporadas;
    private int capitulo;
    
    /**
     *Constructor de Serie.
     * @param titulo String
     * @param sinopsis String
     * @param genero String
     * @param anno int
     * @param actores ArrayList[String]
     * @param imagenportada String
     * @param temporadas int
     * @param capitulo int
     */
    public Serie (String titulo, String sinopsis, String genero, int anno,ArrayList<String> actores, String imagenportada, int temporadas, int capitulo) {
    super(titulo, sinopsis, genero, anno, actores, imagenportada);
    this.temporadas=temporadas;
    this.capitulo=capitulo;
    }
    
    /**
     *Devuelve las temporadas.
     * @return int temporadas
     */
    public int getTemporadas(){
        return temporadas;
    }

    /**
     *Settea las temporadas.
     * @param temporadas int
     */
    public void setTemporadas(int temporadas){
        this.temporadas=temporadas;
                }

    /**
     *Devuelve los capitulos.
     * @return int capitulo
     */
    public int getCapitulo(){
        return capitulo;
    }

    /**
     *Settea los capitulos.
     * @param capitulo int
     */
    public void setCapitulo(int capitulo){
        this.capitulo=capitulo;
                }
    public String toString(){
    return "serie-"+getTitulo()+"-"+getGenero()+"-"+getAnno()+"-"+getActores().toString()+"-"+getTemporadas()+"-"+getCapitulo()+"-"+getImagenportada()+"-"+getSinopsis();
    }
 }
    

