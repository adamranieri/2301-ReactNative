package FridayAndBeyond.Generics;

// declare this class with the generic type T so we can use it in our code:
// K for key, V for values, T for type
public class Person <T> {
    private String name;
    private T item;

    public Person(String name, T item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
