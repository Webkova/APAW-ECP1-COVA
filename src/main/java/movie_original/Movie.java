package movie_original;

import movie_original.Director;
import movie_original.Genre;

public class Movie {
    
    public long id;
    public String title;
    public int debut;
    
    Director director;
    Genre genre;
    
    
    public Movie(long id){
        this.id = id;
    }
    
    
    public long getId() {
        return id;
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
