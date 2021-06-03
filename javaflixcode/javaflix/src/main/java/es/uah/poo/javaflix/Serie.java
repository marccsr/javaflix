/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.poo.javaflix;

import java.util.ArrayList;

/**
 *
 * @author MARCOSPC
 */
public class Serie extends Contenido{

    private int temporadas;
    private ArrayList<Capitulo> capitulos;


    public Serie(int temporadas, ArrayList<Capitulo> capitulos) {
        super(Contenido.getTitulo(), Contenido.getSinopsis(), Contenido.getGenero(), Contenido.getAnno(), Contenido.getActores());
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
}
