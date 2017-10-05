package FlyweightSingleton;

import java.util.HashMap;
import java.util.Map;



public class Factory {
    
    private final Map<Long, MovieConcrete> map = new HashMap<>();
    private static final Factory factory = new Factory();
    
    private Factory(){
        
    }
    
    public static Factory getFactory() {
        return factory;
    }


    public MovieConcrete get(Long id) {
        return map.get(id);
    }
}
