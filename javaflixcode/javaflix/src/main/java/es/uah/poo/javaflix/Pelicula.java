/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.poo.javaflix;

/**
 *
 * @author MARCOSPC
 */
public class Pelicula extends Contenido{

    private int duracion;
    private String director;

    public Pelicula(int duracion, String director) {
        super(Contenido.getTitulo(), Contenido.getSinopsis(), Contenido.getGenero(), Contenido.getAnno(), Contenido.getActores());
        this.duracion =duracion;
        this.director = director;

    }


    
    
}
