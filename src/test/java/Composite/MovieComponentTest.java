package Composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import composite.MovieComponent;
import composite.MovieComposite;
import composite.MovieLeaf;
import movie_original.Movie;

public class MovieComponentTest {
    private MovieComponent root;

    private MovieComponent sub1;

    private MovieComponent leaf;

    Movie movie4 = new Movie(4);

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {

        Movie movie1 = new Movie(1);
        Movie movie2 = new Movie(2);

        this.root = new MovieComposite("raiz");
        this.leaf = new MovieLeaf(movie1);
        this.root.add(leaf);
        this.sub1 = new MovieComposite("sub1");
        this.root.add(sub1);
        this.root.add(new MovieLeaf(movie2));

    }

    @Test
    public void testIDLeaf() {
        assertEquals("1", this.leaf.view());
    }

    @Test
    public void testNameComposite() {
        assertEquals("MovieTree[raiz]", this.root.view());
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
