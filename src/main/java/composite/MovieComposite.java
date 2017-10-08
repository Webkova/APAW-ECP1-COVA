package composite;

public class MovieComposite extends MovieComponent {
    private java.util.List<MovieComponent> list;
    private String name;
    
    public MovieComposite(String name) {
        this.name = name;
        this.list = new java.util.ArrayList<>();
    }


    @Override
    public String view() {
        return "MovieTree[" + name + "]";
    }

    @Override
    public void add(MovieComponent cc) {
        list.add(cc);
    }

    @Override
    public void remove(MovieComponent cc) {
        list.remove(cc);
    }

    @Override
    public boolean isComposite() {
        return true;
    }
    




}
