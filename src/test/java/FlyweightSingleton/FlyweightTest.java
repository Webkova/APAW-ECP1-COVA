package FlyweightSingleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;


public class FlyweightTest {
    Factory factory;

    
    @Test
    public void testIsSingleton() {
        assertSame(Factory.getFactory(), Factory.getFactory());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(Factory.getFactory());
    }
    

}
