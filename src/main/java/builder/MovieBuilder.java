package builder;

import movie_original.Director;
import movie_original.Genre;
import movie_original.Movie;

public class MovieBuilder {

    private Movie movie;

    private Director director;

    public MovieBuilder id(long id) {
        this.movie = new Movie(id);
        return this;
    }

    public MovieBuilder title(String title) {
        this.movie.setTitle(title);
        return this;
    }

    public MovieBuilder debut(int debut) {
        this.movie.setDebut(debut);
        return this;
    }

    public MovieBuilder DirectorName(String directorName) {
        this.director = new Director();
        this.movie.setDirector(director);
        this.movie.setDirectorName(directorName);
        return this;
    }

    public MovieBuilder DirectorLevel(int directorLevel) {
        this.movie.setDirectorLevel(directorLevel);
        return this;
    }

    public MovieBuilder Genre(Genre gen) {
        this.movie.setGenre(gen);
        return this;
    }

    public Movie build() {
        return this.movie;
    }

}
