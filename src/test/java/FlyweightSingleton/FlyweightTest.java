package FlyweightSingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import FlyweightSingleton.*;
import movie_original.Director;




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
    
    
//    @Test
//    public void testGet() {
//        Director director = new Director();
//        director.setName("Denis Villeneuve");
//        MovieConcrete movie = new MovieConcrete(8L);
//        System.out.println(factory.getFactory().get(8L));
////        assertEquals(8L, factory.get(8L).getId());
//    }
//
//    @Test
//    public void testSameObject() {
//        assertSame(factory.get((long) 8), factory.get((long) 8));
//    }



}
