package es.uah.vsvmgr.javaflix.app;


import java.util.ArrayList;

/**
 *
 * @author marcostuf
 */
public class Pelicula extends Base{
    
    private int duracion;
    private String director;
    
    /**
     *Constructor de la clase Pelicula
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
     *Devuelve la duración en minutos
     * @return int duracion
     */
    public int getDuracion(){
        return duracion;
    }

    /**
     *Permite indicar la duracion en minutos
     * @param duracion int
     */
    public void setDuracion(int duracion){
        this.duracion=duracion;
                }

    /**
     *Devuelve el nombre y apellido del director separados por un espacio
     * @return String director
     */
    public String getDirector(){
        return director;
    }

    /**
     *Permite indicar el nombre y apellido del director separados por un espacio
     * @param director String
     */
    public void setDirector(String director){
        this.director=director;
                }
    public String toString(){
    return "pelicula-"+getTitulo()+"-"+getGenero()+"-"+getAnno()+"-"+getActores().toString()+"-"+getDuracion()+"-"+getDirector()+"-"+getImagenportada()+"-"+getSinopsis();
    }
}

