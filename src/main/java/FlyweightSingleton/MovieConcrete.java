package FlyweightSingleton;

import movie_original.Director;
import movie_original.Genre;

public class MovieConcrete {
    private Long id;
    private String title;
    private int debut;
    
    Director director;
    Genre genre;

    public MovieConcrete(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }
   
    public void setDirector(Director dir){
        this.director = dir;       
    }
    
    public void setGenre(Genre gen){
        genre = gen;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public Genre getGenre(){
        return genre;
    }
}
