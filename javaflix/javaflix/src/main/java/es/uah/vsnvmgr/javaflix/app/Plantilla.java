package es.uah.vsnvmgr.javaflix.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcostuf
 */
import java.util.ArrayList;

public class Plantilla {
    
    private String titulo;
    private String sinopsis;
    private String genero;
    private int anno;
    private ArrayList<String> actores;
    private String imagenportada;
    
    /**
     *Constructor de la clase Media
     * @param titulo String
     * @param sinopsis String
     * @param genero String
     * @param anno int 
     * @param actores ArrayList[String]
     * @param imagen String
     */
    public Plantilla (String titulo, String sinopsis, String genero, int anno,ArrayList<String> actores, String imagen ) {
        this.titulo=titulo;
        this.sinopsis=sinopsis;
        this.genero=genero;
        this.anno=anno;
        this.actores=actores;
        this.imagenportada=imagen;
    
    }
    
    /**
     * Devuelve el título del objeto.
     * @return String titulo
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     * Settea el título del objeto.
     * @param titulo String
     */
    public void setTitulo(String titulo){
        this.titulo=titulo;
                }

    /**
     * Devuelve la sinopsis del objeto.
     * @return String sinopsis
     */
    public String getSinopsis(){
        return sinopsis;
    }

    /**
     * Settea la siopsis del objeto.
     * @param sinopsis String
     */
    public void setSinopsis(String sinopsis){
        this.sinopsis=sinopsis;
                }

    /**
     * Devuelve el género del objeto.
     * @return String genero
     */
    public String getGenero(){
        return genero;
    }

    /**
     * Settea el género del objeto.
     * @param genero String
     */
    public void setGenero(String genero){
        this.genero=genero;
                }

    /**
     * Devuelve el año de estreno del objeto.
     * @return int anno
     */
    public int getAnno(){
        return anno;
    }

    /**
     * Settea el año de estreno del objeto.
     * @param anno int
     */
    public void setAnno(int anno){
        this.anno=anno;
                }

    /**
     * Devuelve un array de String con los actores asociados al objeto.
     * @return ArrayList[String] actores
     */
    public ArrayList<String> getActores(){
        return actores;
    }

    /**
     * Settea el array de String con los actores asociados al obejto.
     * @param actores ArrayList[String]
     */
    public void setActores(ArrayList<String> actores){
        this.actores=actores;
                }

    /**
     * Settea los actores del objeto como un String, y otorgándoles formato.
     * @param actores String
     */
    public void setActores(String actores){
        this.actores.add(actores);
                }

    /**
     * Devuelve un String con la ruta de la imagen de la portada asociada al objeto.
     * @return String imagenportada
     */
    public String getImagenportada(){
        return imagenportada;
    }

    /**
     * Settea la ruta de la imagen de la portada del objeto.
     * @param imagenportada String
     */
    public void setImagenportada(String imagenportada){
        this.imagenportada=imagenportada;
                }
    
 }
