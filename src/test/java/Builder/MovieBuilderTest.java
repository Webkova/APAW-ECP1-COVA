package Builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import movie_original.Genre;
import movie_original.Movie;
import builder.MovieBuilder;


public class MovieBuilderTest {

    @Test
    public void testMovie() {
        
        Movie movie = new MovieBuilder().id(1).Genre(Genre.ACTION).title("Blade runner 2049").debut(2017)
                .DirectorName("Denis Villeneuve").DirectorLevel(45)
                .build();
       
        assertEquals(1, movie.getId());
        assertEquals("Blade runner 2049",movie.getTitle());
        assertEquals(2017, movie.getDebut());
        assertEquals("Denis Villeneuve", movie.getDirector().getName());
        assertEquals(1, movie.getDirector().getId());
        assertEquals(45, movie.getDirector().getLevel());
        assertEquals(Genre.ACTION, movie.getGenre());

    }
}
