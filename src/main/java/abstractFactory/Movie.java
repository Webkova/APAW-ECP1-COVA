package abstractFactory;

public class Movie {
    
    private static Movie movie;
    
    public long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String title;
    public int debut;
    
    Director director;
    Genre genre;
    
    private Movie(){
        
    }
    
    public static Movie getMovie(){
        return movie;
    }
    
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
