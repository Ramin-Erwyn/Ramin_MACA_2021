package td2.filesystem;

import java.util.List;

public interface Composite<t: T>{

    public abstract List<T> getChildren();
    public abstract void addchild(t: T);
    public abstract boolean removeChild(t: T);
    public abstract boolean removeChildren(t: List<T>);

}
