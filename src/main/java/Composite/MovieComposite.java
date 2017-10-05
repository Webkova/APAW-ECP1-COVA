package Composite;

import movie_original.Director;
import movie_original.Genre;

public class MovieComposite extends MovieComponent {
    private java.util.List<MovieComponent> list;
    
    public long id;
    public String title;
    public int debut;
    
    Director director;
    Genre genre;

    public MovieComposite(long id) {
        this.list = new java.util.ArrayList<>();
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

    @Override
    public String view() {
        return this.getName();
    }

    @Override
    public void add(MovieComponent cc) {
        list.add(cc);
    }

    @Override
    public void remove(MovieComponent cc) {
        list.remove(cc);
    }

    @Override
    public boolean isComposite() {
        return true;
    }


}
