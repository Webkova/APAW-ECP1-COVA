package movie_original;

public class Movie {
    public long id;
    public String title;
    public int debut;
    
    Director director;
    Genre genre;
    
    public void setDirector(Director dir){
        director = dir;       
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
