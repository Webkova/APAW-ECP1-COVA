package Composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import movie_original.Movie;


public class MovieComponentTest {
    
    Movie movie1 = new Movie(1);
    Movie movie2 = new Movie(2);
    Movie movie3 = new Movie(3);
    Movie movie4 = new Movie(4);
    
    private MovieComponent root;

    private MovieComponent leaf;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {
        
        movie1.setTitle("Blade runner 2049");
        movie2.setTitle("Star wars VIII");
        movie3.setTitle("War for the Planet of the Apes");
        movie4.setTitle("Alien: Covenant");
        
        this.root = new MovieComposite(movie1);

        this.leaf = new MovieLeaf(movie2);
        this.root.add(leaf);
        this.root.add(new MovieLeaf(movie3));


    }


    @Test
    public void testIDLeaf() {
        assertEquals("2", this.leaf.view());
    }
    
    @Test
    public void testTitleComposite() {
        assertEquals("Blade runner 2049", this.root.view());
    }
    
    @Test
    public void isComposite() {
        assertFalse(this.leaf.isComposite());
        assertTrue(this.root.isComposite());
    }
    

    @Test
    public void testAddLeaf() {
        exception.expect(UnsupportedOperationException.class);
        this.leaf.add(new MovieLeaf(movie4));
    }

}
