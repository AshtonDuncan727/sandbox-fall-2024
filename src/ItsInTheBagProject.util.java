import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {
    // Internal ArrayList to store the items
    private ArrayList<T> items;

    // Constructor to initialize the ArrayList
    public Bag() {
        this.items = new ArrayList<>();
    }

    // Implementation of isEmpty() from Container
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Implementation of size() from Container
    @Override
    public int size() {
        return items.size();
    }

    // Implementation of add() from Container
    @Override
    public void add(T item) {
        items.add(item);
    }

    // Implementation of iterator() from Iterable
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    // Extra Credit: Implement forEach method
    @Override
    public void forEach(Consumer<? super T> action) {
        items.forEach(action);
    }

    // Extra Credit: Implement spliterator method
    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }
}