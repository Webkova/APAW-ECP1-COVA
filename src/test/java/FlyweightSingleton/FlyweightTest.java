package FlyweightSingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import flyweightSingleton.*;
import movie_original.Director;
import movie_original.Movie;




public class FlyweightTest {
        
    @Test
    public void testIsSingleton() {
        assertSame(Factory.getFactory(), Factory.getFactory());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(Factory.getFactory());
    }
    
    
    @Test
    public void testGet() {
        Movie movie = new Movie(8L);
        Factory.getFactory().set(movie.getId(), movie);
        
        assertEquals(8L, Factory.getFactory().get(8L).getId());
    }
    
    
    @Test
    public void testGetDirectorName() {
        Director director = new Director();
        director.setName("Denis Villeneuve");
        Movie movie = new Movie(8L);
        movie.setDirector(director);
 
        Factory.getFactory().set(movie.getId(), movie);

        assertEquals("Denis Villeneuve", Factory.getFactory().get(8L).getDirector().getName());
    }

    @Test
    public void testSameObject() {
        assertSame(Factory.getFactory().get(8L), Factory.getFactory().get(8L));
    }



}
