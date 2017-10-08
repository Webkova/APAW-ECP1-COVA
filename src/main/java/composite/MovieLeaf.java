package composite;

import movie_original.Movie;

public class MovieLeaf extends MovieComponent {
    
    private Movie movie;

    public MovieLeaf(Movie movie) {
        super();
        this.movie = movie;
    }


    @Override
    public void add(MovieComponent cc) {
        throw new UnsupportedOperationException("Operación no soportada");
        // Do nothing because is leaf   
    }

    @Override
    public void remove(MovieComponent cc) {
        //Do nothing because is a leaf
        
    }

    @Override
    public boolean isComposite() {
        return false;
    }
    
    @Override
    public String view() {
        return Long.toString(this.movie.getId());
    }
}
