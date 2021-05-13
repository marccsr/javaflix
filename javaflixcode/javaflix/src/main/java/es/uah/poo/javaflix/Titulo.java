package es.uah.poo.javaflix;

import java.util.ArrayList;

public class Titulo {
    private String titulo;
    private String sinopsis;
    private String genero;
    private int anno;
    private ArrayList<Actor> actoresr;
    //añadir imagen de portada

    public Titulo(ArrayList<Actor> actoresr) {
        actoresr= new ArrayList<>();
        this.anno= anno;
        this.sinopsis=sinopsis;
        this.genero=genero;
        this.titulo=titulo;


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
    
    public ArrayList<Actor> getActoresr() {
        return actoresr;
    }
}
