package es.uah.vsvmgr.javaflix.app;

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

public class Base {
    
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
    public Base (String titulo, String sinopsis, String genero, int anno,ArrayList<String> actores, String imagen ) {
        this.titulo=titulo;
        this.sinopsis=sinopsis;
        this.genero=genero;
        this.anno=anno;
        this.actores=actores;
        this.imagenportada=imagen;
    
    }
    
    /**
     *Devuelve el título asociado a un objeto Base
     * @return String titulo
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     *Permite indicar el título de un objeto Base
     * @param titulo String
     */
    public void setTitulo(String titulo){
        this.titulo=titulo;
                }

    /**
     *Devuelve la sinópsis asociada a un objeto Base
     * @return String sinopsis
     */
    public String getSinopsis(){
        return sinopsis;
    }

    /**
     *Permite indicar la sinópsis de un objeto Base
     * @param sinopsis String
     */
    public void setSinopsis(String sinopsis){
        this.sinopsis=sinopsis;
                }

    /**
     *Devuelve el género asociado a un objeto Base
     * @return String genero
     */
    public String getGenero(){
        return genero;
    }

    /**
     *Permite indicar el género de un objeto Base
     * @param genero String
     */
    public void setGenero(String genero){
        this.genero=genero;
                }

    /**
     *Devuelve el año de estreno asociado a un objeto Base
     * @return int anno
     */
    public int getAnno(){
        return anno;
    }

    /**
     *Permite indicar el año de estreno de un objeto Base
     * @param anno int
     */
    public void setAnno(int anno){
        this.anno=anno;
                }

    /**
     *Devuelve un array de Strings con el nombre de los actores asociados a un objeto Base
     * @return ArrayList[String] actores
     */
    public ArrayList<String> getActores(){
        return actores;
    }

    /**
     *Permite indicar los actores de un objeto Base como un array de Strings
     * @param actores ArrayList[String]
     */
    public void setActores(ArrayList<String> actores){
        this.actores=actores;
                }

    /**
     *Permite indicar los actores de un objeto Base como un Sring separando los nombres con ", "
     * @param actores String
     */
    public void setActores(String actores){
        this.actores.add(actores);
                }

    /**
     *Devuelve un String con la ruta de la imagenportada asociada a un objeto Base
     * @return String imagenportada
     */
    public String getImagenportada(){
        return imagenportada;
    }

    /**
     *Permite indicar la ruta de la imagenportada de un objeto Base
     * @param imagenportada String
     */
    public void setImagenportada(String imagenportada){
        this.imagenportada=imagenportada;
                }
    
 }
