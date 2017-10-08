package flyweightSingleton;

import java.util.HashMap;
import java.util.Map;

import movie_original.Movie;



public class Factory {
    private static final Factory factory = new Factory(); 
   
    private final Map<Long, Movie> map = new HashMap<>();

    private Factory(){
        
    }
    
    public static Factory getFactory() {
        return factory;
    }


    public Movie get(Long id) {
        return map.get(id);
    }
    

    public void set(Long id, Movie movie){
        map.put(id, movie);
    }
}
