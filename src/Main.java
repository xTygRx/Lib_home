//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление книг в библиотеку
        Book<String> book1 = new Book<>("Вишневый сад");
        library.addBook(book1, 1, "Антон Чехов", 1903);

        Book<String> book2 = new Book<>("Русалочка");
        library.addBook(book2, 2, "Ганс Христиан Андерсон", 1836);

        Book<String> book3 = new Book<>("Красная Шапочка");
        library.addBook(book1, 3, "Шарль Перро", 1697);

        Book<String> book4 = new Book<>("Снежная королева");
        library.addBook(book1, 4, "Ганс Христиан Андерсон", 1844);

        LibraryCard<Integer, String> card1 = library.lendBook(1);
        LibraryCard<Integer, String> card2 = library.lendBook(2);
        LibraryCard<Integer, String> card3 = library.lendBook(3);
        LibraryCard<Integer, String> card4 = library.lendBook(4);

        library.displayIssuedBooks();
    }
}