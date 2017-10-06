package Composite;

import movie_original.Movie;

public class MovieComposite extends MovieComponent {
    private java.util.List<MovieComponent> list;
    private Movie movie;
    
    public MovieComposite(Movie movie) {
        this.list = new java.util.ArrayList<>();
        this.movie = movie;
    }

    
    @Override
    public String view() {
        return this.movie.getTitle();
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
