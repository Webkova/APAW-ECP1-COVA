package composite;

public abstract class MovieComponent {

    public abstract void add(MovieComponent cc);

    public abstract void remove(MovieComponent cc);

    public abstract boolean isComposite();

    public abstract String view();

}
