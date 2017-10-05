package Composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MovieComponentTest {

    private MovieComponent root;

    private MovieComponent sub1;

    private MovieComponent sub11;

    private MovieComponent sub12;

    private MovieComponent leaf;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {
        this.root = new MovieComposite(1);

        this.leaf = new MovieLeaf(1);
        this.root.add(leaf);
        this.sub1 = new MovieComposite(1);
        this.root.add(sub1);
        this.root.add(new MovieLeaf(7));

        this.sub11 = new MovieComposite(2);
        this.sub1.add(sub11);
        this.sub1.add(new MovieLeaf(3));
        this.sub12 = new MovieComposite(3);
        this.sub1.add(sub12);

        this.sub11.add(new MovieLeaf(2));
        this.sub11.add(new MovieLeaf(3));

        this.sub12.add(new MovieLeaf(-5));
        this.sub12.add(new MovieLeaf(6));
    }

    

    @Test
    public void testAddLeaf() {
        exception.expect(UnsupportedOperationException.class);
//        this.leaf.add(new MovieLeaf(2));
    }

}
