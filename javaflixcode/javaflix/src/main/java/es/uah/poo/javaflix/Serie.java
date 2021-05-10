package es.uah.poo.javaflix;

public class Serie extends Titulo {
    
    private int temporadas;
    private int capitulos;

    public Serie(int temporadas, int capitulos) {
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }
    
    public Serie(Titulo serie){
        super(serie.getTitulo(), serie.setTitulo(String titulo), serie.getSinopsis(), serie.setSinopsis(String sinopsis), serie.getGenero(), serie.setGenero(genero), serie.getAño(), serie.setAño(capitulos), serie.getActoresr());
    
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
