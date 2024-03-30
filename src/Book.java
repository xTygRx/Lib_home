public class Book <T> {
    protected T name;

    public Book(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name=" + name +
                '}';
    }
}
