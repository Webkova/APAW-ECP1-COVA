package Builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import builder.Director;
import builder.Genre;
import builder.Movie;
import builder.MovieBuilder;


public class MovieTest {

    @Test
    public void testMovie() {
        Director director = new Director();
        director.setName("Denis Villeneuve");

        Movie movie = new MovieBuilder().id(1).Genre(Genre.ACTION).title("Blade runner 2049").debut(2017).Director(director)
                .build();

        assertEquals(1, movie.getId());
        assertEquals("Blade runner 2049",movie.getTitle());
        assertEquals(2017, movie.getDebut());
        assertEquals("Denis Villeneuve", movie.getDirector().getName());
        assertEquals(Genre.ACTION, movie.getGenre());

    }
}
