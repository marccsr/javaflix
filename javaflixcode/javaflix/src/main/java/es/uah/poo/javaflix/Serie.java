package es.uah.poo.javaflix;

import java.util.ArrayList;

public class Serie extends Titulo {
    
    private int temporadas;
    private int capitulos;
    
    public Serie(int temporadas, int capitulos, String titulo, String anno, String sinopsis, String genero, int anno, ArrayList<Actor> actoresr) {
        this.temporadas = temporadas;
        this.capitulos = capitulos;
        super(titulo, sinopsis, anno, actoresr, genero);
    }
    
    
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    
}
