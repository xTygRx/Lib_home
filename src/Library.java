import java.util.ArrayList;
import java.util.List;

public class Library {
    protected List<LibraryCard<Integer, String>> issuedBooks; // список выданных книг

    public Library() {
        this.issuedBooks = new ArrayList<>();
    }

    // Метод для добавления книги в библиотеку
    public <T> void addBook(Book<T> book, int cardNumber, String author, int year) {
        LibraryCard<Integer, String> card = new LibraryCard<>(cardNumber, "Автор: " + author + ", Год издания: " + year);
        issuedBooks.add(card);
    }

    // Метод для выдачи книги и возврата библиотечной карточки
    public LibraryCard<Integer, String> lendBook(int cardNumber) {
        for (LibraryCard<Integer, String> card : issuedBooks) {
            if (card.getNumberLibraryCard() == cardNumber) {
                return card;
            }
        }
        return null;
    }

    // Метод для вывода информации о всех выданных книгах с их библиотечными карточками
    public void displayIssuedBooks() {
        for (LibraryCard<Integer, String> card : issuedBooks) {
            System.out.println("Номер карты: " + card.getNumberLibraryCard() +  "; Книга: " + card.getBookInfo());
        }
    }
}
