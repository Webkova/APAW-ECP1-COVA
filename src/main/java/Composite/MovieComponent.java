package Composite;

public abstract class MovieComponent {
//    private String name;
//
//    public MovieComponent(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }

    public abstract void add(MovieComponent cc);

    public abstract void remove(MovieComponent cc);

    public abstract boolean isComposite();

    public abstract String view();

}
